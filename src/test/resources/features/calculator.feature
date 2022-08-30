#language: pt
@calculadora
Funcionalidade: Realizar Contas
  Como um aluno
  Eu quero conferir as contas executadas
  Para que eu possa obter os resultados matemáticos
Esquema do Cenario: Realizar <primeiro_valor> <operacao> <segundo_valor>
  Dado que eu estou logado no site da calculadora
  Quando eu clico em <primeiro_valor>
  E eu clico na operacao <operacao>
  E eu clico em <segundo_valor>
  E aperto enter
  Então aparece o resultado na tela <resultado>
  Exemplos:
    | primeiro_valor | operacao  | segundo_valor | resultado |
    |    3000        |   mais    |        2      |   3002    |
    |    3           |   menos   |        5      |   -2      |
    |    32          |  dividir  |        10     |   3.2     |
    |    2           |   vezes   |        20     |   40      |