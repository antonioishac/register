package br.com.cactusdigital.erp.register.service.dto;

import java.util.Date;

import br.com.cactusdigital.erp.register.domain.enums.TipoRacaEnum;
import br.com.cactusdigital.erp.register.domain.enums.TipoSangueEnum;
import br.com.cactusdigital.erp.register.domain.enums.TipoSexoEnum;

public class PessoaFisicaDTO {
	
	private Long codigo;	
	private String cpf;	
	private String rg;	
	private String orgaoRg;	
	private Date dataEmissaoRg;	
	private Date dataNascimento;	
	private TipoSexoEnum tipoSexo;	
	private String naturalidade;	
	private String nacionalidade;	
	private TipoRacaEnum tipoRaca;	
	private TipoSangueEnum tipoSangue;	
	private String cnhNumero;
	private String cnhCategoria;	
	private Date cnhVencimento;	
	private String tituloEleitoralNumero;
	private Integer tituloEleitoralZona;
	private String tituloEleitoralSessao;
	private String reservistaNumero;
	private Integer reservistaCategoria;
	private String nomeMae;
	private String nomePai;	
	private EstadoCivilDTO estadoCivil;	
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the orgaoRg
	 */
	public String getOrgaoRg() {
		return orgaoRg;
	}
	/**
	 * @param orgaoRg the orgaoRg to set
	 */
	public void setOrgaoRg(String orgaoRg) {
		this.orgaoRg = orgaoRg;
	}
	/**
	 * @return the dataEmissaoRg
	 */
	public Date getDataEmissaoRg() {
		return dataEmissaoRg;
	}
	/**
	 * @param dataEmissaoRg the dataEmissaoRg to set
	 */
	public void setDataEmissaoRg(Date dataEmissaoRg) {
		this.dataEmissaoRg = dataEmissaoRg;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the tipoSexo
	 */
	public TipoSexoEnum getTipoSexo() {
		return tipoSexo;
	}
	/**
	 * @param tipoSexo the tipoSexo to set
	 */
	public void setTipoSexo(TipoSexoEnum tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
	/**
	 * @return the naturalidade
	 */
	public String getNaturalidade() {
		return naturalidade;
	}
	/**
	 * @param naturalidade the naturalidade to set
	 */
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	/**
	 * @return the nacionalidade
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}
	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	/**
	 * @return the tipoRaca
	 */
	public TipoRacaEnum getTipoRaca() {
		return tipoRaca;
	}
	/**
	 * @param tipoRaca the tipoRaca to set
	 */
	public void setTipoRaca(TipoRacaEnum tipoRaca) {
		this.tipoRaca = tipoRaca;
	}
	/**
	 * @return the tipoSangue
	 */
	public TipoSangueEnum getTipoSangue() {
		return tipoSangue;
	}
	/**
	 * @param tipoSangue the tipoSangue to set
	 */
	public void setTipoSangue(TipoSangueEnum tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	/**
	 * @return the cnhNumero
	 */
	public String getCnhNumero() {
		return cnhNumero;
	}
	/**
	 * @param cnhNumero the cnhNumero to set
	 */
	public void setCnhNumero(String cnhNumero) {
		this.cnhNumero = cnhNumero;
	}
	/**
	 * @return the cnhCategoria
	 */
	public String getCnhCategoria() {
		return cnhCategoria;
	}
	/**
	 * @param cnhCategoria the cnhCategoria to set
	 */
	public void setCnhCategoria(String cnhCategoria) {
		this.cnhCategoria = cnhCategoria;
	}
	/**
	 * @return the cnhVencimento
	 */
	public Date getCnhVencimento() {
		return cnhVencimento;
	}
	/**
	 * @param cnhVencimento the cnhVencimento to set
	 */
	public void setCnhVencimento(Date cnhVencimento) {
		this.cnhVencimento = cnhVencimento;
	}
	/**
	 * @return the tituloEleitoralNumero
	 */
	public String getTituloEleitoralNumero() {
		return tituloEleitoralNumero;
	}
	/**
	 * @param tituloEleitoralNumero the tituloEleitoralNumero to set
	 */
	public void setTituloEleitoralNumero(String tituloEleitoralNumero) {
		this.tituloEleitoralNumero = tituloEleitoralNumero;
	}
	/**
	 * @return the tituloEleitoralZona
	 */
	public Integer getTituloEleitoralZona() {
		return tituloEleitoralZona;
	}
	/**
	 * @param tituloEleitoralZona the tituloEleitoralZona to set
	 */
	public void setTituloEleitoralZona(Integer tituloEleitoralZona) {
		this.tituloEleitoralZona = tituloEleitoralZona;
	}
	/**
	 * @return the tituloEleitoralSessao
	 */
	public String getTituloEleitoralSessao() {
		return tituloEleitoralSessao;
	}
	/**
	 * @param tituloEleitoralSessao the tituloEleitoralSessao to set
	 */
	public void setTituloEleitoralSessao(String tituloEleitoralSessao) {
		this.tituloEleitoralSessao = tituloEleitoralSessao;
	}
	/**
	 * @return the reservistaNumero
	 */
	public String getReservistaNumero() {
		return reservistaNumero;
	}
	/**
	 * @param reservistaNumero the reservistaNumero to set
	 */
	public void setReservistaNumero(String reservistaNumero) {
		this.reservistaNumero = reservistaNumero;
	}
	/**
	 * @return the reservistaCategoria
	 */
	public Integer getReservistaCategoria() {
		return reservistaCategoria;
	}
	/**
	 * @param reservistaCategoria the reservistaCategoria to set
	 */
	public void setReservistaCategoria(Integer reservistaCategoria) {
		this.reservistaCategoria = reservistaCategoria;
	}
	/**
	 * @return the nomeMae
	 */
	public String getNomeMae() {
		return nomeMae;
	}
	/**
	 * @param nomeMae the nomeMae to set
	 */
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	/**
	 * @return the nomePai
	 */
	public String getNomePai() {
		return nomePai;
	}
	/**
	 * @param nomePai the nomePai to set
	 */
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	/**
	 * @return the estadoCivil
	 */
	public EstadoCivilDTO getEstadoCivil() {
		return estadoCivil;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivilDTO estadoCivil) {
		this.estadoCivil = estadoCivil;
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
