package Tema_7_ConstructoresYvisibilidad;

// Profesor.java
public class Profesor extends Persona {
    private double sueldo;

    public Profesor() {
        // Inicializamos sin super(), accediendo a los atributos protected
        this.nombre = "Nuevo Profesor";
        this.sueldo = 0.0;
    }

    public void setSueldo(double s) { this.sueldo = s; }

    @Override
    public String toString() {
        return super.toString() + " | Sueldo: " + sueldo + "€";
    }
}
