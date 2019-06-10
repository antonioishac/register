package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Antonio Ishac
 *
 * Classe que representa a tabela TB_PESSOA na base de dados
 */
@Entity
@Table(name="TB_PESSOA")
public class Pessoa implements Serializable {

	/**
	 * Serial UID
	 */
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
	@Column(name="NOME")
	private String nome;

	/**
	 * Atributo que representa a coluna tipo pessoa.
	 */
	@Column(name="TIPO_PESSOA")
	private String tipoPessoa;

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
    
	//@JsonIgnoreProperties("pessoa")
	//@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
	//private List<Endereco> enderecos = new ArrayList<>();
	
	//@JsonIgnoreProperties("pessoa")
	//@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    //private List<Telefone> telefones = new ArrayList<>();

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipoPessoa
	 */
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	/**
	 * @param tipoPessoa the tipoPessoa to set
	 */
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the fornecedor
	 */
	public String getFornecedor() {
		return fornecedor;
	}

	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the colaborador
	 */
	public String getColaborador() {
		return colaborador;
	}

	/**
	 * @param colaborador the colaborador to set
	 */
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	/**
	 * @return the transportadora
	 */
	public String getTransportadora() {
		return transportadora;
	}

	/**
	 * @param transportadora the transportadora to set
	 */
	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}
	
	/**
	 * @return the contatos
	 */
	public List<Contato> getContatos() {
		return contatos;
	}

	/**
	 * @param contatos the contatos to set
	 */
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", email=" + email
				+ ", site=" + site + ", cliente=" + cliente + ", fornecedor=" + fornecedor + ", colaborador="
				+ colaborador + ", transportadora=" + transportadora + "]";
	}	
}