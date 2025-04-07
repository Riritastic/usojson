package com.example;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String numeroContacto;
    private String civilStatus;
    private String ciudad;

    public Cliente(String nombre, String apellido, String ciudad, String civilStatus, String email,  String numeroContacto) {
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.civilStatus = civilStatus;
        this.email = email;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }


    
}
