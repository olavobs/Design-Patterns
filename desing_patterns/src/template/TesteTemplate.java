package template;

public class TesteTemplate {

	public static void main(String[] args) {
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Orcamento orcamento = new Orcamento(100);

		System.out.println("Imposto Ikcv: " + ikcv.calculaImposto(orcamento));
		System.out.println("Imposto Icpp: " + icpp.calculaImposto(orcamento));
	}
}
