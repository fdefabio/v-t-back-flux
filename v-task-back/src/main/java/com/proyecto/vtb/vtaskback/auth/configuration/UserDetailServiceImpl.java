package com.proyecto.vtb.vtaskback.auth.configuration;

/*
import com.proyecto.vtb.vtaskback.auth.models.Usuario;
import com.proyecto.vtb.vtaskback.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.User;
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Mono<Usuario>usuario = userRepository.findById(username);
        UserBuilder builder = null;

        if (usuario != null){
            builder = User.withUsername(username);
            builder.disabled(false);
            builder.password(usuario.block().getPassword());
            builder.authorities(new SimpleGrantedAuthority("ROLE_ADMIN"));

        }else{
            throw new UsernameNotFoundException("usuario no encontrado");
        }

        return builder.build();
    }
}
*/