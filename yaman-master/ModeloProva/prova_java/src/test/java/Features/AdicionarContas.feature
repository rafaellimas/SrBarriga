@adicionarcontas
Feature: Adicionar contas

  Background: 
    Given que estou logado com um usuario valido

  Scenario Outline: adicionar contas
    When navego ate a janela de adicionar contas
    And adiciono uma conta com o valor "<conta>"
    Then recebo a mensagem de "<mensagem>"

    Examples: 
      | conta          | mensagem                            |
      | Banco Bradesco | Conta adicionada com sucesso!       |
      | Banco Bradesco | Já existe uma conta com esse nome! |
      |                | Informe o nome da conta             |
