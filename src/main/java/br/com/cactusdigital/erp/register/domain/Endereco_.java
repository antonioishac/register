package br.com.cactusdigital.erp.register.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public class Endereco_ {
	
	public static volatile SingularAttribute<Endereco, Long> codigo;
	public static volatile SingularAttribute<Endereco, String> logradouro;
	public static volatile SingularAttribute<Endereco, String> numero;
	public static volatile SingularAttribute<Endereco, String> complemento;
	public static volatile SingularAttribute<Endereco, String> bairro;
	public static volatile SingularAttribute<Endereco, String> cidade;
	public static volatile SingularAttribute<Endereco, String> cep;
	public static volatile SingularAttribute<Endereco, String> municipioIbge;
	public static volatile SingularAttribute<Endereco, String> uf;
	public static volatile SingularAttribute<Endereco, String> principal;
	public static volatile SingularAttribute<Endereco, String> entrega;
	public static volatile SingularAttribute<Endereco, String> cobranca;
	public static volatile SingularAttribute<Endereco, String> correspondencia;
	public static volatile SingularAttribute<Endereco, Pessoa> pessoa;
}
