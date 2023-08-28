package Logica;

import java.util.List;
import java.util.Scanner;

public class CalcularSalario {
    
    public void calcular(List<Empleado> lista, Scanner scanner){
        
        System.out.println("Calcular Sueldo");
        System.out.print("Ingrese dni del empleado: ");
        int dni = scanner.nextInt();
        boolean empleadoEncontrado = false;
        
        // Iterar a través de la lista de empleados para buscar el empleado por DNI
        for (Empleado empleado : lista) {
            
            if (dni == empleado.getDni()){
                empleadoEncontrado = true;
                
                // Mostrar el tipo de empleado y solicitar las horas trabajadas
                System.out.println("Empleado: " + empleado.getClass().getSimpleName());
                System.out.print("Horas trabajadas de " + empleado.getNombreCompleto() + ": ");
                empleado.setHorasTrabajadas(scanner.nextDouble());
                
                // Mostrar el pago por hora y calcular el salario a pagar
                System.out.println("Pago por hora: " + empleado.getPagoPorHora());
                System.out.println("Salario a pagar: " + 
                        empleado.getHorasTrabajadas() * empleado.getPagoPorHora());
                break; // Salir del bucle una vez que se encuentra el empleado
            } 
        }
        
        // Mostrar mensaje si el empleado no se encuentra en la lista
        if (!empleadoEncontrado) {
            System.out.println("No se encontró el empleado.");
        }
        
    }
}
