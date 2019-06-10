package br.com.cactusdigital.erp.register.service.dto.filter;

import java.io.Serializable;
import java.util.List;

import br.com.cactusdigital.erp.register.service.dto.ContatoDTO;

/**
 * @author aishac
 * 
 * Classe filter para buscar pessoas.
 *
 */
public class PessoaFilter implements Serializable {
	
	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -751937236744188229L;
	
	private Long codigo;
	private String nome;
	private String tipoPessoa;
	private String email;
	private String site;
	private String cliente;
	private String fornecedor;
	private String colaborador;
	private String transportadora;
	private String nomeContato;
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
	 * @return the nomeContato
	 */
	public String getNomeContato() {
		return nomeContato;
	}
	/**
	 * @param nomeContato the nomeContato to set
	 */
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
}
