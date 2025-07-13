# API de Gerenciamento de Despesas Pessoais

![Status do Projeto](https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue)
Este projeto é uma **API REST em Java com Spring Boot** que estou desenvolvendo ativamente como parte da minha jornada de estudos em backend. O objetivo principal é criar um sistema para gerenciar despesas pessoais, aplicando e consolidando conhecimentos em tecnologias e boas práticas de mercado.

A cada novo conceito ou módulo que aprendo em **Spring Boot**, **Spring Data JPA** e **desenvolvimento de APIs**, eu os implemento progressivamente neste projeto. Isso me permite colocar a teoria em prática imediatamente, enfrentar desafios reais de desenvolvimento e construir um portfólio funcional.

## Tecnologias e Ferramentas Utilizadas:

* **Linguagem de Programação:** Java
* **Framework:** Spring Boot (com Spring Web e Spring Data JPA)
* **Banco de Dados:** H2 Database (em memória, para desenvolvimento e testes)
* **Mapeamento ORM:** Hibernate (via Spring Data JPA)
* **Controle de Versão:** Git e GitHub (com convenção de commits)
* **Gerenciamento de Dependências:** Maven

## Funcionalidades Implementadas (e em progresso):

* Estruturação de Projeto: Definição de pacotes e camadas (entities, repository).
* Mapeamento de Entidades: Configuração da entidade `Despesa` para persistência no banco de dados.
* Configuração de Banco de Dados: Integração e configuração do H2 Database.
* Operações CRUD Básicas (em breve): Implementação de funcionalidades para cadastrar, pesquisar e deletar despesas.

## Próximos Passos (Plano de Aprendizado e Evolução):

* Implementação da camada de Serviço (`@Service`) e Controlador (`@RestController`).
* Desenvolvimento das operações CRUD completas via endpoints REST.
* Tratamento de exceções e validações de dados.
* Adição de novas funcionalidades, como categorias de despesas, filtros de busca avançados e autenticação/autorização (se o projeto evoluir nesse sentido).

## Como Rodar o Projeto Localmente:

### Pré-requisitos

* Java Development Kit (JDK) 17 ou superior
* Maven 3.x

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/jeffmmartins/despesa-api.git](https://github.com/jeffmmartins/despesa-api.git)
    cd despesa-api
    ```
2.  **Compile e execute a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```
    A aplicação estará disponível em `http://localhost:8080`.

3.  **Acesse o Console H2 (para verificar o banco de dados):**
    * Abra seu navegador e acesse: `http://localhost:8080/h2-console`
    * **JDBC URL:** `jdbc:h2:mem:despesasdb`
    * **User Name:** `sa`
    * **Password:** (deixe em branco)
    * Clique em "Connect".

---

Usar essa descrição no `README.md` e mantê-lo atualizado conforme você avança no projeto é uma das melhores formas de apresentar seu trabalho.