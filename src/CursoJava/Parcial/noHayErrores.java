package CursoJava.Parcial;
import java.util.Scanner;
import java.util.ArrayList;

public class noHayErrores {
    public static void main(String[] args) {
        ArrayList<String> listaDeElementos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Ingrese un elemento de texto: ");
            String input = sc.nextLine();
            if (input.isEmpty()){
                break;
            }
            listaDeElementos.add(input);
        }
        sc.close();
        System.out.println("Elementos ingresados: ");
        for (String elemento : listaDeElementos){
            System.out.println(elemento);
        }
    }
}
