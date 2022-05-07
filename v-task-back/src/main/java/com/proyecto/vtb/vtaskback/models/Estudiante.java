package com.proyecto.vtb.vtaskback.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Estudiante")
public class Estudiante {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String grupo;

    public Estudiante() {

    }

    public Estudiante(String id, String nombre, String apellido, String grupo) {
        this.id       = id;
        this.nombre   = nombre;
        this.apellido = apellido;
        this.grupo    = grupo;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
