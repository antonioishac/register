package br.com.cactusdigital.erp.register.exception.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Schema(name = "Api Error", description = "Contém o código e descrição do erro")
public class ApiErrorDTO {

	private String code;

	private String description;
}
