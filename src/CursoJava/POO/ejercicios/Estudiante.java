package CursoJava.POO.ejercicios;

public class Estudiante {
    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //Metodos
    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nota: " + getNota());
    }


    public void mostrarResultado() {
        if (nota >= 6.0) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante no aprobo.");
        }
    }

public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Teo", 10.0);
        estudiante.imprimir();
        estudiante.mostrarResultado();
    }
}
