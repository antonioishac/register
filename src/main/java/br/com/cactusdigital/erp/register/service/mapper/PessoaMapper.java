package br.com.cactusdigital.erp.register.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;

@Mapper(componentModel = "spring", uses = {ContatoMapper.class})
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {
	
	

}