package com.proyecto.vtb.vtaskback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class ExamenRealizado {

    @Id
    private String id;
    private String titulo;
    private String nota;
    private List <Pregunta> pregunta = new ArrayList<>();
    private String comentarioDocente;
    private String usuarioId;
    private String descripcion;
    private String grupo;



    public ExamenRealizado(String titulo, String id, String nota, List<Pregunta> pregunta, String comentarioDocente, String usuarioId, String descripcion, String grupo) {
        this.id = id;
        this.titulo = titulo;
        this.nota = nota;
        this.pregunta = pregunta;
        this.comentarioDocente = comentarioDocente;
        this.usuarioId = usuarioId;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    public ExamenRealizado() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public List<Pregunta> getPregunta() {
        return pregunta;
    }

    public void setPregunta(List<Pregunta> pregunta) {
        this.pregunta = pregunta;
    }


    public String getComentarioDocente() {
        return comentarioDocente;
    }

    public void setComentarioDocente(String comentarioDocente) {
        this.comentarioDocente = comentarioDocente;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
