package com.proyecto.vtb.vtaskback.DAO;

import com.proyecto.vtb.vtaskback.models.Estudiante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface EstudianteRepository extends ReactiveMongoRepository<Estudiante, Serializable> {

}
