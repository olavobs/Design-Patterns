#Factory

Basicamente, a l�gica criacional � encapsulada dentro do factory e, ou � fornecido um m�todo que retorna um novo objeto criado (Padr�o Factory Method) ou delega-se a cria��o do objeto para uma subclasse (Padr�o Abstract Factory).

O cliente n�o precisa conhecer as diferentes implementa��es da interface ou da classe. A �nica coisa que o cliente precisa conhecer � a Factory para que possa obter uma inst�ncia de uma das implementa��es da interface. Dessa forma, os clientes s�o desacoplados da cria��o de objetos. Esse desacoplamento se d� em fun��o da aplica��o do princ�pio da invers�o de depend�ncia. Entre as vantagens do desacoplamento tem-se a possibilidade de serem implementadas classes concretas que podem ser alteradas sem afetar o cliente, reduzindo assim o acoplamento entre as classes e aumentando a flexibilidade. Isso tem como resultado tamb�m uma maior simplifica��o para os desenvolvedores quando � necess�ria a realiza��o de refatora��o no c�digo, pois agora existe um �nico ponto onde as altera��es podem ocorrer.


Pros - Evita um alto acoplamento entre a f�brica e as classes concretas
     - SRP -> A cria��o da classe concreta fica concentrada em apenas um local fazendo com que o c�digo fique mais f�cil de dar suporte
     - OCP -> � poss�vel introduzir novos tipos de classes sem alterar o comportamento das classes j� existentes.

Cons - O c�digo pode ficar mais complicado pois ser� necess�rio introduzir v�rias subclasses para implementar o padr�o