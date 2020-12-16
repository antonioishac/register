package br.com.cactusdigital.erp.register.service.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author Antonio Ishac
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown  = true)
public class PessoaDTO {

	private Long code;
	private String name;
	private String typePerson;
	private String email;
	private String site;
	private String client;
	private String fornecedor;
	private String colaborador;
	private String transportadora;
	//private PessoaFisicaDTO pessoaFisica;
	//private PessoaJuridicaDTO pessoaJuridica;
	
	private List<ContatoDTO> contatos;
	private List<EnderecoDTO> enderecos;
	//private List<TelefoneDTO> telefones;

}
