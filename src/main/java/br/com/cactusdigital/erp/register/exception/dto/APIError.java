package br.com.cactusdigital.erp.register.exception.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.Tag;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Tag(name = "APIError")
//@Schema(title = "MensagemException", description = "Default response when an exception occurs" )
@Getter
@Setter
@ToString
public class APIError {

	//@Schema( name = "messages", description = "Lista de Mensagens dos erros" )
    private List<ApiErrorDTO> messages;

	//@Schema( name = "status", description = "Code exception" )
    private Integer status;

	@JsonProperty(value = "api-version")
	//@Schema( name = "apiVersion", description = "Application Version" )
    private String apiVersion;

	//@Schema( name = "timestamp", description = "Data e Hora da Ocorrencia" )
	private Long timestamp;

	//@Schema( name = "endpoint", description = "URI Request" )
	private String endpoint;

	//@Schema( name = "method", description = "POST/GET/PUT/DELETE" )
    private String method;

    public APIError() {
    }

    public APIError( final String apiVersion, final Integer status, final ApiErrorDTO message, final String endpoint , final String method ) {
        super();
        this.messages =  new ArrayList<>(Arrays.asList(message));
        this.setEndpoint(endpoint);
        this.method = method;
        this.setStatus(status);
        this.timestamp = System.currentTimeMillis();
        this.apiVersion = apiVersion;
    }

    public APIError(final String apiVersion, final Integer status, final List<ApiErrorDTO> messages, final String endpoint, final String method ) {
    	this(apiVersion, status, ApiErrorDTO.builder().build(), endpoint, method);
    	this.messages =  messages;
    }
}
