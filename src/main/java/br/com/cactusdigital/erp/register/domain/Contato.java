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
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="TB_CONTATO")
public class Contato implements Serializable {

	private static final long serialVersionUID = 2763013374079744230L;

	@EqualsAndHashCode.Include
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

}
