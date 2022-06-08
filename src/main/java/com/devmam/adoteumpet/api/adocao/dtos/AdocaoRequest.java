package com.devmam.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(SnakeCaseStrategy.class) /*$*/
public class AdocaoRequest {

    private String email;

    private BigDecimal valor;

    private Long petId; /*$na solicição será assim: (pet_id)*/
    
}
