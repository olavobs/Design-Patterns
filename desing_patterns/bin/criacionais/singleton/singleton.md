#Singleton

O GoF define o padrão Singleton como uma classe que possui apenas uma única instância e fornece um ponto de acesso global a ela.

Assim, ele é definido como uma classe que deve ter apenas uma instância a ser utilizada sempre que necessário.

E onde usar um Sigleton?

Singleton normalmente é usado para logging, drivers objects, caching e criação de thread pool.

Pros: 
    
    * Você tem certeza que está usando a mesma instância do objeto
    
    * Você tem acesso global a instância
    
    * O singleton é inicializado apenas quando ele é chamado pela primeira vez
    
Cons: 

    * Viola o Single Responsibility Principle, o padrão resolve duas coisas
    
    * O padrão precisa de uma atenção maior quando usado em um ambiente multithread para que as multiplas threads não criem multipls singletons
    
    * Pode ser difícil a criação de testes unitários para ele   