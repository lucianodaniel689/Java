package javaPolimorfismo;
public class main {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor();
        d1.setNome("Luciano");
        d1.setSobrenome("Dick");
        System.out.println(d1.toString());
        d1.setCidade("Santa Cruz do Sul");
        d1.setEstado("Rio Grande do Sul");
        d1.setHorasTrabalhadas(32);
        d1.setValorPorHora(32.50);
        d1.calculaSalario(32, 32.50);
    }
}
