package CursoJava.POO.estructuraAcademica;

public class Profesor extends Persona {
    /*
Clase Profesor que hereda de Persona:
Atributos adicionales: materia, antiguedad.
Métodos:
Constructor para inicializar los atributos (incluidos los heredados).
Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
     */

    public static void main(String[] args) {
        // Creamos un objeto de la clase Profesor
        Profesor profesor = new Profesor("Facundo", "Uferer", 20, 123456789, "Programación en JAVA", 10);
        // Mostramos los atributos del objeto
        profesor.verAtributos();

    }

    // Atributos adicionales
    private String materia;
    private int antiguedad;

    // Constructor para inicializar los atributos (incluidos los heredados).
    public Profesor(String nombre, String apellido, int edad, int dni, String materia, int antiguedad) {
        super(nombre, apellido, edad, dni);
        this.materia = materia;
        this.antiguedad = antiguedad;
    }

    // Método getMateria para obtener la materia del profesor
    public String getMateria() {
        return materia;
    }

    // Método setMateria para asignar una nueva materia al profesor
    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Método getAntiguedad para obtener la antiguedad del profesor
    public int getAntiguedad() {
        return antiguedad;
    }

    // Método setAntiguedad para asignar una nueva antiguedad al profesor
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    // Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Materia: " + getMateria());
        System.out.println("Antiguedad: " + getAntiguedad());
    }
}
