package com.example;

public class Dispositivo {
    private String marca;
    private String memoryRam;
    private String memoryStorage;
    private String procesador;
    private String modelo;
    private int fabricationYear;
    private int precio;
    private int stock;
    private String tipo;

    public Dispositivo( String marca, String memoryRam,  String memoryStorage, String procesador,  String modelo,  int fabricationYear,  int precio, int stock ){
        this.marca = marca;
        this.memoryRam = memoryRam;
        this.memoryStorage = memoryStorage;
        this.procesador = procesador;
        this.modelo = modelo;
        this.fabricationYear = fabricationYear;
        this.precio = precio;
        this.stock = stock;
        this.tipo = "generico";
    }
    public Dispositivo( String marca, String memoryRam,  String memoryStorage, String procesador,  String modelo,  int fabricationYear,  int precio, int stock , String tipo ){
        this.marca = marca;
        this.memoryRam = memoryRam;
        this.memoryStorage = memoryStorage;
        this.procesador = procesador;
        this.modelo = modelo;
        this.fabricationYear = fabricationYear;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
    }
    public Dispositivo(){
        this.marca = "";
        this.memoryRam = "";
        this.memoryStorage = "";
        this.procesador = "";
        this.modelo = "";
        this.fabricationYear = 9999;
        this.precio = 0;
        this.stock = 0;
        this.tipo = "generico";
    }
    public void setMarca ( String marca){
        this.marca = marca;
    }
    public void setRam( String memoryRam){
        this.memoryRam = memoryRam;
    }
    public void setStorage ( String memoryStorage){
        this.memoryStorage = memoryStorage;
    }
    public void setProcesador ( String procesador){
        this.procesador = procesador;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setFabricationYear(int fabricationYear){
        this.fabricationYear = fabricationYear;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void additionalStock(int numero){
        this.stock +=numero;
    }
    public void reduceStock(int numero){
        this.stock -=numero;
    }
    //idealmente crearia un "toString()" que lea los elementos aqui, y usar ese metodo en
    //las herencias subsiguientes, asi pudiendo hacer texto toda la informacion
    //con esta clase siendo la base, el manejo de productos es facil
}

