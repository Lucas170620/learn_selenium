#language: pt
@calculadora
Funcionalidade: Realizar Contas
  Como um aluno
  Eu quero conferir as contas executadas
  Para que eu possa obter os resultados matemáticos

  Cenário: Somar 3000 + 2
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 3000
    E eu clico na operacao mais
    E eu clico em 2
    E aperto enter
    Então aparece o resultado na tela 3002

  Cenário: Subtrair 3 - 5
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 3
    E eu clico na operacao menos
    E eu clico em 5
    E aperto enter
    Então aparece o resultado na tela -2

  Cenário: Dividir 32 / 10
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 32
    E eu clico na operacao dividir
    E eu clico em 10
    E aperto enter
    Então aparece o resultado na tela 3.2

  Cenário: Multiplicar 2 * 20
    Dado que eu estou logado no site da calculadora
    Quando eu clico em 2
    E eu clico na operacao vezes
    E eu clico em 20
    E aperto enter
    Então aparece o resultado na tela 40