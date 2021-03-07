package br.com.cactusdigital.erp.register.exception;

import br.com.cactusdigital.erp.register.config.MessageConfig;
import br.com.cactusdigital.erp.register.config.property.ApiProperties;
import br.com.cactusdigital.erp.register.exception.dto.APIError;
import br.com.cactusdigital.erp.register.exception.dto.ApiErrorDTO;
import br.com.cactusdigital.erp.register.exception.dto.ResponseErrorDTO;
import br.com.cactusdigital.erp.register.service.util.ExceptionCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Arrays;
import java.util.List;


public class APIHandler {

	protected static final String MESSAGE_DEFAULT_EXCEPTION = "Uma Exception foi lancada:";

	protected static final Logger LOG = LoggerFactory.getLogger(APIHandler.class);

    protected ApiProperties properties;
    protected MessageConfig messageConfig;

    protected ApiErrorDTO apiErrorDTO(ExceptionCodeEnum exceptionCodeEnum) {

    	return ApiErrorDTO
    				.builder()
    				.code( exceptionCodeEnum.getCode() )
    				.description(this.messageConfig.message(exceptionCodeEnum))
    				.build();
    }

	protected ResponseEntity<ResponseErrorDTO> responseEntity(final ServletWebRequest request, String version,
															  ApiErrorDTO message, HttpStatus httpStatus) {
		return responseEntity(request, version, Arrays.asList(message),httpStatus);
	}

	protected ResponseEntity<ResponseErrorDTO> responseEntity(final ServletWebRequest request, String version,
			List<ApiErrorDTO> messages, HttpStatus httpStatus) {

		APIError message =new APIError(version, httpStatus.value(),
				messages,  request.getRequest().getRequestURI(),
				request.getRequest().getMethod());
		return responseEntity(message);

	}

	protected ResponseEntity<ResponseErrorDTO> responseEntity(APIError messages) {
		LOG.info( "{}" , messages );
		ResponseErrorDTO body = new ResponseErrorDTO(messages);
		LOG.info( "{}" , body );
		return ResponseEntity.status(HttpStatus.valueOf(messages.getStatus())).body(body);
	}
}
