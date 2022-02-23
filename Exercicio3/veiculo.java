package Exercicio3;

import Exercicio2.livro;

public class veiculo {
    
    String modelo;
    String marca;
    int ano;
    double velocidadeMaxima;
    String cor;
    int valorFipe;
    double velocidadeAtual;

    public veiculo(){
    }

    public void setMarca(String m){
        marca = m;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String m){
        modelo = m;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int a){
        ano = a;
    }

    public int getAno(){
        return ano;
    }

    public void setVelocidadeMaxima(Double v){
        velocidadeMaxima = v;
    }

    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void caracteristicasVeiculo(){
        System.out.printf("Marca: %s\nModelo: %s\nAno do veículo: %d",this.marca,this.modelo,this.ano);
    }

    public double acelerar(double a){
        if((velocidadeMaxima - velocidadeAtual) >= a){
            velocidadeAtual = velocidadeAtual + a;
            System.out.printf("Estou acelerando %.2f km/h", a);
        } else {
            velocidadeAtual = velocidadeAtual + a;
            System.out.println("Velocidade acima do valor permitido para o veículo!");
        }

        return velocidadeAtual;
    }

}
