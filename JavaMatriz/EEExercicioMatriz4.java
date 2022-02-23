import java.util.Random;

public class EEExercicioMatriz4 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();
        int maiorColuna;
        int maiorLinha;
        int numeroAnterior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(6);
                if(numeroAnterior == 0){
                    maiorColuna = i;
                    maiorLinha = j;
                } else if(matriz[i][j] > numeroAnterior){
                    maiorColuna = i;
                    maiorLinha = j;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
