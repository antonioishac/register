package br.com.cactusdigital.erp.register.service.mapper;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ContatoMapper.class, EnderecoMapper.class })
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

}