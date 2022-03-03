public class Moto extends Veiculo{
  
    int cilindradas;

    public int getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
        if(this.cilindradas<=125){
            this.valorvisita=250.0;
        } else if(this.cilindradas > 125 &&  this.cilindradas<= 250){
            this.valorvisita = 500;
        } else {
            this.valorvisita = 625;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " Fabricante='" + fabricante + "'" +
            ", Modelo='" + modelo + "'" +
            ", Ano='" + ano + "'" +
            ", Preco='" + preco + "'" +
            ", Cilindradas='" + cilindradas + "'" +
            ", Tipo Combustivel='" + tipoCombustivel + "'" +
            ", Valor da Visita='" + valorvisita + "'" +

            "}\n\n";
    }
    
}
