package br.com.cactusdigital.erp.register.repository.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import br.com.cactusdigital.erp.register.domain.Contato;
import br.com.cactusdigital.erp.register.domain.Contato_;
import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.domain.Pessoa_;
import br.com.cactusdigital.erp.register.service.dto.filter.PessoaFilter;

public class PessoaRepositoryImpl implements PessoaRepositoryQuery {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable) {
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Pessoa> criteria = builder.createQuery(Pessoa.class);
		Root<Pessoa> root = criteria.from(Pessoa.class);
		
		Predicate[] predicates = criarRestricoes(pessoaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Pessoa> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
				
		return new PageImpl<>(query.getResultList(), pageable, total(pessoaFilter));
	}

	private Predicate[] criarRestricoes(PessoaFilter pessoaFilter, CriteriaBuilder builder, Root<Pessoa> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		ListJoin<Pessoa, Contato> contatos = root.join(Pessoa_.contatos);		
		
		if (!StringUtils.isEmpty(pessoaFilter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Pessoa_.nome)), "%" + pessoaFilter.getNome() + "%"));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getTipoPessoa())) {
			predicates.add(builder.equal(builder.lower(root.get(Pessoa_.tipoPessoa)), pessoaFilter.getTipoPessoa()));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getCliente())) {
			predicates.add(builder.equal(builder.lower(root.get(Pessoa_.cliente)), pessoaFilter.getCliente()));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getFornecedor())) {
			predicates.add(builder.equal(builder.lower(root.get(Pessoa_.fornecedor)), pessoaFilter.getFornecedor()));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getColaborador())) {
			predicates.add(builder.equal(builder.lower(root.get(Pessoa_.colaborador)), pessoaFilter.getColaborador()));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getTransportadora())) {
			predicates.add(builder.equal(builder.lower(root.get(Pessoa_.transportadora)), pessoaFilter.getTransportadora()));
		}
		
		if (!StringUtils.isEmpty(pessoaFilter.getNomeContato())) {
			predicates.add(builder.like(builder.lower(contatos.get(Contato_.nome)), "%" + pessoaFilter.getNomeContato() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<Pessoa> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistroPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistroPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistroPorPagina);
	}
	
	private Long total(PessoaFilter pessoaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Pessoa> root = criteria.from(Pessoa.class);
		
		Predicate[] predicates = criarRestricoes(pessoaFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));		
		return manager.createQuery(criteria).getSingleResult();
	}
	
}
