# Padrões de projeto 

## Criacionais

### **Builder**

- Quando usar
 
 Usado para encapsular a lógica de construção de um objeto, quando este é considerado complexo, e permitindo separar a representação deste objeto complexo da sua representação, assim, podendo criar diferentes representações.

- Exemplo:

a) Criação sem usar o builder

```
import java.util.Date;

public class Task {
    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    public Task(long id) {
        this.id = id;
    }

    public Task(long id, String summary, String description, boolean done,
            Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;

    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDueDate() {
        return new Date(dueDate.getTime());
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
    }
    }
}
```

b) Utilizando o builder

```
import java.util.Date;

public class TaskBuilder {

    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    public TaskBuilder(long id, String summary, String description, boolean done,
            Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }


    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
        return this;
    }
    public Task build() {
        return new Task(id,summary, description,done, dueDate);
    }
    }
}
```

**Utilizando o builder**

```
public class MainTest {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5)
            .setDescription("Hello")
            .setSummary("Test")
            .build();
        System.out.println(task);
    }

}
```

- Vantages

1. Separar em pequenas partes a construção de um objeto complexo;
2. Redução da extensão e complexidade de uma classe;
3. Encapsulamento de código;
4. Permitir diferentes representações do objeto a ser construído;
5. O código para construção é isolado do código de representação, e estes são facilmente alterados sem afetar uns aos outros;
6. Criação de objetos complexos independentes das partes que o compõem;

- Desvantagens

1. Quando o construtor base é mal elaborado, pode resultar em construções redundantes e mal aproveitadas;
2. Pouco útil em situações em que há objetos com poucos parâmetros;
3. Custo de performance (pouco perceptível) pela necessidade de sempre chamar o Builder antes da utilização do objeto.

### **Prototype**

- Quando usar

O padrão Prototype é aplicado quando existe a necessidade de clonar, literalmente, um objeto. Ou seja, quando a aplicação precisa criar cópias exatas de algum objeto em tempo de execução.

- Exemplo

```
public abstract class Carro implements Cloneable {
    public String nomeModelo;
    public int preco;

    public String getNomeModelo()
    {
            return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo)
    {
            this.nomeModelo = nomeModelo;
    }

    public static int setPreco()
    {
            int preco = 0;
            Random r = new Random();
            int p = r.nextInt(100000);
            preco = p;

            return preco;
    }

    public Carro clone() throws CloneNotSupportedException
    {
            return (Carro)super.clone();
    }
}

 public class Chevrolet extends Carro {
        public Chevrolet(String m)
        {
                nomeModelo = m;
        }

        @Override
        public Carro clone() throws CloneNotSupportedException
        {
                return (Chevrolet)super.clone();
        }
    }

public class Ford extends Carro {
       public Ford(String m)
       {
             nomeModelo = m;
       }

       @Override
       public Carro clone() throws CloneNotSupportedException
       {
             return (Ford)super.clone();
       }
}
```

**Utilizando o prototype**

```
public class PrototypePatternEx {

    public static void main(String args[]) throws CloneNotSupportedException {

        System.out.println("***Exemplo do padrão Prototype***\n");
        Carro chevrolet = new Chevrolet("Cruze Sport v6");
        chevrolet.preco = 100000;
        Carro ford = new Ford("Focus 2.0");
        ford.preco = 500000;

        Carro bc1;
        //Clone do Objeto Chevrolet
        bc1 = chevrolet.clone();

        //Configurando preço que será maior que 100000
        bc1.preco = chevrolet.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

        //Clone do Objeto Ford
        bc1 = ford.clone();

        //Configurando preço que será maior que 500000
        bc1.preco = ford.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

    }
}
```

- Vantages

1. Você pode clonar objetos sem acoplá-los a suas classes concretas.
2. Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
3. Você pode produzir objetos complexos mais convenientemente.

- Desvantagens

1. Clonar objetos complexos que têm referências circulares pode ser bem complicado.
2. Cada subclasse de prototype deve implementar a operação clone, o que pode ser difícil. Por exemplo, acrescentar clone é complicado quando as classes consideradas já existem.

### **Factory**

- Quando usar

A criação do objeto talvez necessite de uma duplicação de código significativa, talvez necessite de informações não acessíveis para a composição do objeto, talvez não providencie um grau de abstração suficiente, ou então não faça parte da composição das preocupações do objeto. O Factory Method trata esses problemas definindo um método separado para criação dos objetos, no qual as subclasses possam sobrescrever para especificar o “tipo derivado” do produto que será criado

- Exemplo

```
public abstract class Pessoa {

	public String nome;
	public String sexo;

}

class Homem extends Pessoa {

	public Homem(String nome) {
		this.nome = nome;
		System.out.println(“Olá Senhor ” + this.nome);
	}
}

class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println(“Olá Senhora ” + this.nome);
	}

}

class FactoryPessoa {

	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals(“M”))
			return new Homem(nome);
		if (sexo.equals(“F”))
			return new Mulher(nome);
	}

}
```

**Utilizando o factory**
```
public class TesteApp {

	public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = “Carlos”;
		String sexo = “M”;
		factory.getPessoa(nome, sexo);
	}
}
```

- Vantages

1. Evita um alto acoplamento entre a fábrica e as classes concretas
2. SRP -> A criação da classe concreta fica concentrada em apenas um local fazendo com que o código fique mais fácil de dar suporte
3. OCP -> É possível introduzir novos tipos de classes sem alterar o comportamento das classes já existentes.

- Desvantagens

1. O código pode ficar mais complicado pois será necessário introduzir várias subclasses para implementar o padrão

### **Abstract Factory**

- Quando usar

Quando se deseja empregar o padrão é isolar a criação de objetos de seu uso e criar famílias de objetos relacionados sem ter que depender de suas classes concretas. Isto permite novos tipos derivados de ser introduzidas sem qualquer alteração ao código que usa a classe base;

- Exemplo

```
public interface Animal {
    String getAnimal();
    String makeSound();
}

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}

public interface AbstractFactory<T> {
    T create(String animalType) ;
}

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }
}
```
Também é possível implementar uma interface Color usando o mesmo padrão.
```
public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        
        return null;
    }
}
```

**Utilizando o abstract factory**

```
public class TesteAbstractFactory {

    public static void main(String[] args) {

        Animal animal = (Animal) FactoryProvider.getFactory("Animal").create("Dog");

        Color color = (Color) FactoryProvider.getFactory("Color").create("Brown");

        System.out.println("A " + animal.getAnimal() + " with " + color.getColor() + " color " + animal.makeSound());

    }
}
```

- Vantages

1. Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.
2. Você evita um vínculo forte entre produtos concretos e o código cliente.
3. SRP -> Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção. 
4. OCP -> Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente

- Desvantagens

1. O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.

### **Singleton**

- Quando usar

Quando é desejável ter apenas uma instância da classe existindo, e esta será utilizada por toda a aplicação. Dessa forma temos apenas um ponto 
de acesso central a esta instância da classe. Normalmente é usado para logging, drivers objects, caching e criação de thread pool. 

- Exemplo de single thread singleton

```
public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
```

- Vantagens

1.  Você tem certeza que está usando a mesma instância do objeto
2.  Você tem acesso global a instância

- Desvantagens

1. Dificulta a implementação de testes unitários, pois este impede que sejam criados instancias separadas para cada caso de teste
2. É um anti pattern pelo fato de estar centralizando parte da aplicação dificultando a modularização e também contribuindo para aumento do acoplamento