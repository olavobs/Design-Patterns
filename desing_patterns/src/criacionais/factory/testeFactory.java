package criacionais.factory;

public class testeFactory {

	public static void main(String[] args) {
		
		try {
			Pessoa homem = FactoryPessoa.getPessoa("Olavo", Sexo.HOMEM);
			System.out.println(homem.toString());

			Pessoa mulher = FactoryPessoa.getPessoa("N�vea", Sexo.MULHER);
			System.out.println(mulher.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
