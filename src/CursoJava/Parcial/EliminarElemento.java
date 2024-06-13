package CursoJava.Parcial;

import java.util.Arrays;

public class EliminarElemento {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        array = eliminarElemento (array, 5);

        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] eliminarElemento(int [] array, int valor) {
        int conteo = 0;
        for (int i:array){
            if(i == valor){
                conteo++;
            }
        }
        if (conteo == 0){
            return array;
        }
        int [] nuevoArray = new int[array.length - conteo];
        int indice = 0;
        for (int i : array){
            if (i != valor){
                nuevoArray[indice++] = i;
            }
        }
        return nuevoArray;
    }
}
