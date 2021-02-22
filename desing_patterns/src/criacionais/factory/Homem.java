package criacionais.factory;

public class Homem implements Pessoa {

	String nome;
	
	public Homem(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Eu sou um homem de nome " + this.nome;
	}
	
}
