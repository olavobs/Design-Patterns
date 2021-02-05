#Factory

Basicamente, a lógica criacional é encapsulada dentro do factory e, ou é fornecido um método que retorna um novo objeto criado (Padrão Factory Method) ou delega-se a criação do objeto para uma subclasse (Padrão Abstract Factory).

O cliente não precisa conhecer as diferentes implementações da interface ou da classe. A única coisa que o cliente precisa conhecer é a Factory para que possa obter uma instância de uma das implementações da interface. Dessa forma, os clientes são desacoplados da criação de objetos. Esse desacoplamento se dá em função da aplicação do princípio da inversão de dependência. Entre as vantagens do desacoplamento tem-se a possibilidade de serem implementadas classes concretas que podem ser alteradas sem afetar o cliente, reduzindo assim o acoplamento entre as classes e aumentando a flexibilidade. Isso tem como resultado também uma maior simplificação para os desenvolvedores quando é necessária a realização de refatoração no código, pois agora existe um único ponto onde as alterações podem ocorrer.


Pros - Evita um alto acoplamento entre a fábrica e as classes concretas
     - SRP -> A criação da classe concreta fica concentrada em apenas um local fazendo com que o código fique mais fácil de dar suporte
     - OCP -> É possível introduzir novos tipos de classes sem alterar o comportamento das classes já existentes.

Cons - O código pode ficar mais complicado pois será necessário introduzir várias subclasses para implementar o padrão