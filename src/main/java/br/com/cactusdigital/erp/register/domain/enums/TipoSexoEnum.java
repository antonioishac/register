package br.com.cactusdigital.erp.register.domain.enums;

public enum TipoSexoEnum {
	
	M("Masculino"), F("Feminino");
	
	private String descricao;
	
	TipoSexoEnum(String descricao){
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}	
}
