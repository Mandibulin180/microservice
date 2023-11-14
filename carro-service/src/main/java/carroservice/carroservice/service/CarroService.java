package carroservice.carroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carroservice.carroservice.entities.Carro;
import carroservice.carroservice.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    public Carro getCarroById(int id){
        return carroRepository.findById(id).orElse(null);
    }

    public Carro createCarro(Carro carro){
        return carroRepository.save(carro);
    }

    public List<Carro> carrosUsuarioById(int usuarioId){
        return carroRepository.findByusuarioId(usuarioId);
    }
    
}
