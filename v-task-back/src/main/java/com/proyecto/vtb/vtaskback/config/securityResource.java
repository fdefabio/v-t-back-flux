/*package com.proyecto.vtb.vtaskback.config;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("authenticated")
@RestController
@RequestMapping
public class securityResource {
    public static final String SECURITY = "/security";
    public static final String ALL      = "/all";
    public static final String USER     = "/user";
    public static final String MANAGER  = "/manager";
    public static final String ADMIN    = "/admin";

    @GetMapping(value="ALL")
    public String all(){
        return "acceso condedido";
    }

    @GetMapping(value="ALL")
    public String getEstudiantes(){
        return "acceso condedido";
    }
}
*/