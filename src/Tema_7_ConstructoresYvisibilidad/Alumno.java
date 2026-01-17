package Tema_7_ConstructoresYvisibilidad;

public class Alumno extends Persona {
    private boolean repetidor;

    public Alumno() {
        this.nombre = "Nuevo Alumno";
        this.repetidor = false;
    }

    public void setRepetidor(boolean r) { 
        this.repetidor = r; 
    }

    @Override
    public String toString() {
        return super.toString() + " | Repetidor: " + (repetidor ? "Sí" : "No");
    }
}