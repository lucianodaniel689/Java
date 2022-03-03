import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        for (int i = 0; i < 50; ++i)
            System.out.println();

        Moto moto1 = new Moto();
        moto1.setCilindradas(250);
        moto1.setAno(2010);
        moto1.setFabricante("Honda");
        moto1.setPreco(50000.99);
        moto1.setModelo("Titan 160");
        moto1.setTipoCombustivel("G");

        Carro carro1 = new Carro();
        carro1.setAno(2008);
        carro1.setFabricante("carr");
        carro1.setPreco(40000);
        carro1.setModelo("carr 160");
        carro1.setTipoCombustivel("A");

        Loja loja = new Loja();

        loja.comprarMoto(moto1);
        loja.comprarCarro(carro1);
        loja.comprarCarro(carro1);

        loja.comprarCarro(carro1);

        loja.comprarCarro(carro1);
        loja.comprarCarro(carro1);
        loja.comprarCarro(carro1);
        loja.comprarCarro(carro1);

        loja.listarVeiculosDaLoja("Todos");

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Quantas cilindradas tem a moto?");
        // moto1.setCilindradas(scanner.nextInt());

    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle any exceptions.
        }
    }
}
