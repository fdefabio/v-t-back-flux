package com.proyecto.vtb.vtaskback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Docente {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String img;


    private boolean is_admin = true;

    public Docente(String id, String nombre, String apellido,  String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img      = img;
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

    public boolean isIs_admin() {
        return this.is_admin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
