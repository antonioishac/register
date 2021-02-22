package br.com.cactusdigital.erp.register.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name="TB_ENDERECO")
public class Endereco implements Serializable {

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
	private Integer municipioIbge;
	
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
}
