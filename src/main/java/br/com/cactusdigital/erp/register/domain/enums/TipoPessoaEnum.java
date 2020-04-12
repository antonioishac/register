package br.com.cactusdigital.erp.register.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TipoPessoaEnum {

	FISICA("F", "Física"),
	JURIDICA("J", "Jurídica");

	@Getter
	private String codigo;

	@Getter
	private String descricao;

}
