package br.com.cactusdigital.erp.register.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.cactusdigital.erp.register.service.PessoaService;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import br.com.cactusdigital.erp.register.service.dto.filter.PessoaFilter;

@RestController
@RequestMapping("/api")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping("/pessoa")
	public ResponseEntity<PessoaDTO> create(@RequestBody PessoaDTO pessoaDTO) {
		PessoaDTO pessoa = pessoaService.save(pessoaDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
	}
	
	@PutMapping("/pessoa/{codigo}")
	public ResponseEntity<PessoaDTO> update(@PathVariable Long codigo, @RequestBody PessoaDTO pessoaDTO) {
		PessoaDTO pessoaSalva = pessoaService.update(codigo, pessoaDTO);
		return ResponseEntity.ok(pessoaSalva);
	}

	@GetMapping("/pessoa/{codigo}")
	public ResponseEntity<PessoaDTO> searchPersonByCode(@PathVariable Long codigo) {
		PessoaDTO pessoa = pessoaService.buscarPessoaPeloCodigo(codigo);
		return pessoa == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(pessoa);
	}
	
	@GetMapping("/pessoa/todos")
	public ResponseEntity<Page<PessoaDTO>> listAll(PessoaFilter filter, Pageable pageable) {
		Page<PessoaDTO> pessoas = pessoaService.filtrarPessoa(filter, pageable);
		return pessoas == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(pessoas);
	}

	@DeleteMapping("/pessoa/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removePerson(@PathVariable Long codigo) {
		pessoaService.removerPessoa(codigo);
	}
}
