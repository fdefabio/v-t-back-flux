package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.Estudiante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends ReactiveMongoRepository<Estudiante, String> {

}
