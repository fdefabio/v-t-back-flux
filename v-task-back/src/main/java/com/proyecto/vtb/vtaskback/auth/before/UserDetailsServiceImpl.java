package com.proyecto.vtb.vtaskback.auth.before;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        if(userRepository.findById(id).equals(id)){
            return this.userBulider(id, new BCryptPasswordEncoder().encode("123456"), "ADMIN");
        }
        return null;
    }

    private User userBulider(String username, String password, String... roles){
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        List<GrantedAuthority> authorities = new ArrayList<>();

        for (String role : roles){
            authorities.add(new SimpleGrantedAuthority("ROLE" + role));
        }
        return new User( username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
*/