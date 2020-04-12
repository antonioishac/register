package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.cactusdigital.erp.register.domain.enums.TipoRacaEnum;
import br.com.cactusdigital.erp.register.domain.enums.TipoSangueEnum;
import br.com.cactusdigital.erp.register.domain.enums.TipoSexoEnum;

/**
 * @author Antonio
 *
 * Classe espelho da tabela TB_PESSOA_FISICA da base de dados para gravar os valores referente a pessoa fisica.
 *
 */
@Entity
@Table(name="TB_PESSOA_FISICA")
public class PessoaFisica implements Serializable {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -8850799133679101763L;
	
	/**
	 * Campo codigo da tabela pessoa_fisica, campo anto incremental
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long codigo;
	
	/**
	 * Campo para armazemar o numero do CPF da pessoa fisica
	 */
	@Column(name="CPF")
	private String cpf;
	
	/**
	 * Campo RG para guardar o numero do RG da pessoa fisica
	 */
	@Column(name="RG")
	private String rg;
	
	/**
	 * Campo para armazenar o Orgao expeditor onde foi realizado a expedicao do RG da pessoa fisica 
	 */
	@Column(name="ORGAO_RG")
	private String orgaoRg;
	
	/**
	 * Guarda a data de emissao do RG
	 */
	@Column(name="DATA_EMISSAO_RG")
	private Date dataEmissaoRg;
	
	/**
	 * Data de nascimento da pessoa fisica
	 */
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;
	
	/**
	 * Tipo de sexo da pessoa fisica
	 */
	@Column(name="TIPO_SEXO")
	@Enumerated(EnumType.STRING)
	private TipoSexoEnum tipoSexo;
	
	/**
	 * Naturalidade da pessoa fisica
	 */
	@Column(name="NATURALIDADE")
	private String naturalidade;
	
	/**
	 * Nacionalidade da pessoa fisica
	 */
	@Column(name="NACIONALIDADE")
	private String nacionalidade;
	
	/**
	 * Raca da pessoa fisica
	 */
	@Column(name="TIPO_RACA")
	@Enumerated(EnumType.STRING)
	private TipoRacaEnum tipoRaca;
	
	/**
	 * Tipo sanguinio da pessoa fisica
	 */
	@Column(name="TIPO_SANGUE")
	@Enumerated(EnumType.STRING)
	private TipoSangueEnum tipoSangue;
	
	/**
	 * Numero da CNH, carteira de motorista
	 */
	@Column(name="CNH_NUMERO")
	private String cnhNumero;
	
	/**
	 * Categoria da carteira de motorista
	 */
	@Column(name="CNH_CATEGORIA")
	private String cnhCategoria;
	
	/**
	 * Data de vencimento da carteira de motorista
	 */
	@Column(name="CNH_VENCIMENTO")
	private Date cnhVencimento;
	
	/**
	 * Numero do titulo de eleitor da pessoa fisica
	 */
	@Column(name="TITULO_ELEITORAL_NUMERO")
	private String tituloEleitoralNumero;
	
	/**
	 * Zona eleitoral da pessoa fisica
	 */
	@Column(name="TITULO_ELEITORAL_ZONA")
	private Integer tituloEleitoralZona;
	
	/**
	 * Sessao do titulo do eleitor da pessoa fisica
	 */
	@Column(name="TITULO_ELEITORAL_SESSAO")
	private String tituloEleitoralSessao;
	
	/**
	 * Numero do reservista caso a pessoa fisica for homem
	 */
	@Column(name="RESERVISTA_NUMERO")
	private String reservistaNumero;
	
	/**
	 * Numero da reservista da pessoa fisica
	 */
	@Column(name="RESERVISTA_CATEGORIA")
	private Integer reservistaCategoria;
	
	/**
	 * Nome da mae da pessoa fisica
	 */
	@Column(name="NOME_MAE")
	private String nomeMae;
	
	/**
	 * Nome do pai da pessoa fisica
	 */
	@Column(name="NOME_PAI")
	private String nomePai;
	
	/**
	 * Estado civil da pessoa fisica
	 */
	@NotNull
	@OneToOne
	@JoinColumn(referencedColumnName="codigo", name="CODIGO_ESTADO_CIVIL")
	private EstadoCivil estadoCivil;
	
	/**
	 * referencia da tabela pessoa para pessoa fisica
	 */	
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
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
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
		PessoaFisica other = (PessoaFisica) obj;
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
		return "PessoaFisica [codigo=" + codigo + "]";
	}		
}
