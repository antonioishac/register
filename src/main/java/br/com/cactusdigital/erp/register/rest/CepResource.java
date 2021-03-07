package br.com.cactusdigital.erp.register.rest;

import br.com.cactusdigital.erp.register.service.CepService;
import br.com.cactusdigital.erp.register.service.dto.PublicArea;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/ceps")
public class CepResource {

    @Autowired
    private CepService cepService;

    @GetMapping("{cep}")
    public ResponseEntity<PublicArea> getCeo(@PathVariable("cep") String cep) {

        Response responseFeign = cepService.getCep(cep);
        responseFeign.body();

        return ResponseEntity.ok(null);
    }

}
