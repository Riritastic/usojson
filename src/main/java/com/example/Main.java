package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(null, null, null, null, null, null);
        Tienda t1 = new Tienda("pasaje dondesea 234");
        Dispositivo d1 = new Dispositivo(null, null, null, null, null, 0, 0, 0);
        Computador c11 = new Computador(null, null, null, null);
        t1.addProducto(c11);
        t1.addProducto(d1);
        System.out.println(t1.catalogo);
        c11.setFabricationYear(2000);
    }
}