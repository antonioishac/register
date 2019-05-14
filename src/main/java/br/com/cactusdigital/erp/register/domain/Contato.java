package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_CONTATO")
public class Contato implements Serializable {
	
	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = 2763013374079744230L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long codigo;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="FONE_COMERCIAL")
	private String foneComercial;
	
	@Column(name="FONE_RESIDENCIAL")
	private String foneResidencial;
	
	@Column(name="FONE_CELULAR")
	private String foneCelular;	
	
	@JsonIgnoreProperties("pessoa")
	@ManyToOne
	@JoinColumn(name="CODIGO_PESSOA")
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
	 * @return the foneComercial
	 */
	public String getFoneComercial() {
		return foneComercial;
	}

	/**
	 * @param foneComercial the foneComercial to set
	 */
	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}

	/**
	 * @return the foneResidencial
	 */
	public String getFoneResidencial() {
		return foneResidencial;
	}

	/**
	 * @param foneResidencial the foneResidencial to set
	 */
	public void setFoneResidencial(String foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	/**
	 * @return the foneCelular
	 */
	public String getFoneCelular() {
		return foneCelular;
	}

	/**
	 * @param foneCelular the foneCelular to set
	 */
	public void setFoneCelular(String foneCelular) {
		this.foneCelular = foneCelular;
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
		Contato other = (Contato) obj;
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
		return "Contato [codigo=" + codigo + ", pessoa=" + pessoa + "]";
	}	
}
