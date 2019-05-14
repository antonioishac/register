package br.com.cactusdigital.erp.register.service.dto;

public class EnderecoDTO {	
	
	private Long codigo;	
	private String logradouro;	
	private String numero;	
	private String complemento;	
	private String bairro;	
	private String cidade;	
	private String cep;	
	private String municipioIbge;	
	private String uf;	
	private String principal;	
	private String entrega;	
	private String cobranca;	
	private String correspondencia;	
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
	public PessoaDTO getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
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
