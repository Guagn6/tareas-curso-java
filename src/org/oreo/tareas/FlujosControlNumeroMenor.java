package org.oreo.tareas;

import java.util.Scanner;

public class FlujosControlNumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[12];
        int numLargo = numeros.length, numMenor = 0;
        for (int i = 0; i < numLargo; i++) {
            System.out.println("Inserte 12 numeros enteros (Valor no. " + (i + 1) + ")");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 1; i < numLargo; i++) {
            if (numeros[i] < numeros[i-1]) {
                numMenor = numeros[i];
            }
        }

        String resultado = numMenor < 10? "El número más pequeño es menor que 10": "El número es menor o igual que 10";
        System.out.println(resultado);
    }
}
