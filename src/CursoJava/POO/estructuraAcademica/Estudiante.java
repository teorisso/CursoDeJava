package CursoJava.POO.estructuraAcademica;

public class Estudiante extends Persona {
    /*
    Clase Estudiante que hereda de Persona:
    Atributos adicionales: matricula, carrera.
    Métodos:
    Constructor para inicializar los atributos (incluidos los heredados).
    Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
    */

    public static void main(String[] args) {
        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("Juan", "Perez", 25, 123456789, 10.0f, "Ingeniería");
        // Mostramos los atributos del objeto
        estudiante.verAtributos();
    }

    // Atributos adicionales
    private float matricula;
    private String carrera;

    // Constructor para inicializar los atributos (incluidos los heredados).
    public Estudiante(String nombre, String apellido, int edad, int dni, float matricula, String carrera) {
        super(nombre, apellido, edad, dni);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Método getMatricula para obtener la matricula del estudiante
    public float getMatricula() {
        return matricula;
    }

    // Método setMatricula para asignar una nueva matricula al estudiante
    public void setMatricula(float matricula) {
        this.matricula = matricula;
    }

    // Método getCarrera para obtener la carrera del estudiante
    public String getCarrera() {
        return carrera;
    }

    // Método setCarrera para asignar una nueva carrera al estudiante
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}
