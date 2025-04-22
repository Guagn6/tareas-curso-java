package org.oreo.tareas;

import java.util.Scanner;

public class FlujosControlMultiplicarSinSigno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        System.out.println("Inserte el 1er valor por multiplicar (positivos o negativos): ");
        int valor1 = scanner.nextInt();
        System.out.println("Inserte el 2er valor por multiplicar (positivos o negativos): ");
        int valor2 = scanner.nextInt();

        boolean positivo1 = valor1 > -1;
        boolean positivo2 = valor2 > -1;
        int absoluto1 = Math.abs(valor1);

        for (int i = 0; i < absoluto1; i++) {
            aux = aux + valor2;
        }

        if ((!positivo1 && !positivo2) || !positivo1) {
            aux = -aux;
        }

        System.out.println("Multiplicación de (" + valor1 + ")(" + valor2 + ") = " + aux);
    }
}
