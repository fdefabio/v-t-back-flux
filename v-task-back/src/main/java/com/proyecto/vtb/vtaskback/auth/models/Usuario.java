package com.proyecto.vtb.vtaskback.auth.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String img;
    private String rol;

    public Usuario(String id, String nombre, String apellido, String username, String password, String img, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img      = img;
        this.username = username;
        this.password = password;
        this.rol      = rol;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

