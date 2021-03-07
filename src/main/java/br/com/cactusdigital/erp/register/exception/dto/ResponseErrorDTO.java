package br.com.cactusdigital.erp.register.exception.dto;

//@Tag(name = "ResponseErrorDTO")
//@Schema( name = "ResponseErrorDTO", description = "Resposta de erro da requisição" )
public class ResponseErrorDTO  {


	//@Schema( name = "error", description = "Mensagem de erro da requisição" )
	private APIError error;


	public ResponseErrorDTO( ) {
		this(null);
	}


	public ResponseErrorDTO( APIError error ) {
		this.error = error;
	}


	public APIError getError() {
		return error;
	}


	public void setError(APIError error) {
		this.error = error;
	}


	@Override
	public String toString() {
		return "ResponseErrorDTO [error=" + error + "]";
	}


}
