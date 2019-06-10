package br.com.cactusdigital.erp.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.repository.pessoa.PessoaRepositoryQuery;

/**
 * @author Antonio Ishac
 *
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
