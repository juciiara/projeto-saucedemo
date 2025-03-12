# 🛒 Projeto Saucedemo - Testes Automatizados
Este repositório contém a automação de testes para o site Saucedemo, utilizando Cucumber, Selenium e JUnit para validar o fluxo de compra.

## 📌 Objetivo
Garantir a qualidade e o funcionamento correto do fluxo de compra no Saucedemo, validando desde o login até a finalização do pedido.

## 🛠 Tecnologias Utilizadas
- **Linguagem**: Java
- **Frameworks**: Selenium, Cucumber, JUnit
- **Gerenciador de Dependências**: Maven
- **Ferramenta de Gestão de Testes**: Qase

## 🚀 Fluxo Testado
- ✅ Login no site
- ✅ Adição de produtos ao carrinho
- ✅ Validação dos produtos no carrinho
- ✅ Preenchimento dos dados de checkout
- ✅ Finalização da compra
- ✅ Logout do usuário

## 📂 Estrutura do Projeto
src/
 ├── main/
 │    └── java/
 │        └── saucedemo/
 │            ├── elementos/
 │            ├── pages/
 │            ├── steps/
 │            └── runner/
 └── test/
      └── java/
           └── saucedemo/
               ├── elementos/
               ├── pages/
               ├── steps/
               └── runner/
      └── resources/
           └── features/
               ├── login.feature
               ├── carrinho.feature
               └── checkout.feature


## 📜 Como Executar os Testes

1. Clone o repositório para a sua máquina local:
    ```bash
    git clone https://github.com/usuario/repository.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd projeto-saucedemo
    ```
3. Execute os testes utilizando Maven:
    ```bash
    mvn test
    ```

## 🔧 Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch para a sua feature (`git checkout -b feature/nova-feature`).
3. Faça o commit das suas alterações (`git commit -am 'Adicionar nova feature'`).
4. Envie a sua branch para o repositório remoto (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## 📚 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.







