package br.com.cactusdigital.erp.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.register.domain.Telefone;

/**
 * @author Antonio
 *
 */
@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
