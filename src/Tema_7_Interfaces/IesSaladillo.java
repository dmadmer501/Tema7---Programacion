package Tema_7_Interfaces;

public class IesSaladillo {

    public Persona[] createData() {
        Persona[] personal = new Persona[8];
        personal[0] = new Alumno("Maria Espinosa");
        personal[1] = new Alumno("Jose Valverde");
        personal[2] = new Alumno("Juan Ruiz");
        personal[3] = new Alumno("Pepe Ruiz");
        personal[4] = new Alumno("Rosa Mancebo");
        personal[5] = new Profesor("Eva Rojas", 1500);
        personal[6] = new Profesor("Ana Mijas", 1700);
        personal[7] = new Profesor("Javier Cuevas", 1200);
        return personal;
    }

    public void showOrder(Persona[] lista) {
        for (Persona p : lista) {
            System.out.println(p.numberType());
        }
    }

    public void showObjects(Persona[] lista) {
        for (Persona p : lista) {
            System.out.println(p.toString());
        }
    }

    // Recibe Persona[] para evitar el ClassCastException de arrays
    public void processData(Persona[] lista) {
        for (int i = 0; i < lista.length; i++) {
            // Hacemos el casting individual (esto sí es legal y seguro)
            IGestion gestionable = (IGestion) lista[i];
            
            gestionable.validate();

            if (lista[i] instanceof Alumno) {
                Alumno alu = (Alumno) lista[i];
                for (int n = 1; n <= i; n++) {
                    alu.addNota(n * 2.5);
                }
            } else if (lista[i] instanceof Profesor) {
                Profesor prof = (Profesor) lista[i];
                prof.subirSueldo(i * 10.0);
            }
        }
    }

    public static void main(String[] args) {
        IesSaladillo app = new IesSaladillo();
        Persona[] datos = app.createData();

        System.out.println("--- MOSTRANDO ÓRDENES ---");
        app.showOrder(datos);

        System.out.println("\n--- OBJETOS ANTES DE PROCESAR ---");
        app.showObjects(datos);

        // Llamada directa sin casting de array
        app.processData(datos);

        System.out.println("\n--- OBJETOS DESPUÉS DE PROCESAR ---");
        app.showObjects(datos);
    }
}