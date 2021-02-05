package strategy;

public class ICMS implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
