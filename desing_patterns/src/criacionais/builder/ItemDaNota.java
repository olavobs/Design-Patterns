package criacionais.builder;

public class ItemDaNota {

	private String nome;
	private double valor;

	public ItemDaNota(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "ItemDaNota [nome=" + nome + ", valor=" + valor + "]";
	}
}
