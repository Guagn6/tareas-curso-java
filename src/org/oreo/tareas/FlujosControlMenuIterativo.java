package org.oreo.tareas;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class FlujosControlMenuIterativo {
    public static void main(String[] args) {

         int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Agregar", 1);
        opciones.put("Actualizar", 2);
        opciones.put("Listar", 3);
        opciones.put("Eliminar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción: ",
                    "Carrito de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción");
            }else {
                opcionIndice = opciones.get(opcion.toString());
            }

            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
                    opcionIndice = 0;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
                    opcionIndice = 0;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Lista de productos: ");
                    opcionIndice = 0;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                    opcionIndice = 0;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Has salido con éxito.");
                    break;
            }
        }while (opcionIndice != 5);
    }
}
