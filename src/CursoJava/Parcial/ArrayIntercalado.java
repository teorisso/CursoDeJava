package CursoJava.Parcial;
// Define el paquete en el que se encuentra la clase. Los paquetes son utilizados para organizar
// las clases de un proyecto Java.

import java.util.ArrayList;
import java.util.Arrays;
// Importa la clase ArrayList de la biblioteca estándar de Java.
// ArrayList es una implementación de la interfaz List.

public class ArrayIntercalado {
    // Define una clase pública llamada 'ArrayIntercalado'.
    public static void main(String[] args) {
        // Método principal que se ejecuta cuando se inicia el programa.
        Object [] array1 = {"A","B","C"};
        // Declara e inicializa un array de objetos llamado 'array1' con elementos "A", "B" y "C".
        //Utiliza un array de objetos, por que los dos array son de distintos tipos
        Object [] array2 = {1,2,3};
        // Declara e inicializa un array de objetos llamado 'array2' con elementos "1", "2" y "3".
        //Utiliza un array de objetos, por que los dos array son de distintos tipos
        ArrayList<Object> resultado = intercalar(array1, array2);
        // Llama al método 'intercalar' con 'array1' y 'array2' como argumentos y almacena el resultado en 'resultado'.
        System.out.println(resultado);
        // Imprime el contenido del ArrayList 'resultado'. La salida esperada es [A, 1, B, 2, C, 3].
    }

    // Math.min determina cuál es más grande (comentario incorrecto; debería decir "determina cuál
    // es más pequeño").
    public static ArrayList<Object> intercalar(Object[] a1, Object[] a2) {
        // Define un método estático llamado 'intercalar' que toma dos arrays de objetos
        // y devuelve un ArrayList de objetos.
        ArrayList<Object> resultado = new ArrayList<Object>();
        // Crea un nuevo ArrayList para almacenar el resultado de la intercalación.
        int length = Math.min(a1.length, a2.length);
        // Determina la longitud del array más corto entre 'a1' y 'a2'.
        for (int i = 0; i < length; i++) { // Bucle que itera desde 0 hasta 'length - 1'.
            resultado.add(a1[i]); // Añade el elemento 'i' del array 'a1' al ArrayList 'resultado'.
            resultado.add(a2[i]); // Añade el elemento 'i' del array 'a2' al ArrayList 'resultado'.
        }
        if (a1.length > a2.length) { // Si 'a1' es más largo que 'a2'.
            resultado.addAll(Arrays.asList(a1).subList(length, a1.length));
        } else if (a2.length > a1.length) { // Si 'a2' es más largo que 'a1'.
            resultado.addAll(Arrays.asList(a2).subList(length, a2.length));
        }
        return resultado;
        // Devuelve el ArrayList 'resultado' que contiene los elementos intercalados de 'a1' y 'a2'.
    }
}
