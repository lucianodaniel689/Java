package javaPolimorfismo;

public class Desenvolvedor extends Funcionario{
    
    private String cidade;
    private String estado;
    private double valorPorHora;
    private double horasTrabalhadas;

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        System.out.println("Horas trabalhadas: "+horasTrabalhadas);
    }

    public void calculaSalario(double horasTrabalhadas, double valorPorHora) {
        System.out.println("Salário do Mês: "+(horasTrabalhadas*valorPorHora));
    }


}
