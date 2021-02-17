package br.com.cactusdigital.erp.register.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="TB_PESSOA")
public class Pessoa {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;

	@NotBlank
	@Column(name="NOME")
	private String name;

	@Column(name="TIPO_PESSOA")
	private String typePerson;

	@Column(name="EMAIL")
	private String email;

	@Column(name="SITE")
	private String site;

	@Column(name="CLIENTE")
	private String client;

	@Column(name="FORNECEDOR")
	private String fornecedor;

	@Column(name="COLABORADOR")
	private String colaborador;

	@Column(name="TRANSPORTADORA")
	private String transportadora;
	
	//@JsonIgnoreProperties("pessoa")
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL)
    //private PessoaFisica pessoaFisica;
	
	//@JsonIgnoreProperties("pessoa")
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL)
    //private PessoaJuridica pessoaJuridica;
    
//	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Contato> contatos;
    
//	@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
//	private List<Endereco> enderecos = new ArrayList<>();
	
	//@JsonIgnoreProperties("pessoa")
	//@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    //private List<Telefone> telefones = new ArrayList<>();

}