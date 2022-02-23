package Exemplos;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matrizNotaAlunos = new int[3][3];
        Scanner scanner = new Scanner(System.in);



        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.printf("Digite as notas do aluno %d: ",i+1);
                matrizNotaAlunos[i][j] = scanner.nextInt();
            }
        }
        
        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.printf("Notas do Aluno %d: %d",i+1,matrizNotaAlunos[i][j]);
            }
        }
    }
}
