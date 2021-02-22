package criacionais.factory;

public class Mulher implements Pessoa {

	String nome;

	public Mulher(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Eu sou um mulher de nome " + this.nome;
	}

}
