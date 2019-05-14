package br.com.cactusdigital.erp.register.domain;

public enum TipoSangue {
	
	O_POSITIVO("Tipo O+"), O_NEGATIVO("Tipo O-");
	
	private String descricao;
	
	TipoSangue(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

}
