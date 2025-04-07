package com.example;

public class Computador extends Dispositivo{
    private String videoCard;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public Computador(String chasis, String fuentePoder, Pantalla pantalla, String videoCard) {
        this.chasis = chasis;
        this.fuentePoder = fuentePoder;
        this.pantalla = pantalla;
        this.videoCard = videoCard;
    }

    public Computador(String chasis, String fuentePoder, Pantalla pantalla, String videoCard, String marca, String memoryRam, String memoryStorage, String procesador, String modelo, int fabricationYear, int precio, int stock, String tipo) {
        super(marca, memoryRam, memoryStorage, procesador, modelo, fabricationYear, precio, stock, tipo);
        this.chasis = chasis;
        this.fuentePoder = fuentePoder;
        this.pantalla = pantalla;
        this.videoCard = videoCard;
    }



    
}
