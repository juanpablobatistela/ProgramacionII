package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Arreglos y Listas
 * @author arielp
 */
public class TrabajoPractico1 {
    
    public void ejercicio1() {
        String[] palabras = new String[4];
        palabras[0] = "Esto";
        palabras[1] = "es";
        palabras[2] = "una";
        palabras[3] = "frase";
        System.out.println("tomba");
        System.out.println("Iterando Arreglos forma 1");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Arreglos forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
    public void ejercicio2() {
        List<String> palabras = new ArrayList();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("frase");
        
        System.out.println("Iterando Listas forma 1");
        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Listas forma 2");
        palabras.forEach((palabra) -> {
            System.out.println(palabra);
        });
        
        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<String> iterador = palabras.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
    /**
     * Crear un arreglo de numeros enteros del 1 al 5, recorrerlos y mostralos de las 2 formas
     */
    public void ejercicio3() {
        
        int [] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        System.out.println("Iterando Arreglos forma 1");
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.println(numero);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Arreglos forma 2");
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
    /**
     * Crear una lista de numeros enteros del 1 al 5, recorrerlos y mostarlos de las 3 formas
     */
    public void ejercicio4() {
     
        List<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("Iterando Listas forma 1");
        for (int i = 0; i < numeros.size(); i++) {
            Integer numero = numeros.get(i);
            System.out.println(numero);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Listas forma 2");
        numeros.forEach((numero) -> {
            System.out.println(numero);
        });
        
        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<Integer> iterador = numeros.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
}
}