package com.proyecto.vtb.vtaskback.auth.repositories;

import com.proyecto.vtb.vtaskback.auth.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Usuario, String> {

    Usuario findByUsername(String username);
}
