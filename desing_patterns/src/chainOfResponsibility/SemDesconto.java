package chainOfResponsibility;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
	}

}
