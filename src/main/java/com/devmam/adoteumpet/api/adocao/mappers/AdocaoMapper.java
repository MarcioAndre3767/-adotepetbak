package com.devmam.adoteumpet.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devmam.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.devmam.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.devmam.adoteumpet.api.pet.mappers.PetMapper;
import com.devmam.adoteumpet.core.models.Adocao;
import com.devmam.adoteumpet.core.repositories.PetRepository;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;


    public Adocao toModel(AdocaoRequest adocaoRequest) {
        var adocao = new Adocao();
        adocao.setEmail(adocaoRequest.getEmail());
        adocao.setValor(adocaoRequest.getValor());
        adocao.setPet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()));
        
        return adocao;
    }

    
    public AdocaoResponse toResponse(Adocao adocao) {
        var adocaoResponse = new AdocaoResponse();
        adocaoResponse.setId(adocao.getId());
        adocaoResponse.setEmail(adocao.getEmail());
        adocaoResponse.setValor(adocao.getValor());
        adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));

        return adocaoResponse;
    }
   
}
