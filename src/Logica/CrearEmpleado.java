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
        try{
            //arregla el error de la primer linea
            scanner.nextLine();
        
        System.out.print("- Nombre Completo: ");
        String nombreCompleto = scanner.nextLine();

         if (!nombreCompleto.matches("^[a-zA-Z\\s]+$")) {
                throw new IllegalArgumentException("El nombre debe contener solo letras y espacios.");
            }
        nuevoEmpleado.setNombreCompleto(nombreCompleto);

        
        System.out.print("- Edad: ");
        //crea la variable de edad como numero
        int edad;
        //valida que la edad sea un numero y sino cathea el error
        try {
            edad = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La edad debe ser un número");
        }
        nuevoEmpleado.setEdad(edad);

        
        System.out.print("- DNI: ");
        String dniString = scanner.next();

        // Valida que el dni tenga solo numeros
        if (!dniString.matches("^\\d+$")) {
            throw new IllegalArgumentException("El DNI debe contener solo números.");
        }
        
        int dni = Integer.parseInt(dniString);
        nuevoEmpleado.setDni(dni);

        
        System.out.print("- Pago por hora: ");
        double pagoPorHora;

        try {
            pagoPorHora = Double.parseDouble(scanner.next());
        }  catch (NumberFormatException e) {
            throw new IllegalArgumentException("El pago por hora debe ser un número");

        }
        nuevoEmpleado.setPagoPorHora(pagoPorHora);

        
        // Si es un Programador, solicitar el lenguaje de programación
        if (nuevoEmpleado instanceof Programador programador) {
            System.out.print("- Lenguaje: ");
            programador.setLenguaje(scanner.next());
        }

        // Agregar el nuevo empleado a la lista
        lista.add(nuevoEmpleado);

        System.out.println("Empleado agregado correctamente.");
        
        
    }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}