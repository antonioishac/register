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
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaMapper pessoaMapper;

	@Transactional
	public PessoaDTO save(PessoaDTO pessoaDTO) {		
		Pessoa person = pessoaMapper.toEntity(pessoaDTO);
		
		if (person.getContatos() != null) {
			person.getContatos().forEach(c -> c.setPessoa(person));
		}

		if (person.getEnderecos() != null) {
			person.getEnderecos().forEach(e -> e.setPessoa(person));
		}
		
		Pessoa savePerson = pessoaRepository.save(person);
		return pessoaMapper.toDto(savePerson);
	}

	@Transactional
	public PessoaDTO update(Long codigo, PessoaDTO pessoaDTO) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);		
		PessoaDTO personSaveDTO = pessoaMapper.toDto(pessoaSalva.get());
		
		BeanUtils.copyProperties(pessoaDTO, personSaveDTO, "codigo");
		
		Pessoa pessoaAtualizada = pessoaMapper.toEntity(personSaveDTO);
		
//		if (pessoaAtualizada.getContatos() != null) {
//			pessoaAtualizada.getContatos().forEach(c -> c.setPessoa(pessoaAtualizada));
//		}
		
		pessoaRepository.save(pessoaAtualizada);
		
		return pessoaMapper.toDto(pessoaAtualizada);
	}

	public PessoaDTO buscarPessoaPeloCodigo(Long codigo) {
		return Optional.ofNullable(pessoaMapper.toDto(pessoaRepository.findById(codigo).get())).orElse(null);
	}
	
	public Page<PessoaDTO> filtrarPessoa(PessoaFilter pessoaFilter, Pageable pageable) {
		return toPageObjectDto(pessoaRepository.filtrar(pessoaFilter, pageable));
	}
	
	public Page<PessoaDTO> toPageObjectDto(Page<Pessoa> objects) {
		return objects.map(this::convertToObjectDto);
	}
	
	private PessoaDTO convertToObjectDto(Pessoa pessoa) {
	    return pessoaMapper.toDto(pessoa);
	}

	public void removerPessoa(Long codigo) {
		pessoaRepository.deleteById(codigo);
	}
}
