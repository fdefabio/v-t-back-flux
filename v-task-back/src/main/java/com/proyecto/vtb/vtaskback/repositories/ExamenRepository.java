package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.Examen;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends ReactiveMongoRepository<Examen, String> {
}
