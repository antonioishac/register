package br.com.cactusdigital.erp.register.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.register.service.PessoaService;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;

@RestController
@RequestMapping("/api")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping("/pessoa")
	public ResponseEntity<PessoaDTO> criar(@RequestBody PessoaDTO pessoaDTO) {
		PessoaDTO pessoa = pessoaService.save(pessoaDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
	}
}
