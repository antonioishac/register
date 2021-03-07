package br.com.cactusdigital.erp.register.exception.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

//@Tag(name = "ResponseDTO")
//@Schema( title = "ResponseDTO", description = "Resposta da requisição" )
@Getter
@Setter
public class ResponseDTO<T>  {

	//@Schema( title = "data", description = "Conteúda da resposta da requisição" )
	@JsonInclude(Include.NON_NULL)
	public T data;


	public ResponseDTO() {
	}

	public ResponseDTO( T data ) {
		this();
		this.data = data;
	}

}
