package br.com.cactusdigital.erp.register.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.repository.PessoaRepository;
import br.com.cactusdigital.erp.register.service.dto.ContatoDTO;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import br.com.cactusdigital.erp.register.service.mapper.PessoaMapper;

@Service
@Transactional
public class PessoaService {

	/**
	 * Injecao do repositorio pessoa
	 */
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaMapper pessoaMapper;
	
	/**
	 * Servico para persistir pessoa
	 * 
	 * @param pessoaDTO
	 * @return
	 */
	public PessoaDTO save(PessoaDTO pessoaDTO) {		
		
		Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);		
		
		pessoa.getContatos().forEach(c -> c.setPessoa(pessoa));
		
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
				
		return pessoaMapper.toDto(pessoaSalva);
	}
	
	private ContatoDTO saveContato(ContatoDTO contatoDTO) {
		return null;
	}
	
}
