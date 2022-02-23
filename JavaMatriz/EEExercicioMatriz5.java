import java.util.Random;
import java.util.Scanner;

public class EEExercicioMatriz5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();
        int valor = 0;
        Scanner scanner = new Scanner(System.in);
        int coluna = 0;
        int linha = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(6);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Qual valor você deseja localizar? ");
        valor = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(valor == matriz[i][j]){
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.printf("Coluna: %d\nLinha: %d",linha+1,coluna+1);

    }
}