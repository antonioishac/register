package br.com.cactusdigital.erp.register.exception;

import br.com.cactusdigital.erp.register.config.MessageConfig;
import br.com.cactusdigital.erp.register.config.property.ApiProperties;
import br.com.cactusdigital.erp.register.exception.dto.ApiErrorDTO;
import br.com.cactusdigital.erp.register.exception.dto.ResponseErrorDTO;
import br.com.cactusdigital.erp.register.service.dto.enums.ConstraintEnum;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class APIExceptionCustomHandler extends APIHandler {


	@Autowired
	public APIExceptionCustomHandler(MessageConfig messageConfig, ApiProperties properties){
		this.messageConfig = messageConfig;
		this.properties = properties;
	}

	@ExceptionHandler(ApiException.class)
	public ResponseEntity<ResponseErrorDTO> handleAPIException(final ApiException ex, final ServletWebRequest request) {
		LOG.error(MESSAGE_DEFAULT_EXCEPTION, ex );

		return responseEntity(
				request,
				properties.getVersion(),
				apiErrorDTO(ex.getExceptionCodeEnum()),
				ex.getExceptionCodeEnum().getHttpStatus()
		);
	}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseErrorDTO> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest request) {

    	LOG.error(MESSAGE_DEFAULT_EXCEPTION, ex );

        List<ApiErrorDTO> messages = new ArrayList<>();

        BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fes = bindingResult.getFieldErrors();

        for (FieldError fe : fes) {
            String defaultMessage = fe.getDefaultMessage();
            if (StringUtils.isNotBlank(defaultMessage)) {
                String message = messageConfig.message(defaultMessage);
                messages.add(
                		ApiErrorDTO
                			.builder()
                			.code(defaultMessage)
                			.description(String.format("%s - %s", fe.getField(), message))
                			.build()
                		);
            }
        }
        return responseEntity((ServletWebRequest) request, properties.getVersion(), messages, HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseErrorDTO> handleMethodArgumentNotValid(ConstraintViolationException ex, WebRequest request) {
    	LOG.error(MESSAGE_DEFAULT_EXCEPTION, ex );
    	ConstraintEnum constraint = ConstraintEnum.getConstraint(ex.getConstraintName());
    	String msg = messageConfig.message(constraint.getName());
    	ApiErrorDTO apiErrorDTO = ApiErrorDTO
    								.builder()
    								.code(constraint.getName())
    								.description(msg)
    								.build();
    	return responseEntity((ServletWebRequest)request, properties.getVersion(),apiErrorDTO,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
