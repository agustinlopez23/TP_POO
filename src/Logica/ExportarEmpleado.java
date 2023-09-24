package Logica;

import java.io.*;
import java.util.List;

public class ExportarEmpleado {
    private String nombreArchivo;

    public ExportarEmpleado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // Export the list of Empleado objects to a text file
    public void exportar(List<Empleado> empleados) {
        try (PrintWriter writer = new PrintWriter(nombreArchivo)) {
            for (Empleado empleado : empleados) {
                writer.println("ID: " + empleado.getId());
                writer.println("Nombre Completo: " + empleado.getNombreCompleto());
                writer.println("Edad: " + empleado.getEdad());
                writer.println("DNI: " + empleado.getDni());
                writer.println("Horas Trabajadas: " + empleado.getHorasTrabajadas());
                writer.println("Pago por Hora: " + empleado.getPagoPorHora());
                if (empleado instanceof Programador programador) {
                    writer.println("Lenguaje: " + programador.getLenguaje());
                }
                writer.println(); // Add an empty line to separate employee records
            }
            System.out.println("Data exported to " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error exporting data: " + e.getMessage());
        }
    }
}
