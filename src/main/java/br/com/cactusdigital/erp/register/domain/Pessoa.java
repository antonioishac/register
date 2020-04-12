package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.cactusdigital.erp.register.domain.enums.TipoPessoaEnum;
import lombok.Data;

/**
 * @author Antonio Ishac
 *
 * Classe que representa a tabela TB_PESSOA na base de dados
 */
@Data
@Entity
@Table(name="TB_PESSOA")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 2309291428518603762L;

	/**
	 * Atributo que representa a coluna codigo.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long codigo;

	/**
	 * Atributo que representa a coluna nome.
	 */
	@NotBlank(message = "")
	@Column(name="NOME")
	private String nome;

	/**
	 * Atributo que representa a coluna tipo pessoa.
	 */
	@NotNull(message = "")
	@Column(name="TIPO_PESSOA")
	private TipoPessoaEnum tipoPessoa;

	/**
	 * Atributo que representa a coluna email.
	 */
	@Column(name="EMAIL")
	private String email;

	/**
	 * Atributo que representa a coluna site.
	 */
	@Column(name="SITE")
	private String site;

	/**
	 * Atributo que representa se a pessoa \u00e9 um cliente.
	 */
	@Column(name="CLIENTE")
	private String cliente;

	/**
	 * Atributo que representa se a pessoa \u00e9 um fornecedor.
	 */
	@Column(name="FORNECEDOR")
	private String fornecedor;

	/**
	 * Atributo que representa se a pessoa \u00e9 um colaborador.
	 */
	@Column(name="COLABORADOR")
	private String colaborador;

	/**
	 * Atributo que representa se a pessoa \u00e9 uma trasportadora.
	 */
	@Column(name="TRANSPORTADORA")
	private String transportadora;

	//@JsonIgnoreProperties("pessoa")
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL)
    //private PessoaFisica pessoaFisica;

	//@JsonIgnoreProperties("pessoa")
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL)
    //private PessoaJuridica pessoaJuridica;

	@JsonIgnoreProperties("pessoa")
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contato> contatos;

	@JsonIgnoreProperties("pessoa")
	@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();

	//@JsonIgnoreProperties("pessoa")
	//@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    //private List<Telefone> telefones = new ArrayList<>();


}