package chainOfResponsibility;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximoDesconto(Desconto desconto);
}
