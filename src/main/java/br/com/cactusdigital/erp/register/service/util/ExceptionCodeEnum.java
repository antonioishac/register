package br.com.cactusdigital.erp.register.service.util;

import org.springframework.http.HttpStatus;

public enum ExceptionCodeEnum {

    INTERNAL_SERVER_ERROR( HttpStatus.INTERNAL_SERVER_ERROR),
    ERRO_AO_TENTAR_GRAVAR_CLIENTE( HttpStatus.BAD_REQUEST),
    ERRO_AO_TENTAR_ALTERAR_CLIENTE( HttpStatus.BAD_REQUEST),
    ERRO_AO_TENTAR_REMOVER_CLIENTE(  HttpStatus.BAD_REQUEST),
    CLIENTE_INEXISTENTE( HttpStatus.BAD_REQUEST),
    ERRO_AO_CONSULTAR_API_CEP(HttpStatus.BAD_REQUEST),
    ;

    private HttpStatus httpStatus;

    ExceptionCodeEnum( final HttpStatus httpStatus ) {
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return this.name();
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

}
