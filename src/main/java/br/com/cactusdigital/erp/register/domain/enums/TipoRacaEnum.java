package br.com.cactusdigital.erp.register.domain.enums;

public enum TipoRacaEnum {
	
	BRANCO("Branco"), PARDO("Pardo"), AFRO_DESCENDENTE("Afro Descendente");
	
	private String descricao;

	TipoRacaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
