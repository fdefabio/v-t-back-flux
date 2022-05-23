/*package com.proyecto.vtb.vtaskback.auth.services;

import com.proyecto.vtb.vtaskback.auth.models.Usuario;
import com.proyecto.vtb.vtaskback.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Override
    public Mono<Usuario> findByusrName(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<Usuario> registrar(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return userRepository.save(usuario);
    }
}
*/