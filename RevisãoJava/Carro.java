public class Carro extends Veiculo{

    int quantidadePortas;
    boolean indicadorAirbag;

    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public boolean isIndicadorAirbag() {
        return this.indicadorAirbag;
    }

    public boolean getIndicadorAirbag() {
        return this.indicadorAirbag;
    }

    public void setIndicadorAirbag(boolean indicadorAirbag) {
        this.indicadorAirbag = indicadorAirbag;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
    
        this.tipoCombustivel = tipoCombustivel;

        if(this.tipoCombustivel=="A"){
            this.setValorvisita(250);
        } else if(this.tipoCombustivel=="G"){
            this.setValorvisita(500);
        } else {
            this.setValorvisita(625);
        }

    }

    @Override
    public String toString() {
        return "{" +
            " Fabricante='" + fabricante + "'" +
            ", Modelo='" + modelo + "'" +
            ", Ano='" + ano + "'" +
            ", Preco='" + preco + "'" +
            ", Tipo Combustivel='" + tipoCombustivel + "'" +
            ", Valor da Visita='" + valorvisita + "'" +
            "}\n\n";
    }

}
