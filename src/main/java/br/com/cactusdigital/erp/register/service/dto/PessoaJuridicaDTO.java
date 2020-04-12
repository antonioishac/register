package br.com.cactusdigital.erp.register.service.dto;

import java.util.Date;

import br.com.cactusdigital.erp.register.domain.enums.TipoRegimeEnum;

public class PessoaJuridicaDTO {
	
	private Long codigo;	
	private String cnpj;	
	private String nomeFantasia;
	private String inscricaoMunicipal;	
	private String inscricaoEstadual;	
	private Date dataConstituicao;
	private TipoRegimeEnum tipoRegime;	
	private String tipoCrt;
	private String suframa;	
	private PessoaDTO pessoa;	
	
	
	public PessoaJuridicaDTO() {
		
	}
	
	public PessoaJuridicaDTO(		
			Long codigo, 
			String cnpj, 
			String nomeFantasia, 
			String inscricaoMunicipal,
			String inscricaoEstadual, 
			Date dataConstituicao, 
			String tipoRegime, 
			String tipoCrt, 
			String suframa,
			String pessoa) {		
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataConstituicao = dataConstituicao;
		this.tipoRegime = TipoRegimeEnum.parse(tipoRegime);
		this.tipoCrt = tipoCrt;
		this.suframa = suframa;		
		this.pessoa = new PessoaDTO();
		this.pessoa.setNome(pessoa);
	}
	
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
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * @return the inscricaoMunicipal
	 */
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	/**
	 * @param inscricaoMunicipal the inscricaoMunicipal to set
	 */
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	/**
	 * @return the dataConstituicao
	 */
	public Date getDataConstituicao() {
		return dataConstituicao;
	}
	/**
	 * @param dataConstituicao the dataConstituicao to set
	 */
	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
	/**
	 * @return the tipoRegime
	 */
	public TipoRegimeEnum getTipoRegime() {
		return tipoRegime;
	}
	/**
	 * @param tipoRegime the tipoRegime to set
	 */
	public void setTipoRegime(TipoRegimeEnum tipoRegime) {
		this.tipoRegime = tipoRegime;
	}
	/**
	 * @return the tipoCrt
	 */
	public String getTipoCrt() {
		return tipoCrt;
	}
	/**
	 * @param tipoCrt the tipoCrt to set
	 */
	public void setTipoCrt(String tipoCrt) {
		this.tipoCrt = tipoCrt;
	}
	/**
	 * @return the suframa
	 */
	public String getSuframa() {
		return suframa;
	}
	/**
	 * @param suframa the suframa to set
	 */
	public void setSuframa(String suframa) {
		this.suframa = suframa;
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
