package org.oreo.tareas;

import java.util.Scanner;

public class OperadoresGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacidad;
        System.out.println("Inserte la cantidad de gasolina que contiene el tanque (max 70 litros): ");
        capacidad = scanner.nextInt();

        String mensaje =    capacidad == 70 ? "Estanque lleno" :
                            capacidad <= 69 ? "Estanque casi lleno" :
                            capacidad <= 59 ? "Estanque en 3/4" :
                            capacidad <= 39 ? "Estanque a la mitad" :
                            capacidad <= 34 ? "Estanque suficiente" :
                            capacidad <= 19 && capacidad >= 1 ? "Estanque insuficiente" : "Valor Invalido";

        System.out.println(mensaje);
    }
}
