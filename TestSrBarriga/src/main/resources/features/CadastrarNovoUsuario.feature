# language: pt
Funcionalidade: Cadastro de novo usuario

  Contexto: 
    Dado que estou na tela de cadastro

  @cadastro
  Esquema do Cenario: cadastrar um novo usuario
    Quando preencho o formulario com "<login>" , "<senha>" e "<nome>"
    E confirmo o formulario
    Então recebo a mensagem de "<mensagem>"

    Exemplos: 
      | login        | senha    | nome   | mensagem                       |
      | rafa1@teste1 |     1234 | rafael | Usuário inserido com sucesso   |
      | rafael@teste | 12345678 | rafael | Endereço de email já utilizado |
      | rafa3@teste3 |     1234 |        | Nome é um campo obrigatório    |
      |              |     1234 | rafael | Email é um campo obrigatório   |
      | rafa1@teste1 |          | rafael | Senha é um campo obrigatório   |
