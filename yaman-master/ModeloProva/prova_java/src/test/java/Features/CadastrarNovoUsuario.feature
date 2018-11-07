Feature: Cadastro de novo usuario


Background: 
	Given que estou na tela de cadastro


@cadastro
Scenario Outline: cadastrar um novo usuario
	When preencho o formulario com "<login>" , "<senha>" e "<nome>"
	And confirmo o formulario
	Then recebo a mensagem de "<mensagem>"
	
Examples:
 |        login       |  senha |  nome  |        mensagem                  | 
 |  pratrik8@yaman    |  f     | flavio | Usuário inserido com sucesso    |
 |  flavior@flavior   |  f     | flavio | Endereço de email já utilizado |
 |  flavior@flavior   |  f     |        | Nome é um campo obrigatório    |
 |                    |  f     | flavio | Email é um campo obrigatório   |
 |  flavior@flavior   |        | flavio | Senha é um campo obrigatório   |