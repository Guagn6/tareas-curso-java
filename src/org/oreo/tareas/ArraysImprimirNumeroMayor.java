package org.oreo.tareas;

import java.util.Scanner;

public class ArraysImprimirNumeroMayor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[7];
        int numMayor = 0, numlargo = numeros.length;

        for(int i = 0; i < numlargo; i++) {
            System.out.println("Inserte el valor no. "+ (i + 1) +" de una serie de 7 números y recibirá el mayor de ellos:");
            numeros[i] = scan.nextInt();
        }
            
        for (int i = 0; i < numlargo; i++) {
            numMayor = numMayor > numeros[i] ? numMayor : numeros[i];
        }

        System.out.println("El número mayor es: "+ numMayor);
    }
}
