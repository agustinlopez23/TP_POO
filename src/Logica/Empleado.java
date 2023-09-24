package Logica;

public abstract class Empleado {
     // Atributo estático para llevar el conteo de IDs
    protected static int contadorId = 1;
    // Atributos protegidos que describen un empleado
    protected int id;
    protected String nombreCompleto;
    protected int edad;
    protected int dni;

   
    protected double horasTrabajadas;
    protected double pagoPorHora;

    // Constructor por defecto
    public Empleado() {
        // No hace nada, los atributos se inicializan con valores predeterminados
        this.id = contadorId++;
    }

    // Constructor con parámetros
    public Empleado(String nombreCompleto, int edad, int dni, 
            double horasTrabajadas, double pagoPorHora) {
        // Incrementa el contador de ID y lo asigna al atributo id
        this.id = contadorId++;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    // Métodos getter y setter para cada atributo
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

  public int getId() {
        return id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    
   protected abstract void Saludar();
}
