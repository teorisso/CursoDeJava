package CursoJava.ParcialGina;

public class eliminarDuplicados {
    public static int[] eliminarDuplicados(int[] a) {
        if (a.length == 0 || a.length == 1){
            return a;
        }
        int[] t = new int[a.length];
        int ix= 0;
        for (int i=0; i<a.length; i++){
            boolean duplicado = false;// en el examen dice: boolean duplicado = true; ERROR linea 08 del examen
            for (int j = 0; j < ix ; j++){
                if (a[i]==t[j]){ // en el examen dice: if (a[i]!=t[j]) ERROR linea 10 del examen
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado){
                t[ix++] = a[i];
            }
        }
        int [] array = new int [ix];
        //en el examen dice i=0; i<i ES UN ERROR linea 20 del examen
        System.arraycopy(t, 0, array, 0, ix);
        return array;
    }
}

//en resumen linea 08, 10, 20

