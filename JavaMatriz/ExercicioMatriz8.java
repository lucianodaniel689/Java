import java.util.Random;

public class ExercicioMatriz8 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        Random random = new Random();
        int somatoria = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = random.nextInt(6);
            }
        }

        System.out.println("\nMatriz 1:\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if (i < j) {
                    somatoria = somatoria + matriz1[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos que estao acima da diagonal principal é: " + somatoria);

    }
}