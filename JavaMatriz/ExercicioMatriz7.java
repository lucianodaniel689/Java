public class ExercicioMatriz7 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Criação da matriz 1 e 2 e impressão na tela

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i < j) {
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                } else if (i == j) {
                    matriz[i][j] = (3 * (i * i)) - 1;
                } else {
                    matriz[i][j] = (4 * (i * i * i)) - (5 * (j * j)) + 1;
                }
            }
        }

        System.out.println("\nMatriz:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}