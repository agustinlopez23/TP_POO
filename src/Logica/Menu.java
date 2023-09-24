package Logica;

import java.util.Scanner;

public class Menu {
    
    // Método para mostrar el menú y obtener la opción ingresada por el usuario
    public String mostrarMenu(Scanner scanner){
        
        // Mostrar las opciones disponibles en el menú
        System.out.println("---------------------------------");
        System.out.println("1. Agregar nuevo empleado.");
        System.out.println("2. Listar empleados");
        System.out.println("3. Buscar empleado por dni");
        System.out.println("4. Calcular salario");
        System.out.println("5. Exportar lista de empleados");
        System.out.println("6. Salir");
        System.out.println("---------------------------------");
        System.out.print("Ingresa tu opción: ");
        
        // Leer la opción ingresada por el usuario y devolverla
        String opcion = scanner.next();
        
        return opcion;
    }
}
