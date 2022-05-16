package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.Docente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository  extends ReactiveMongoRepository<Docente, String> {
}
