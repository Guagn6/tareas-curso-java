package org.oreo.tareas;

import java.util.Scanner;

public class ArraysImprimirPromedios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int nPos = 0, nNeg = 0, ceros = 0, numLargo = numeros.length;
        int auxPos = 0, auxNeg = 0;

        for (int i = 0; i < numLargo; i++) {
            System.out.println("Inserte el valor no." + (i + 1) + " una serie de 7 números:");
            numeros[i] = scanner.nextInt();
        }

        for (int numero: numeros) {
            if (numero > 0) {
                nPos += numero;
                auxPos++;
            } else if (numero < 0) {
                nNeg += numero;
                auxNeg++;
            } else if (numero == 0) {
                ceros++;
            }
        }

        System.out.println(" El promedio de números positivos es = " + (nPos / auxPos));
        System.out.println(" El promedio de números negativos es = " + (nNeg / auxNeg));
        System.out.println(" La cantidad de ceros insertados es = " + ceros);
    }
}
