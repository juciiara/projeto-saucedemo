 
 @login @regressivo
  Feature: login
  Como usuário
  Quero informar meus dados
  Para realizar login

  Background: Acessar a tela de login 
  Given que nao esteja logado 
  
  @positivo
  Scenario: Login com sucesso
   
    When preencher o campo usuário 
    And preencher o campo senha 
    And clicar no botão de login
    Then o login é realizado com sucesso

  @negativo
  Scenario: Login com senha errada
    
    When preencher o campo usuário 
    And preencher o campo senha errada
    And clicar no botão de login
    Then o sistema exibe a mensagem de erro 

  @negativo
  Scenario: Login com usuário errado
    
    When preencher o campo usuário errado
    And preencher o campo senha 
    And clicar no botão de login
    Then o sistema exibe a mensagem de erro 

  @negativo
  Scenario: Login com dados em branco
    
    When preencher o campo usuário em branco
    And preencher o campo senha em branco
    And clicar no botão de login
    Then o sistema exibe a mensagem de erro 

  @negativo
  Scenario: Login com usuário bloqueado
    
    When preencher o campo usuário bloqueado
    And preencher o campo senha 
    And clicar no botão de login
    Then o sistema exibe a mensagem de erro 
