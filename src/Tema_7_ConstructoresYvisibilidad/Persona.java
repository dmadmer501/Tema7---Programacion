package Tema_7_ConstructoresYvisibilidad;

public class Persona {
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected String nacionalidad;

    // Constructor por defecto explícito
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.sexo = 'U'; // U de Unknown
        this.nacionalidad = "Desconocida";
    }

    // Setters heredables para no repetir código en el Main
    public void setNombre(String n) { 
        this.nombre = n; 
    }
    
    public void setEdad(int e) { 
        this.edad = e; 
    }
    
    public void setSexo(char s) { 
        this.sexo = s; 
    }

    public void setNacionalidad(String n) { 
        this.nacionalidad = n; 
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Nacionalidad: " + nacionalidad;
    }
}


