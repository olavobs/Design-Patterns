package factory;

public class testeFactory {

	public static void main(String[] args) {
		
		try {
			var homem = FactoryPessoa.getPessoa("Olavo", Sexo.HOMEM);
			System.out.println(homem.toString());
			
			var mulher = FactoryPessoa.getPessoa("Nívea", Sexo.MULHER);
			System.out.println(mulher.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
