package CursoJava.ParcialGina;
import java.util.ArrayList;

public class ListaLibros {
    public static void main(String[] args) {
        ArrayList<String> libros = new ArrayList<>();
        libros.add("1984");
        listar(libros);
    }

    public static void listar(ArrayList<String> libros) {
        for (String libro : libros) {
            System.out.println(libro);
        }
    }
}

