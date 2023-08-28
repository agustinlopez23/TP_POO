package Logica;

public class Programador extends Empleado {
    
    private String lenguaje;
// Constructor por defecto
    public Programador() {
    
    }
// Constructor con parámetros para características generales
    public Programador(String nombreCompleto, int edad, int dni, 
            double horasTrabajadas, double pagoPorHora) {
        // Llamada al constructor de la clase base (Empleado) con los parámetros proporcionados
        super(nombreCompleto, edad, dni, horasTrabajadas, pagoPorHora);
    }

// Constructor con parámetro específico (lenguaje de programación)
    public Programador(String lenguaje) {
        this.lenguaje = lenguaje;
    }
// Métodos getter y setter para el lenguaje de programación
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    
}
