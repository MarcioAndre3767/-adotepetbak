package com.devmam.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmam.adoteumpet.core.models.Adocao;

import lombok.extern.java.Log;

public interface AdocaoRepository extends JpaRepository <Adocao, Log>{
    
}
