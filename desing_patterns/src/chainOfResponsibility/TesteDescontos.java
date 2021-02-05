package chainOfResponsibility;

public class TesteDescontos {

	public static void main(String[] args) {

		CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
		Orcamento orcamento = new Orcamento(5000.0);
		
		orcamento.adicionaItem(new Item("caneta", 1000));
		orcamento.adicionaItem(new Item("caderno", 15.99));
		
		System.out.println(descontos.calcula(orcamento));
		
	}

}
