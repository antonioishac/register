package br.com.cactusdigital.erp.register.service.dto;

import java.util.Date;
import br.com.cactusdigital.erp.register.domain.TipoRegime;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class PessoaJuridicaDTO {

	@EqualsAndHashCode.Include
	private Long codigo;	
	private String cnpj;	
	private String nomeFantasia;
	private String inscricaoMunicipal;	
	private String inscricaoEstadual;	
	private Date dataConstituicao;
	private TipoRegime tipoRegime;	
	private String tipoCrt;
	private String suframa;	
	private PessoaDTO pessoa;
}
