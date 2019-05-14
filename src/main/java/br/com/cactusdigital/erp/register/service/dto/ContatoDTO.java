package br.com.cactusdigital.erp.register.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Antonio
 *
 */
public class ContatoDTO {
		
	private Long codigo;
	private String nome;
	private String email;
	private String foneComercial;
	private String foneResidencial;
	private String foneCelular;
	
	@JsonIgnoreProperties("pessoa")
	private PessoaDTO pessoa;
	
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
	public PessoaDTO getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}	
}
