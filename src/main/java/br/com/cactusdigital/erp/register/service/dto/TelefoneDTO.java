package br.com.cactusdigital.erp.register.service.dto;

import br.com.cactusdigital.erp.register.domain.TipoTelefone;

public class TelefoneDTO {
		
	private Long codigo;
	private TipoTelefone tipoTelefone;
	private String numero;
	private String observacao;
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
	 * @return the tipoTelefone
	 */
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	/**
	 * @param tipoTelefone the tipoTelefone to set
	 */
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
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
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}
	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
