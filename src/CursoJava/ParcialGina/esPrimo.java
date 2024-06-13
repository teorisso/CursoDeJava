package CursoJava.ParcialGina;
//Esta función debería detectar si un número es primo y mayor que un número indicado,
// pero es necesario que la completen con la línea correcta.

public class esPrimo {
    public static boolean esPrimo(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
