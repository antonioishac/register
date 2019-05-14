package br.com.cactusdigital.erp.register.domain;

public enum TipoSexo {
	
	M("Masculino"), F("Feminino");
	
	private String descricao;
	
	TipoSexo(String descricao){
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}	
}
