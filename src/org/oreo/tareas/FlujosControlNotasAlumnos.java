package org.oreo.tareas;

import java.util.Scanner;

public class FlujosControlNotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[20];
        int notasLargo = notas.length;
        double avgMas5 = 0, avgMenos4 = 0, avgTotal = 0;
        int cont5 = 0, cont4 = 0, total1 = 0;

        calificaciones:
        for (int i = 0; i < notasLargo; i++) {
            System.out.println("Inserte las Evaluaciones con valor entre 1.0 y 7.0 " +
                                "de los 20 alumnos (alumno no. " + (i+1) + ")");
            notas[i] = scanner.nextDouble();
            if (notas[i] == 0) {
                System.out.println("Por favor inserte valores entre 1.0 y 7.0");
                main(args);
            }
        }

        for (double nota: notas) {
            avgTotal += nota;
            if (nota == 1.0) {
                total1 ++;
            } else if (nota > 5) {
                avgMas5 += nota;
                cont5 ++;
            } else if (nota < 4) {
                avgMenos4 += nota;
                cont4 ++;
            }
        }

        System.out.println("Las notas mayores a 5 son " + cont5 + ", y su promedio es: " + (avgMas5/cont5));
        System.out.println("Las notas menores a 4 son " + cont4 + ", y su promedio es: " + (avgMenos4/cont4));
        System.out.println("La cantidad de notas 1.0 fue de = " + total1);
        System.out.println("El promedio total del grupo es " + avgTotal/notasLargo);
        System.exit(0);
    }
}
