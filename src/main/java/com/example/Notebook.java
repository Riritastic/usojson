package com.example;

public class Notebook extends Dispositivo{
    private String resolution;
    private String keyboardType;
    private String bateria;

    public Notebook(String bateria, String keyboardType, String resolution) {
        this.bateria = bateria;
        this.keyboardType = keyboardType;
        this.resolution = resolution;
    }

    public Notebook(String bateria, String keyboardType, String resolution, String marca, String memoryRam, String memoryStorage, String procesador, String modelo, int fabricationYear, int precio, int stock, String tipo) {
        super(marca, memoryRam, memoryStorage, procesador, modelo, fabricationYear, precio, stock, tipo);
        this.bateria = bateria;
        this.keyboardType = keyboardType;
        this.resolution = resolution;
    }

}
