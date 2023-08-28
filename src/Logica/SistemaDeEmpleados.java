package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeEmpleados {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);
        
        // Crear una lista para almacenar empleados
        List<Empleado> lista = new ArrayList<>();
        
        // Crear instancias de las clases relacionadas
        CrearEmpleado crearEmpleado = new CrearEmpleado();
        MostrarEmpleado mostrarEmpleado = new MostrarEmpleado();
        BuscarEmpleado buscarEmpleado = new BuscarEmpleado();
        CalcularSalario calcularSalario = new CalcularSalario();
        Menu menu = new Menu();
        
        // Mostrar un mensaje de inicio
        System.out.println("Sistema de empleados");

        // Ciclo principal del programa
        while (true) {
            // Mostrar el menú y obtener la opción seleccionada
            String opcion = menu.mostrarMenu(scanner);
            
            // Utilizar un switch para manejar la opción seleccionada
            switch (opcion) {
                case "1" -> crearEmpleado.crear(lista, scanner);
                case "2" -> mostrarEmpleado.mostrar(lista);
                case "3" -> buscarEmpleado.buscar(lista, scanner);
                case "4" -> calcularSalario.calcular(lista, scanner);
                case "5" -> {
                    // Mostrar mensaje de salida y cerrar el Scanner
                    System.out.println("Saliendo...");
                    scanner.close();
                    return; // Salir del programa
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}
