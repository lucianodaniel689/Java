package Exercicio2;

import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        livro leitor1 = new livro("Lovecraft", "Luciano", 300, 76);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        leitor1.setNome(scanner.nextLine());

        System.out.printf("Leitor: %s\nLivro: %s\nTotal de Páginas: %d\nPáginas Lidas: %d",leitor1.nomeLeitor,leitor1.titulo,leitor1.paginasTotal,leitor1.paginasLidas);
        leitor1.progressoLeitura(leitor1.paginasTotal,leitor1.paginasLidas);
    }
}