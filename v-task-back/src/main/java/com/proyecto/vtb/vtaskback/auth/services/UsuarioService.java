package com.proyecto.vtb.vtaskback.auth.services;

import com.proyecto.vtb.vtaskback.auth.models.Usuario;
import com.proyecto.vtb.vtaskback.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario findByUsername = userRepository.findByUsername(username);
        if(findByUsername == null){
            return null;
        }else {
            String userName = findByUsername.getUsername();
            String password = findByUsername.getPassword();
            return new User(userName , password , (new ArrayList<>()));
        }
    }
}
