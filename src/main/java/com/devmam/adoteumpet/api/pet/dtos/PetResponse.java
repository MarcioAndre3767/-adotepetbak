package com.devmam.adoteumpet.api.pet.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetResponse {

    private Long id;
   
    private String nome;
    
    private String historia;
    
    private String foto;
    
}
