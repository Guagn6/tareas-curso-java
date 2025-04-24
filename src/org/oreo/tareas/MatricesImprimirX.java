package org.oreo.tareas;

import java.util.Scanner;

public class MatricesImprimirX {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el tamaño de la letra que desea imprimir: ");
        int num = scanner.nextInt();
        char[][] x = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || (j == num - i - 1)) {
                    x[i][j] = 'x';
                } else {
                    x[i][j] = '-';
                }
            }
        }
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
