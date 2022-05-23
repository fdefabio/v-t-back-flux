package com.proyecto.vtb.vtaskback.auth.Controller;

import com.proyecto.vtb.vtaskback.auth.models.AuthRequest;
import com.proyecto.vtb.vtaskback.auth.models.AuthResponse;
import com.proyecto.vtb.vtaskback.auth.models.Usuario;
import com.proyecto.vtb.vtaskback.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.swing.text.Document;
import javax.validation.Valid;


@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuhtController {
    @Autowired
   UserRepository userRepository;

    @PostMapping ("/registrar")
    public ResponseEntity registrar(@RequestBody AuthRequest authRequest){
        String nombre   = authRequest.getNombre();
        String apellido = authRequest.getApellido();
        String img      = authRequest.getImg();
        String username = authRequest.getUsername();
        String password = authRequest.getPassword();

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setImg(img);
        usuario.setPassword(password);
        usuario.setUsername(username);

        try{
            userRepository.save(usuario);
        }catch(Exception e){
            return ResponseEntity.ok(new AuthResponse("Error al crear usuario" + username));
        }
        return ResponseEntity.ok(new AuthResponse("Usuario" + username + "registrado"));
    }

    @PostMapping("/login")
    private ResponseEntity login(@RequestBody AuthRequest authRequest){

    }


}
