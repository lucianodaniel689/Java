package Exercicio2;

public class livro {
    // Criar objeto livro
    String titulo;
    String nomeLeitor;
    int paginasTotal;
    int paginasLidas;

    // Criar construtor para inicializar objeto
    public livro(){
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
    
    public void setTitulo(String tituloLivro){
        titulo = tituloLivro;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTotalPaginas(int totalPaginas){
        paginasTotal = totalPaginas;
    }

    public int getTotalPaginas(){
        return paginasTotal;
    }

    public void setPaginasLidas(int paginas){
        paginasLidas = paginas;
    }

    public int getPaginasLidas(){
        return paginasLidas;
    }
}
