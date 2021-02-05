package strategy;

public class CalculadoraDeImpostos {

	public void realizaCalculoImposto(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calculaImposto(orcamento);
		System.out.println(valorImposto);
	}
}
