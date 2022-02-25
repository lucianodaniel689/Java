package javaPolimorfismo;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;



	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	@Override
	public String toString() {
		return "Dados {" +
			" Nome ='" + nome + "'" +
			", Sobrenome ='" + sobrenome + "'" +
			"}";
	}
	

	


}
