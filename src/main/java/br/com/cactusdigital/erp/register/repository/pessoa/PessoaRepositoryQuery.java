package br.com.cactusdigital.erp.register.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.service.dto.filter.PessoaFilter;

/**
 * @author aishac
 * 
 * Assinatura dos metodos para buscar pessoas.
 *
 */
public interface PessoaRepositoryQuery {
	
	/**
	 * Assinatura para buscar pessoas por filtro.
	 * 
	 * @param PessoaFilter pessoaFilter
	 * @param Pageable pageable
	 * @return Page<Pessoa>
	 */
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable); 

}
