@regressivos
@remover
Feature: Remover produtos do carrinho no SauceDemo

  Scenario: Usuário remove um produto do carrinho com sucesso
    Given que o usuário está logado no SauceDemo
    And adiciona um produto ao carrinho
    When acessa o carrinho
    And remove o produto
    Then o carrinho deve estar vazio
