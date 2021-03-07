package br.com.cactusdigital.erp.register.exception;

import br.com.cactusdigital.erp.register.service.util.ExceptionCodeEnum;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 5127042490049753890L;
	private final ExceptionCodeEnum exceptionCodeEnum;

	public ApiException(final ExceptionCodeEnum exceptionCodeEnum, final Throwable e) {
		super(e);
		this.exceptionCodeEnum = exceptionCodeEnum;
	}

	public ApiException(final ExceptionCodeEnum exceptionCodeEnum) {
		this(exceptionCodeEnum, null);
	}

	public ExceptionCodeEnum getExceptionCodeEnum() {
		return this.exceptionCodeEnum;
	}
}
