package br.com.cactusdigital.erp.register.service;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cepService", url = "https://viacep.com.br/ws")
public interface CepService {

    @GetMapping(value = "/{cep}/json")
    Response getCep(@PathVariable("cep") String cep);

}
