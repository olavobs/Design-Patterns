#Chain of Responsibility

O padr�o Chain of Responsibility funciona muito bem quando temos uma lista de comandos a serem executados de acordo com algum cen�rio em espec�fico, e sabemos tamb�m qual o pr�ximo cen�rio que deve ser validado, caso o anterior n�o satisfa�a a condi��o.

Nesses casos, o Chain of Responsibility nos possibilita a separa��o de responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de juntar esses comportamentos novamente.