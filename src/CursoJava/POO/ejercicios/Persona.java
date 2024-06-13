package CursoJava.POO.ejercicios;

public class Persona {
    private String nombre;
    private int edadActual;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edadActual = edadActual;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edadActual;
    }

    public void setEdad(int edad) {
        this.edadActual = edadActual;
    }

    public int cumpleaños() {
        int diaActual=11;
        int mesActual=6;
        int añoActual=2024;

        int diaN=25;
        int mesN=8;
        int añoN=1996;

        int edadActual= añoActual - añoN;

        if (mesActual < mesN) {
            edadActual = edadActual - 1;
        }else if (mesActual == mesN) {
            if (diaActual < diaN){
                edadActual = edadActual - 1;
            }
        }

        return edadActual;
    }

    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Edad actual: " + cumpleaños());
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Teo", 25);
        persona.imprimir();
    }
}
