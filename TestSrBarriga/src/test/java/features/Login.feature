# language: pt
Funcionalidade: Login

  Contexto: 
    Dado que estou na tela de login

  @login
  Esquema do Cenario: efetuar logon
    Quando preencho o formulario com login "<login>" e senha "<senha>"
    E confirmo o formulario
    Então recebo a mensagem de "<mensagem>"

    Exemplos: 
      | login         | senha    | mensagem                         |
      | rafael@teste  | 12345678 | Bem vindo, rafael!               |
      | rafael@teste1 | @123     | Problemas com o login do usuário |
      |               | 12345678 | Email é um campo obrigatório     |
      | rafael@teste  |          | Senha é um campo obrigatório     |
