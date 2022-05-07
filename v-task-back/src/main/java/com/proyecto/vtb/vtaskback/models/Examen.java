package com.proyecto.vtb.vtaskback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Examen {

    @Id
    private String id;

    private String titulo;
     private Date   fechaPresentacion;
    private String nota;
    private List <Pregunta> pregunta = new ArrayList<>();
    private String comentarioAlumno;
    private String comentarioDocente;
    private String iddocente;
    private String grupo;



    public Examen(String titulo, String id , Date fechaPresentacion, String nota, List<Pregunta> pregunta, String comentarioAlumno, String comentarioDocente, String iddocente, String grupo) {
        this.id = id;
        this.titulo = titulo;
        this.fechaPresentacion = fechaPresentacion;
        this.nota = nota;
        this.pregunta = pregunta;
        this.comentarioAlumno = comentarioAlumno;
        this.comentarioDocente = comentarioDocente;
        this.iddocente = iddocente;
        this.grupo = grupo;
    }

    public Examen() {

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


    public Date getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(Date fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
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

    public String getComentarioAlumno() {
        return comentarioAlumno;
    }

    public void setComentarioAlumno(String comentarioAlumno) {
        this.comentarioAlumno = comentarioAlumno;
    }

    public String getComentarioDocente() {
        return comentarioDocente;
    }

    public void setComentarioDocente(String comentarioDocente) {
        this.comentarioDocente = comentarioDocente;
    }

    public String getIddocente() {
        return iddocente;
    }

    public void setIddocente(String iddocente) {
        this.iddocente = iddocente;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
