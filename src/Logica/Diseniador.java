package Logica;

public class Diseniador extends Empleado implements IDiseniador {

    // Constructor por defecto
    public Diseniador() {
        // Llamada al constructor de la clase base (Empleado)
        super();
    }

    // Constructor con parámetros
    public Diseniador(String nombreCompleto, int edad, 
            int dni, double horasTrabajadas, double pagoPorHora) {
        // Llamada al constructor de la clase base (Empleado) con los parámetros proporcionados
        super(nombreCompleto, edad, dni, horasTrabajadas, pagoPorHora);
    }

    // No es necesario añadir más métodos o atributos en esta clase, ya que hereda de Empleado

    @Override
    protected void Saludar() {
      System.out.println("Hola soy un Empleado y estoy saludando");
    }

    @Override
    public void diseniar() {
        System.out.println("Hola soy un diseniador y estoy diseniando");
    }

    

    
    
}
