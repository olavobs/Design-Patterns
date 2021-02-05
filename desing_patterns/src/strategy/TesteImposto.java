package strategy;

public class TesteImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		
		calculadoraDeImpostos.realizaCalculoImposto(orcamento, icms);
		calculadoraDeImpostos.realizaCalculoImposto(orcamento, iss);
	}

}
