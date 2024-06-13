package CursoJava.ParcialGina;

//Seleccionar la función que recibe un array y devuelve un array con los elementos invertidos
public class calcularSumaElementosPares {
    public static int calcularSumaElementosPares(int [][] matriz){
        int suma = 0;
        for(int i=0;i<matriz.length;i++){
            // revisar que no sea i<=matriz.length
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j] %2==0){
                    suma+=matriz[i][j];
                }
            }
        }
        return suma;
    }
}
