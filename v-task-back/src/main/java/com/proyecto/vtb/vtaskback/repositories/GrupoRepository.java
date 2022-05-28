package com.proyecto.vtb.vtaskback.repositories;

import com.proyecto.vtb.vtaskback.models.Grupos;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GrupoRepository extends ReactiveMongoRepository<Grupos , String> {
}
