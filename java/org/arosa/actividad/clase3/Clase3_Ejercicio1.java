package org.arosa.actividad.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3_Ejercicio1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Jose");
        nombres.add("Nicole");
        nombres.add("Sandra");
        
        List<String> nombresMayuscula = nombres.stream().map((nom) -> nom.toUpperCase()).collect(Collectors.toList());

        System.out.println("nombresMayuscula = " + nombresMayuscula);
    }
}
