package br.com.cactusdigital.erp.register.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.cactusdigital.erp.register.domain.Endereco;
import br.com.cactusdigital.erp.register.service.dto.EnderecoDTO;

@Mapper(componentModel="spring", uses= {})
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco> {
	
	@Override
	@Mapping(target="pessoa", ignore = true)
	EnderecoDTO toDto(Endereco entity);

}
