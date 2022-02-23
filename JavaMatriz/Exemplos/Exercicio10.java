package Exemplos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar a tabuada: ");
        int numero = scanner.nextInt();

        for (int i=0; i<=10; i++){

            int resultado = numero *i;
            System.out.printf("%d * %d = %d\n",numero,i, resultado);
            
        }

    }
}
