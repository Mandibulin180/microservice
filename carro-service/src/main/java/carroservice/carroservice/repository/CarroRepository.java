package carroservice.carroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import carroservice.carroservice.entities.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Integer> {

    List<Carro> findByusuarioId(int usuarioId);
    
}
