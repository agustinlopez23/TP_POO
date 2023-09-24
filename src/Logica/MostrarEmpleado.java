package Logica;

import java.util.List;

public class MostrarEmpleado {

    public void mostrar(List<Empleado> lista) {
        System.out.println("Lista de empleados:");
        System.out.println("--------------------");
        
        // Iterar a través de la lista de empleados y mostrar sus detalles
        for (Empleado empleado : lista) {
            // Mostrar el tipo de empleado (Programador, QA, Diseñador)
            System.out.println("Tipo: " + empleado.getClass().getSimpleName());
            // Mostrar nombre, edad y DNI
            System.out.println("Nombre: " + empleado.getNombreCompleto());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("DNI: " + empleado.getDni());
            System.out.println("Id: " + empleado.getId());


            // Verificar si el empleado es un Programador
            if (empleado instanceof Programador programador) {
                System.out.println("Lenguaje: " + programador.getLenguaje());
            } else if (empleado instanceof QA) {
                // No se agrega información adicional para el rol de QA en este momento
            } else if (empleado instanceof Diseniador) {
                // No se agrega información adicional para el rol de Diseñador en este momento
            }

            System.out.println("--------------------");
        }
    }
}
