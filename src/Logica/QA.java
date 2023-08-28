package Logica;

public class QA extends Empleado {

    // Constructor por defecto
    public QA() {
        // Llamada al constructor de la clase base (Empleado)
        super();
    }

    // Constructor con parámetros
    public QA(String nombreCompleto, int edad, int dni, double horasTrabajadas,
            double pagoPorHora) {
        // Llamada al constructor de la clase base (Empleado) con los parámetros proporcionados
        super(nombreCompleto, edad, dni, horasTrabajadas, pagoPorHora);
    }
}
