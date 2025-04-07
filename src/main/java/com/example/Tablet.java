package com.example;

import java.util.ArrayList;

public class Tablet extends Dispositivo{
    private String resolution;
    private ArrayList<String> accessoryList;

    public Tablet( String resolution) {
        this.accessoryList = new ArrayList<>();
        this.resolution = resolution;
    }

    public Tablet( String resolution, String marca, String memoryRam, String memoryStorage, String procesador, String modelo, int fabricationYear, int precio, int stock, String tipo) {
        super(marca, memoryRam, memoryStorage, procesador, modelo, fabricationYear, precio, stock);
        this.accessoryList = new ArrayList<>();
        this.resolution = resolution;
    }

    public Tablet(ArrayList<String> accessoryList, String resolution, String marca, String memoryRam, String memoryStorage, String procesador, String modelo, int fabricationYear, int precio, int stock, String tipo) {
        super(marca, memoryRam, memoryStorage, procesador, modelo, fabricationYear, precio, stock, tipo);
        this.accessoryList = accessoryList;
        this.resolution = resolution;
    }
    
}
