#language: pt
Funcionalidade: Realizar Contas
  Como um aluno
  Eu quero conferir as contas executadas
  Para que eu possa obter os resultados matemáticos

  Cenário: Somar 3000 + 2
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 3000
    E eu clico em +
    E eu clico em 2
    E aperto enter
    Então aparece o resultado na tela 3002

  Cenário: Somar 3 + 2
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 3
    E eu clico em +
    E eu clico em 2
    E aperto enter
    Então aparece o resultado na tela 5

  Cenário: Somar 32 + 4
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 32
    E eu clico em +
    E eu clico em 40
    E aperto enter
    Então aparece o resultado na tela 72

  Cenário: Somar 2 + 20
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 2
    E eu clico em +
    E eu clico em 20
    E aperto enter
    Então aparece o resultado na tela 22