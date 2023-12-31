package com.moto.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moto.service.entities.Moto;

@Repository
public interface MotoRepository extends JpaRepository<Moto,Integer> {
    List<Moto>findByusuarioId(int usuarioId);
}
