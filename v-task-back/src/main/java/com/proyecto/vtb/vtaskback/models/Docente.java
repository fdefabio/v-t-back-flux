package com.proyecto.vtb.vtaskback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Docente {
    @Id
    private String id;
    private String nombre;
    private String apellido;

    private String username;


    private boolean is_admin = true;

    public Docente(String id, String nombre, String apellido, String username) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }

    public Docente() {
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

    public boolean isIs_admin() {
        return this.is_admin;
    }


}
