import java.util.Random;

public class ExercicioMatriz6 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matriz3 = new int[4][4];
        Random random = new Random();
        int maiorValor = 0;
        

        //Criação da matriz 1 e 2 e impressão na tela

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = random.nextInt(6);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = random.nextInt(6);
            }
        }

        System.out.println("\nMatriz 1:\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\nMatriz 2:\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //Criação da Matriz 3 que vai puxar o maior valor de cada posição, e imprimi-las na tela

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(matriz1[i][j] > matriz2[i][j]){
                    matriz3[i][j] = matriz1[i][j];
                } else{
                    matriz3[i][j] = matriz2[i][j];
                }
            }
        }

        System.out.println("Matriz 3:\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println(" ");
        }



    }




}