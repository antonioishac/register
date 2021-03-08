package br.com.cactusdigital.erp.register.exception;

import br.com.cactusdigital.erp.register.config.MessageConfig;
import br.com.cactusdigital.erp.register.config.property.ApiProperties;
import br.com.cactusdigital.erp.register.exception.dto.ApiErrorDTO;
import br.com.cactusdigital.erp.register.exception.dto.ResponseErrorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class APIExceptionHandler extends APIHandler {

	@Autowired
	public APIExceptionHandler(MessageConfig messageConfig, ApiProperties properties){
		this.messageConfig = messageConfig;
		this.properties = properties;
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseErrorDTO> handleException(final Exception ex, final ServletWebRequest request) {
		LOG.error(MESSAGE_DEFAULT_EXCEPTION, ex );
		ApiErrorDTO error = ApiErrorDTO
				.builder()
				.code(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
				.description(ex.getMessage())
				.build();
		return responseEntity(request, properties.getVersion(), error ,HttpStatus.BAD_REQUEST);
	}
}
