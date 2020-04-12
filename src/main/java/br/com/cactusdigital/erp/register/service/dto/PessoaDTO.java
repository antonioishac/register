package br.com.cactusdigital.erp.register.service.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.cactusdigital.erp.register.domain.enums.TipoPessoaEnum;
import lombok.Data;

/**
 * @author Antonio Ishac
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown  = true)
public class PessoaDTO {

	private Long codigo;
	private String nome;
	private TipoPessoaEnum tipoPessoa;
	private String email;
	private String site;
	private String cliente;
	private String fornecedor;
	private String colaborador;
	private String transportadora;
	//private PessoaFisicaDTO pessoaFisica;
	//private PessoaJuridicaDTO pessoaJuridica;

	private List<ContatoDTO> contatos;
	//private List<EnderecoDTO> enderecos;
	//private List<TelefoneDTO> telefones;
}
