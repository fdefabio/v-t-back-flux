package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.Examen;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ExamenRepository extends ReactiveMongoRepository<Examen, String> {
    Flux<Examen> findByIdEstudiante(String id);

}

