package com.proyecto.vtb.vtaskback.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
@Document
public class Estudiante implements Serializable {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String grupo;
    private String img;
    private boolean is_admin = false;

    public Estudiante() {

    }
    public Estudiante(String id, String nombre, String apellido,String img, String grupo) {
        this.id       = id;
        this.nombre   = nombre;
        this.apellido = apellido;
        this.grupo    = grupo;
        this.img      = img;


    }
    public boolean isIs_admin() {
        return is_admin;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
