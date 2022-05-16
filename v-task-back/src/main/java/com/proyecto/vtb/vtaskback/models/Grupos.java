package com.proyecto.vtb.vtaskback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Grupos {
    @Id
    private String id;
    private String nombreGrupo;
    private String tematica;
    private String creador;
}
