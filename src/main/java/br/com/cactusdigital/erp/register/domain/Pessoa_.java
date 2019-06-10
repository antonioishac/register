package br.com.cactusdigital.erp.register.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {
	
	public static volatile SingularAttribute<Pessoa, Long> codigo;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile SingularAttribute<Pessoa, String> tipoPessoa;
	public static volatile SingularAttribute<Pessoa, String> email;
	public static volatile SingularAttribute<Pessoa, String> site;
	public static volatile SingularAttribute<Pessoa, String> cliente;
	public static volatile SingularAttribute<Pessoa, String> fornecedor;
	public static volatile SingularAttribute<Pessoa, String> colaborador;
	public static volatile SingularAttribute<Pessoa, String> transportadora;
	public static volatile ListAttribute<Pessoa, Contato> contatos;

}
