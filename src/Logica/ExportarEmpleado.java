package Logica;

import java.io.*;
import java.util.List;

public class ExportarEmpleado {
    private String nombreArchivo;

    public ExportarEmpleado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // escribe la ArrayList de empledos en el archivo
    public void exportar(List<Empleado> empleados) {
        // Manejo de errores para el FileWriter 
        try (FileWriter fw = new FileWriter(nombreArchivo)) {
            for (Empleado empleado : empleados) {
                // concatena los datos en un string y los escribe en el archivo
                String empleadoData = formatoEmpleadoData(empleado);
                fw.write(empleadoData);
                fw.write(System.lineSeparator()); //pone el siguiente empleado en otra linea
            }
            System.out.println("Datos exportados correctamente a " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al exportar datos: " + e.getMessage());
        }
    }
    
        // crear el string con los datos para excribir
        private String formatoEmpleadoData(Empleado empleado) {
        return "ID: " + empleado.getId() + "\n | Nombre: " + empleado.getNombreCompleto()
             + "\n | Edad: " + empleado.getEdad() + "\n | DNI: " + empleado.getDni()
             + "\n | Horas Trabajadas: " + empleado.getHorasTrabajadas()
             + "\n | Pago por Hora: " + empleado.getPagoPorHora()
             + "\n";
    }
}
