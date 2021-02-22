package criacionais.builder;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum")
		.comCnpj("12.345.678/001-12")
		.comItem(new ItemDaNota("item 1", 200.0))
		.comItem(new ItemDaNota("item 2", 300.0))
		.comItem(new ItemDaNota("item 3", 500.0))
		.naDataAtual();
		
		System.out.println(builder.constroi().toString());
	}
}
