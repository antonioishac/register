package br.com.cactusdigital.erp.register.domain.enums;

/**
 * @author Antonio
 *
 */
public enum TipoTelefoneEnum {
	
	RESIDENCIAL(1, "Residencial"), 
	COMERCIAL(2, "Comercial"), 
	PARTICULAR(3, "Particular"), 
	CELULAR(4, "Celular"), 
	OUTROS(5, "Outros");
	
	private Integer codigo;
	private String descricao;
	
	TipoTelefoneEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

}
