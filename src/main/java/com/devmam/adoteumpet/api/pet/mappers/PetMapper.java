package com.devmam.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import com.devmam.adoteumpet.api.pet.dtos.PetResponse;
import com.devmam.adoteumpet.core.models.Pet;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet) {
        var petResponse = new PetResponse();
        petResponse.setId(pet.getId());
        petResponse.setNome(pet.getNome());
        petResponse.setHistoria(pet.getHistoria());
        petResponse.setFoto(pet.getFoto());
        
        return petResponse;
    }

}

/*
 
INSERT INTO pet(nome, historia, foto) VALUES('Joazinho', 'História emocionante', 'http://www.exemplo.com.br/foto.png')

 */
