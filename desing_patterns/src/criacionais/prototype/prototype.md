#Prototype

O GoF define o Prototype como um padrão que específica os tipos de objetos a serem criados utilizando um protótipo. Ele fornece um método alternativo para instanciar novos objetos através da cópia ou clone de uma instância existente. A criação de uma nova instância é bastante custosa, assim esse padrão ajuda a resolver esse problema.

Um exemplo clássico do padrão Prototype é quando se tem um documento padrão: quando for preciso utilizá-lo novamente, ao invés de criá-lo novamente, basta realizar uma cópia dele com as alterações necessárias.

Pros: 
    
    * É possível clonar um objeto sem acoplar ele com sua classe concreta
    
    * Pode se livrar de fazer várias inicializações de um objeto para no lugar usar clones pré-construídos do mesmo

Cons:
    
    * Pode acontecer de se ter uma referenciação circular