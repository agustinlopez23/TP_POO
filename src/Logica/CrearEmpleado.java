package Logica;

import java.util.List;
import java.util.Scanner;

public class CrearEmpleado {

    // Método principal para crear un nuevo empleado
    public void crear(List<Empleado> lista, Scanner scanner) {

        // Mostrar las opciones de tipos de empleados a crear
        System.out.println("Agregar un nuevo empleado");
        System.out.println("1. Programador | 2. QA | 3. Diseñador");
        System.out.print("Ingrese su opción: ");
        String opcion = scanner.next();

        // Seleccionar el tipo de empleado a crear según la opción ingresada
        switch (opcion) {
            case "1" -> crearEmpleado(lista, scanner, new Programador());
            case "2" -> crearEmpleado(lista, scanner, new QA());
            case "3" -> crearEmpleado(lista, scanner, new Diseniador());
            default -> System.out.println("Opción inválida.");
        }
    }

    // Método para crear un empleado específico según su tipo
    private void crearEmpleado(List<Empleado> lista, Scanner scanner,
            Empleado nuevoEmpleado) {
        System.out.print("- Nombre Completo: ");
        nuevoEmpleado.setNombreCompleto(scanner.next());

        System.out.print("- Edad: ");
        nuevoEmpleado.setEdad(scanner.nextInt());

        System.out.print("- DNI: ");
        nuevoEmpleado.setDni(scanner.nextInt());

        System.out.print("- Pago por hora: ");
        nuevoEmpleado.setPagoPorHora(scanner.nextDouble());

        // Si es un Programador, solicitar el lenguaje de programación
        if (nuevoEmpleado instanceof Programador programador) {
            System.out.print("- Lenguaje: ");
            programador.setLenguaje(scanner.next());
        }

        // Agregar el nuevo empleado a la lista
        lista.add(nuevoEmpleado);

        System.out.println("Empleado agregado correctamente.");
    }
}
