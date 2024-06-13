package CursoJava.ParcialGina;
//La ejecución de este programa será la siguiente
//Programa:
public class ConfusionVariables {
    static int contador =10;
    public static void main(String[] args) {
        incrementarContador();
        System.out.println("El valor de contador es: " + contador);
    }
    public static void incrementarContador() {
        int contador = 5;
        contador++;
        System.out.println("El valor de contador local es: " + contador);
    }
}
//Seleccione una:
//Verdadero
//Falso- EFECTIVAMENTE ES FALSO
