# language: pt
Funcionalidade: Adicionar contas

  Contexto: 
    Dado que estou logado com um usuario valido

  @adicionarcontas
  Esquema do Cenario: adicionar contas
    Quando navego ate a janela de adicionar contas
    E adiciono uma conta com o valor "<conta>"
    Então recebo a mensagem de "<mensagem>"

    Exemplos: 
      | conta         | mensagem                           |
      | Santander S.A | Conta adicionada com sucesso!      |
      | Santander S.A | Já existe uma conta com esse nome! |
