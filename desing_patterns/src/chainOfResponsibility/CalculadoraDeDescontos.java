package chainOfResponsibility;

public class CalculadoraDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPor5Itens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		
		return d1.desconta(orcamento);
	}

}
