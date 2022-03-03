import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    int numeroCarros = 0;
    int numeroMotos = 0;

    List<Moto> listaMotos = new ArrayList<Moto>();
    List<Carro> listaCarros = new ArrayList<Carro>();

    public boolean comprarMoto(Object moto){
       
        this.listaMotos.add((Moto) moto);
        this.numeroMotos++;
        return(true);
    }

    public boolean comprarCarro(Object carro){
       
        this.listaCarros.add((Carro) carro);
        this.numeroCarros++;
        return(true);
    }

    public boolean listarVeiculosDaLoja(String tipoVeiculo){
       
        if(tipoVeiculo == "Moto"){
            System.out.println(this.listaMotos);
        } else if(tipoVeiculo == "Carro"){
            System.out.println(this.listaCarros);
        } else {
            System.out.println(this.listaMotos);
            System.out.println(this.listaCarros);
        }
        return(true);
    }

}
