package br.com.cactusdigital.erp.register.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class PublicArea implements Serializable {

    @JsonProperty(value = "cep")
    private String cep;

    @JsonProperty(value = "logradouro")
    private String publicArea;

    @JsonProperty(value = "complemento")
    private String complement;

    @JsonProperty(value = "bairro")
    private String neighborhood;

    @JsonProperty(value = "localidade")
    private String local;

    @JsonProperty(value = "uf")
    private String state;

    private String ibge;

    private String gia;

    @JsonProperty(value = "ddd")
    private String areaCode;

    private String siafi;
}
