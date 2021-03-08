package br.com.cactusdigital.erp.register.service;

import br.com.cactusdigital.erp.register.service.dto.PublicArea;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cepService", url = "${cep.service.url}")
public interface CepService {

    @GetMapping(value = "/{cep}/json")
    PublicArea getCep(@PathVariable("cep") String cep);

}
