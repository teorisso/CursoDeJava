package CursoJava.POO.estructuraAcademica;

public class Empleado extends Persona {
    /*
    Clase Empleado que hereda de Persona:
Atributos adicionales: sueldo, puesto.
Métodos:
Constructor para inicializar los atributos (incluidos los heredados).
Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
     */

    public static void main(String[] args) {
        // Creamos un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan", "Perez", 25, "123456789", 40000, "Ingeniería");
        // Mostramos los atributos del objeto
        empleado.verAtributos();

    }

    // Atributos adicionales
    private float sueldo;
    private String puesto;

    // Constructor para inicializar los atributos (incluidos los heredados).
    public Empleado(String nombre, String apellido, int edad, String dni, float sueldo, String puesto) {
        super(nombre, apellido,edad, Integer.parseInt(dni));
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    // Método getSueldo para obtener el sueldo del empleado


    // Constructor para inicializar los atributos (incluidos los heredados).
    public Empleado(String nombre, String apellido, int edad, int dni, float sueldo, String puesto) {
        super(nombre, apellido, edad, dni);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    // Método getSueldo para obtener el sueldo del empleado
    public float getSueldo() {
        return sueldo;
    }

    // Método setSueldo para asignar un nuevo sueldo al empleado
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    // Método getPuesto para obtener el puesto del empleado
    public String getPuesto() {
        return puesto;
    }

    // Método setPuesto para asignar un nuevo puesto al empleado
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    // Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Sueldo: " + getSueldo());
        System.out.println("Puesto: " + getPuesto());
    }

}