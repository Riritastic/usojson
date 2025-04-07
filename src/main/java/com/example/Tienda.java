package com.example;

import java.util.ArrayList;

public class Tienda {
    private String address;
    ArrayList<Dispositivo> catalogo;
    private ArrayList<Cliente> listaCuentasCliente;

    public Tienda(String address) {
        this.address = address;
        this.catalogo = new ArrayList<>();
        this.listaCuentasCliente = new ArrayList<>();
    }
    public void addProducto( Dispositivo producto){
        this.catalogo.add(producto);
    }




    
}
