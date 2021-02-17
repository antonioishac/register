package br.com.cactusdigital.erp.register.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { ContatoMapper.class, EnderecoMapper.class })
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

    @Override
    @Mapping(target = "code", source = "id")
    PessoaDTO toDto(Pessoa entity);

    @Override
    @InheritInverseConfiguration
    Pessoa toEntity(PessoaDTO dto);
}