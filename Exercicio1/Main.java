package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Luciano", "Daniel", "Santa Cruz do Sul", "Rio Grande do Sul", 0.0, 13.5);

        funcionario1.listarFuncionario();
        funcionario1.incrementarHoras(8);
        System.out.println("\nHoras trabalhadas: "+funcionario1.horasTrabalhadas);
        funcionario1.novoValorHora(10.0);
        funcionario1.calculaSalario();
        
    }

}