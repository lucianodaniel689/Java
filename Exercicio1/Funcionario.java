package Exercicio1;

public class Funcionario {
    
    //Criar objeto
    String nome;
    String sobrenome;
    String cidade;
    String estado;
    double horasTrabalhadas;
    double valorPorHora;
    double salario;

    //Criar construtor para inicializar objeto
    public Funcionario(String n, String s, String c, String e, double h, double v){
        nome = n;
        sobrenome = s;
        cidade = c;
        estado = e;
        horasTrabalhadas = h;
        valorPorHora = v;
    }

    //Método para imprimir nome e sobrenome do objeto
    public void listarFuncionario() {
        System.out.printf("%s %s",this.nome, this.sobrenome);
    }

    //Método para incrementar o número de horas
    public double incrementarHoras(double h){
        this.horasTrabalhadas += h;
        return(this.horasTrabalhadas);
    }

    //Método para receber novo valor por hora trabalhada e exibir valor na tela
    public void  novoValorHora(double v){
        this.valorPorHora = v;
        System.out.println("Valor por hora trabalhada: "+this.valorPorHora); 
    }

    //Método para calcular o salário
    public void calculaSalario(){
        salario = this.horasTrabalhadas * this.valorPorHora;
        System.out.printf("Salário do Funcionário %s: %.2f",this.nome, this.salario);
    }

    //


}
