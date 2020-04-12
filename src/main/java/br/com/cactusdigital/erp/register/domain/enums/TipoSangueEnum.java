package br.com.cactusdigital.erp.register.domain.enums;

public enum TipoSangueEnum {
	
	O_POSITIVO("Tipo O+"), O_NEGATIVO("Tipo O-");
	
	private String descricao;
	
	TipoSangueEnum(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

}
