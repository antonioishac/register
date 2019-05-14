package br.com.cactusdigital.erp.register.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.cactusdigital.erp.register.domain.Contato;
import br.com.cactusdigital.erp.register.service.dto.ContatoDTO;

@Mapper(componentModel="spring", uses= {})
public interface ContatoMapper extends EntityMapper<ContatoDTO, Contato> {
	
	@Override
	@Mapping(target="pessoa", ignore= true)
	ContatoDTO toDto(Contato entity);
	
}
