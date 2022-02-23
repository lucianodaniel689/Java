//Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Scanner;

public class ExercicioMatriz1 {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int contadorMaiores = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite os números: ");
                matrizNumeros[i][j] = scanner.nextInt();
                if (matrizNumeros[i][j] > 10) {
                    contadorMaiores++;
                }
            }
        }
        System.out.println("Quantidade de números maiores que 10: " + contadorMaiores);

    }
}
