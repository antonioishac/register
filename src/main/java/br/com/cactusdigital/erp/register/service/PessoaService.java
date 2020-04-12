package br.com.cactusdigital.erp.register.service;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.repository.PessoaRepository;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import br.com.cactusdigital.erp.register.service.dto.filter.PessoaFilter;
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

		if (pessoa.getContatos() != null) {
			pessoa.getContatos().forEach(c -> c.setPessoa(pessoa));
		}

		if (pessoa.getEnderecos() != null) {
			pessoa.getEnderecos().forEach(e -> e.setPessoa(pessoa));
		}

		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		return pessoaMapper.toDto(pessoaSalva);
	}

	public PessoaDTO atualizar(Long codigo, PessoaDTO pessoaDTO) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
		PessoaDTO pessoaSalvaDTO = pessoaMapper.toDto(pessoaSalva.get());

		BeanUtils.copyProperties(pessoaDTO, pessoaSalvaDTO, "codigo");

		Pessoa pessoaAtualizada = pessoaMapper.toEntity(pessoaSalvaDTO);

		if (pessoaAtualizada.getContatos() != null) {
			pessoaAtualizada.getContatos().forEach(c -> c.setPessoa(pessoaAtualizada));
		}

		pessoaRepository.save(pessoaAtualizada);

		return pessoaMapper.toDto(pessoaAtualizada);
	}

	/**
	 * Servico que retorna uma pessoa pelo codigo buscado.
	 *
	 * @param Long codigo
	 * @return PessoaDTO
	 */
	public PessoaDTO buscarPessoaPeloCodigo(Long codigo) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(codigo);
		return pessoaMapper.toDto(pessoa.get());
	}

	public Page<PessoaDTO> filtrarPessoa(PessoaFilter pessoaFilter, Pageable pageable) {
		Page<Pessoa> pessoas = pessoaRepository.filtrar(pessoaFilter, pageable);
		return toPageObjectDto(pessoas);
	}

	public Page<PessoaDTO> toPageObjectDto(Page<Pessoa> objects) {
	    Page<PessoaDTO> dtos  = objects.map(this::convertToObjectDto);
	    return dtos;
	}

	private PessoaDTO convertToObjectDto(Pessoa pessoa) {
	    return pessoaMapper.toDto(pessoa);
	}

	/**
	 * Servico que remove uma pessoa pelo codigo.
	 *
	 * @param Long codigo
	 */
	public void removerPessoa(Long codigo) {
		pessoaRepository.deleteById(codigo);
	}
}
