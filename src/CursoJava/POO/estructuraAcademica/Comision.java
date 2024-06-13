package CursoJava.POO.estructuraAcademica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Comision {

    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Comision(ArrayList<Estudiante> estudiantes, Profesor profesor) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }

    public void listarComision() {
        System.out.println("!(^^)! 　^_^　( ^)o(^ )　(#^.^#)　(*^。^*)　（*^_^*）　(*^_^*)　(^.^)　(^。^)　");
        System.out.println("El profesor es:");
        profesor.verAtributos();
        System.out.println("Los estudiantes son:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.verAtributos();
            System.out.println("---------------------------------------------------------");
        }
        System.out.println("!(^^)! 　^_^　( ^)o(^ )　(#^.^#)　(*^。^*)　（*^_^*）　(*^_^*)　(^.^)　(^。^)　");
    }

    public void altaEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado correctamente.");
    }

    public void eliminarEstudiante(String nombre) {
        Estudiante estudianteAEliminar = null;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                estudianteAEliminar = estudiante;
                break;
            }
        }
        if (estudianteAEliminar != null) {
            estudiantes.remove(estudianteAEliminar);
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("Estudiante no encontrado, vuelve a probar.");
        }
    }

    public void modificarEstudiante(String nombre, Estudiante estudianteModificado) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.set(i, estudianteModificado);
                System.out.println("Estudiante modificado correctamente.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Comision comision = new Comision(new ArrayList<>(), new Profesor("Facundo", "Uferer", 20, 123456789, "Programación en JAVA", 10));

        comision.altaEstudiante(new Estudiante("Gina", "Grosso", 20, 123456789, 123456789, "Programación en JAVA"));
        comision.altaEstudiante(new Estudiante("Martina", "Canteros", 20, 123456789, 123456789, "Programación en JAVA"));
        comision.altaEstudiante(new Estudiante("Esteban", "Cardozo", 20, 123456789, 123456789, "Programación en JAVA"));
        comision.altaEstudiante(new Estudiante("Maximo", "Masdeu", 20, 123456789, 123456789, "Programación en JAVA"));
        comision.altaEstudiante(new Estudiante("Teo", "Risso", 20, 123456789, 123456789, "Programación en JAVA"));

        while (true) {
            mostrarMenu();
            try {
                System.out.print("Opción: ");
                int opcion = entrada.nextInt();
                entrada.nextLine();  // Consume newline

                switch (opcion) {
                    case 1:
                        comision.listarComision();
                        break;
                    case 2:
                        Estudiante nuevoEstudiante = leerDatosEstudiante(entrada);
                        if (nuevoEstudiante != null) {
                            comision.altaEstudiante(nuevoEstudiante);
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
                        String nombreEliminar = entrada.nextLine();
                        comision.eliminarEstudiante(nombreEliminar);
                        break;
                    case 4:
                        System.out.print("Ingrese el nombre del estudiante a modificar: ");
                        String nombreModificar = entrada.nextLine();
                        Estudiante estudianteModificado = leerDatosEstudiante(entrada);
                        if (estudianteModificado != null) {
                            comision.modificarEstudiante(nombreModificar, estudianteModificado);
                        }
                        break;
                    case 5:
                        System.out.println("¡Vuelva pronto!");
                        entrada.close();
                        return;
                    default:
                        System.out.println("Opción inválida, vuelve a probar.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, vuelve a probar.");
                entrada.nextLine();  // Limpiar la entrada inválida
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Listar Comisión");
        System.out.println("2. Alta Estudiante");
        System.out.println("3. Baja Estudiante");
        System.out.println("4. Modificar Estudiante");
        System.out.println("5. Salir");
    }

    private static Estudiante leerDatosEstudiante(Scanner entrada) {
        try {
            System.out.print("Ingrese nombre del estudiante: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese apellido del estudiante: ");
            String apellido = entrada.nextLine();
            System.out.print("Ingrese edad del estudiante: ");
            int edad = entrada.nextInt();
            entrada.nextLine();  // Consume newline
            System.out.print("Ingrese DNI del estudiante: ");
            int dni = entrada.nextInt();
            entrada.nextLine();  // Consume newline
            System.out.print("Ingrese matrícula del estudiante: ");
            int matricula = entrada.nextInt();
            entrada.nextLine();  // Consume newline
            System.out.print("Ingrese carrera del estudiante: ");
            String carrera = entrada.nextLine();

            return new Estudiante(nombre, apellido, edad, dni, matricula, carrera);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, intente nuevamente.");
            entrada.nextLine();  // Limpiar la entrada inválida
            return null;
        }
    }
}
