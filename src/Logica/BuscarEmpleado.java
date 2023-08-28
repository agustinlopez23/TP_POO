package Logica;

import java.util.List;
import java.util.Scanner;

public class BuscarEmpleado {
    
    public void buscar(List<Empleado> lista, Scanner scanner) {
        // Solicitar al usuario que ingrese el DNI del empleado a buscar
        System.out.println("Ingrese el dni del empleado: ");
        int dni = scanner.nextInt();

        // Iterar a través de la lista de empleados para buscar el DNI ingresado
        for (Empleado empleado : lista) {
            if (dni == empleado.dni) {
                // Si se encuentra el empleado con el DNI ingresado, mostrar su nombre completo
                System.out.println("Si existe y se llama: " + 
                        empleado.getNombreCompleto());
            } else {
                // Si no coincide con el DNI del empleado actual, mostrar mensaje de no existencia
                System.out.println("No existe");
            }
        }
    }
}