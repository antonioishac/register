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

import br.com.cactusdigital.erp.register.domain.enums.TipoRegimeEnum;

/**
 * 
 * Registrat informacoes sobre pessoa juridica, espelho da tabela TB_PESSOA_JURIDICA da base de dados
 * 
 * @author Antonio
 *
 */
@Entity
@Table(name="TB_PESSOA_JURIDICA")
public class PessoaJuridica implements Serializable {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -7216959789475545282L;
	
	/**
	 * Codigo sequencial da tabela de pessoa juridica
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long codigo;
	
	/**
	 * Informacao do CNPJ da pessoa juridica
	 */
	@NotNull
	@Column(name="CNPJ")
	private String cnpj;
	
	/**
	 * 
	 */
	@NotNull
	@Column(name="NOME_FANTASIA")
	private String nomeFantasia;
	
	/**
	 * Nome fantasia da pessoa juridica
	 */
	@Column(name="INSCRICAO_MUNICIPAL")
	private String inscricaoMunicipal;
	
	/**
	 * Numero da inscricao estadual da pessoa juridica
	 */
	@Column(name="INSCRICAO_ESTADUAL")
	private String inscricaoEstadual;
	
	/**
	 * Data de abertura da empresa
	 */
	@Column(name="DATA_CONSTITUICAO")
	private Date dataConstituicao;
	
	/**
	 * Tipo de regime que a empresa esta constituida
	 */
	@Column(name="TIPO_REGIME")
	@Enumerated(EnumType.STRING)
	private TipoRegimeEnum tipoRegime;
		
	//TODO entender melho o que siginifica o tipo CRT
	@Column(name="TIPO_CRT")
	private String tipoCrt;
	
	/**
	 * SUFRAMA — Superintendência da Zona Franca de Manaus SUFRAMA
	 */
	@Column(name="SUFRAMA")
	private String suframa;
	
	/**
	 * Pessoa vinculada a pessoa juridica
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
		PessoaJuridica other = (PessoaJuridica) obj;
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
		return "PessoaJuridica [codigo=" + codigo + "]";
	}
}
