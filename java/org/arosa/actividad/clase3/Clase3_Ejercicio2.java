package org.arosa.actividad.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3_Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("María");
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Jose");
        nombres.add("Nicole");
        nombres.add("Alejandro");
        nombres.add("Lola");

        System.out.println(concatenarPalabras(nombres, 6));
    }

    public static String concatenarPalabras(List<String> palabra, int n){
        List<String> pMayuscula = new ArrayList<>();

        palabra.forEach((p) -> {

            if(p.toCharArray().length == n){
                pMayuscula.add(p.toUpperCase());
            }
        });

        return pMayuscula.stream().collect(Collectors.joining(", "));
    }
}
