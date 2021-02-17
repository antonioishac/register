package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_contato")
public class Endereco implements Serializable {
	
	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -2394107876952372334L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	@Column(name="LOGRADOURO")
	private String logradouro;
	
	@Column(name="NUMERO")
	private String numero;
	
	@Column(name="COMPLEMENTO")
	private String complemento;
	
	@NotNull
	@Column(name="BAIRRO")
	private String bairro;
	
	@NotNull
	@Column(name="CIDADE")
	private String cidade;
	
	@NotNull
	@Column(name="CEP")
	private String cep;
	
	@Column(name="MUNICIPIO_IBGE")
	private String municipioIbge;
	
	@NotNull
	@Column(name="UF")
	private String uf;
	
	@NotNull
	@Column(name="PRINCIPAL")
	private String principal;
	
	@NotNull
	@Column(name="ENTREGA")
	private String entrega;
	
	@NotNull
	@Column(name="COBRANCA")
	private String cobranca;
	
	@NotNull
	@Column(name="CORRESPONDENCIA")
	private String correspondencia;
	
	@JsonIgnoreProperties("pessoa")
	@OneToOne
	@JoinColumn(referencedColumnName="codigo", name="CODIGO_PESSOA")
	private Pessoa pessoa;

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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the municipioIbge
	 */
	public String getMunicipioIbge() {
		return municipioIbge;
	}

	/**
	 * @param municipioIbge the municipioIbge to set
	 */
	public void setMunicipioIbge(String municipioIbge) {
		this.municipioIbge = municipioIbge;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the principal
	 */
	public String getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * @return the entrega
	 */
	public String getEntrega() {
		return entrega;
	}

	/**
	 * @param entrega the entrega to set
	 */
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}

	/**
	 * @return the cobranca
	 */
	public String getCobranca() {
		return cobranca;
	}

	/**
	 * @param cobranca the cobranca to set
	 */
	public void setCobranca(String cobranca) {
		this.cobranca = cobranca;
	}

	/**
	 * @return the correspondencia
	 */
	public String getCorrespondencia() {
		return correspondencia;
	}

	/**
	 * @param correspondencia the correspondencia to set
	 */
	public void setCorrespondencia(String correspondencia) {
		this.correspondencia = correspondencia;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
		Endereco other = (Endereco) obj;
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
		return "Endereco [codigo=" + codigo + ", pessoa=" + pessoa + "]";
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
}
