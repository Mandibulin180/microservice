package com.moto.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moto.service.entities.Moto;
import com.moto.service.repository.MotoRepository;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> getAll(){
        return motoRepository.findAll();
    }

    public Moto obtenerMoto(int motoId){
        return motoRepository.findById(motoId).orElse(null);
    }

    public Moto guardarMoto(Moto moto){
        return motoRepository.save(moto);
    }

    public List<Moto> obtenerMotosUsuario(int usuarioId){
        return motoRepository.findByusuarioId(usuarioId);
    }
    
}
