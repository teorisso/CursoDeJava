package CursoJava.ParcialGina;
//Cuales son las líneas con error de este método

//Método para imprimir la matriz
public class imprimirMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //EL ERROR DEL CODIGO DEL PROFE ES QUE APARECE
                // j < matriz[j].length
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            //podria parecer un error pero no lo es
        }
    }
}
//La linea del parcial con error
//c. 04