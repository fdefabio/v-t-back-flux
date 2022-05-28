package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.ExamenRealizado;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
@Repository
public interface ExameRealizadoRepository extends ReactiveMongoRepository<ExamenRealizado, String> {
    Flux<ExamenRealizado> findByUsuarioId(String id);
}
