package CursoJava.POO.estructuraAcademica;

public class Persona {
    /*
    Clase Persona:
Atributos: nombre, apellido, dni.
Métodos:
Constructor para inicializar los atributos.
Método verAtributos para mostrar sus atributos en formato texto.
     */

    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona = new Persona("Teo", "Risso", 25, 123456789);
        // Mostramos los atributos del objeto
        persona.verAtributos();
    }

    private String nombre;
    private int edad;
    private String apellido;
    private int dni;

    // Constructor para inicializar los atributos
    public Persona(String nombre, String apellido, int edad,int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Método para mostrar los atributos del objeto
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Método verAtributos para mostrar sus atributos en formato texto

    public void verAtributos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("DNI: " + getDni());

    }

}
