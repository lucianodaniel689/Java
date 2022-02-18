package Exercicio2;

public class livro {
    // Criar objeto livro
    String titulo;
    String nomeLeitor;
    int paginasTotal;
    int paginasLidas;

    // Criar construtor para inicializar objeto
    public livro(String t, String l, int pagT, int pagL){
        titulo = t;
        nomeLeitor = l;
        paginasTotal = pagT;
        paginasLidas = pagL;
    }

    public void progressoLeitura(int t, int l) {
        float porcentagemLida;

        porcentagemLida = (l * 100) / t;
        System.out.println("\n\nVocê leeu " + porcentagemLida + "% do livro!");
    }

    public void setNome(String meuNome){
        nomeLeitor = meuNome;
    }

    public String getNome(){
        return nomeLeitor;
    }
}
