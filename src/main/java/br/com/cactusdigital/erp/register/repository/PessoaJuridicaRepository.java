package br.com.cactusdigital.erp.register.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.register.domain.PessoaJuridica;
import br.com.cactusdigital.erp.register.service.dto.PessoaJuridicaDTO;

/**
 * @author Antonio
 *
 */
@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {

}
