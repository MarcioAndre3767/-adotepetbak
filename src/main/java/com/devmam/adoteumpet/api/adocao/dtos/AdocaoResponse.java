package com.devmam.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import com.devmam.adoteumpet.api.pet.dtos.PetResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdocaoResponse {

    private Long id;
    private String email;
    private BigDecimal valor;
    private PetResponse pet;
    
}
