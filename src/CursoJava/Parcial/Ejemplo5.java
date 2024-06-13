package CursoJava.Parcial;

import java.util.ArrayList;

public class Ejemplo5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int valor = lista.get(2);
        //aca en el parcial esta como lista.get(3); lo cual es un error
        //RESPUESTA CORRECTA
        //c. El índice 3 en lista.get(3) está fuera de los límites del ArrayList.

        System.out.println(valor);
    }
}
