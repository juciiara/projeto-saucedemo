
@carrinho
Feature: Carrinho de Compras
 
 Como usuário do site Saucedemo
 Quero adicionar produtos ao carrinho
 Para que eu possa comprar os produtos desejados de forma fácil e eficiente.

Background: 
 Given Que estou logado no site Saucedemo "https://www.saucedemo.com/"
  
@positivo
Scenario: Produtos no Carrinho
   
 When adiciono produtos ao carrinho
 And acesso o carrinho de compras
 And Os produtos devem estar presentes no carrinho
 When clico no botao de checkout
 Then sistema redireciona para aba Checkout: Your Information

@positivo
 Scenario: Preenchimento das informações no checkout  
    
 Given estou na página "https://www.saucedemo.com/checkout-step-one.html"  
 When preencho os campos "Primeiro Nome", "Último Nome" e "CEP"  
 And clico no botão "Continue
 Then sou redirecionado para a próxima etapa do checkout 
 And clico em "finish" para finalizar
 And clico em "Back Home" para voltar a pagina inicial de produtos
 And acesso o botao de menu da pagia inicial
 When clico em logout
 Then logout realizado com sucesso