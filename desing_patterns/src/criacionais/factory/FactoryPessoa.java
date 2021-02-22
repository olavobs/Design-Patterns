package criacionais.factory;

public class FactoryPessoa {

	public static Pessoa getPessoa(String nome, Sexo sexo) throws Exception {
		if (sexo.equals(Sexo.HOMEM)) {
			return new Homem(nome);
		}
		if (sexo.equals(Sexo.MULHER)) {
			return new Mulher(nome);
		}
		throw new Exception("Sexo n�o cadastrado");
	}
}
