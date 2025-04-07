package com.example;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class gestorArchivo {

    private static final ObjectMapper mapper = new ObjectMapper();

    // Opción Uno: Utilización de Genéricos

    // Método genérico para guardar un solo algo en un archivo JSON
    public static <T> void guardarClienteGenerico(T cliente, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), cliente);
            System.out.println("Cliente guardado en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar el cliente en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método genérico para guardar una lista de algo en un archivo JSON
    public static <T> void guardarListaClientes(List<T> lista, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), lista);
            System.out.println("Lista de clientes guardada en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar la lista de clientes en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método genérico para leer un solo algo  desde un archivo JSON
    public static <T> T leerClienteGenerico(String nombreArchivo, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File(nombreArchivo), claseTipo);
        } catch (Exception e) {
            System.err.println("Error al leer el cliente desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

    // Método genérico para leer una lista de algo desde un archivo JSON
    public static <T> List<T> leerListaClienteGenerico(String nombreArchivo, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File(nombreArchivo),
                    mapper.getTypeFactory().constructCollectionType(List.class, claseTipo));
        } catch (Exception e) {
            System.err.println("Error al leer la lista de clientes desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

    //mil disculpas por basicamente copiar el script de esto, pero su funcionalidad es
    //perfecta para propositos de tomar una clase y un atributo especifico y cometerlo a json
    
}