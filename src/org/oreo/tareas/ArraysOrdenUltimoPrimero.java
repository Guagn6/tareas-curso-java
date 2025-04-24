package org.oreo.tareas;

import java.util.Scanner;

public class ArraysOrdenUltimoPrimero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] numerosOrden = new int[10];
        int numerosLargo = numeros.length, aux = 0;

        for (int i = 0; i < numerosLargo; i++) {
            System.out.println("Inserte 10 valores numéricos (valor no. " + (i+1) + "): ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < (numerosLargo - i); i++) {
            numerosOrden[aux++] = numeros[numerosLargo -1-i];
            numerosOrden[aux++] = numeros[i];
        }

        for (int num: numerosOrden) {
            System.out.println("num = " + num);
        }
    }
}
