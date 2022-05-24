package com.proyecto.vtb.vtaskback.auth.models;

public class AuthRequest {

    private String nombre;
    private String apellido;
    private String img;
    private String username;
    private String password;

    private String rol;
    private boolean is_admin;
    public AuthRequest() {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public void setIs_admin() {
        if(this.getRol().equals("docente")){
            is_admin = true;
        }else{
            is_admin = false;
        };
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}
