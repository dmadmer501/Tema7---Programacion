package Tema_7_Interfaces;

abstract class Persona implements IValidable {
    protected String nombre;
    protected boolean validado = false;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void validate() {
        this.validado = true;
    }

    public abstract String numberType();

    @Override
    public String toString() {
        String estado = (validado) ? "Sí validado" : "No validado";
        return String.format("%s %s , %s", getClass().getSimpleName(), nombre, estado);
    }
}