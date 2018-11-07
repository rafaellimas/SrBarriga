@login 
Feature: Login

Background: 
	Given que estou na tela de login

Scenario Outline: efetuar logon
	When preencho o formulario com "<login>" e "<senha>"
	And confirmo o formulario
	Then recebo a mensagem de "<mensagem>"
	And sou direcionado para a url "<url>"
	
Examples:
 |        login      |  senha |              url                     |        mensagem                    | 
 |  flavio@flaviox   |  xxxx  | http://srbarriga.herokuapp.com/logar |      Bem vindo, flavio!            |
 |  flavio@flaviox   |  xxx1  | http://srbarriga.herokuapp.com/logar | Problemas com o login do usuário  |
 |                   |  xxxx  | http://srbarriga.herokuapp.com/logar | Email é um campo obrigatório     |
 |  flavio@flaviox   |        | http://srbarriga.herokuapp.com/logar | Senha é um campo obrigatório     |
 |                   |        | http://srbarriga.herokuapp.com/logar | Email é um campo obrigatório     |
 
