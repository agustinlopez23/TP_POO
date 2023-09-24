package Logica;

public class QA extends Empleado implements IQa {

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

    @Override
    protected void Saludar() {
       System.out.println("Hola soy un Empleado y estoy saludando");
    }

    @Override
    public void testear() {
        System.out.println("Hola soy un QA, y estoy testeando");
    }

   
    
}
