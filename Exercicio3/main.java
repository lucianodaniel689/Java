package Exercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double velocidadeAcelerada;

        veiculo veiculo1 = new veiculo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a Marca?");
        veiculo1.setMarca(scanner.nextLine());
        System.out.println("Qual é o Modelo?");
        veiculo1.setModelo(scanner.nextLine());
        System.out.println("Qual é o Ano?");
        veiculo1.setAno(scanner.nextInt());
        System.out.println("Qual é a velocidade Maxima do carro?");
        veiculo1.setVelocidadeMaxima(scanner.nextDouble());
        veiculo1.caracteristicasVeiculo();
        
        System.out.println("\nDeseja acelerar em quanto o carro?");
        velocidadeAcelerada = scanner.nextDouble();
    
        veiculo1.acelerar(velocidadeAcelerada);


 

    }
}
