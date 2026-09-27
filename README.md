# API de Produtos

API REST desenvolvida com Spring Boot para estudo de desenvolvimento de APIs e persistência de dados.

##  Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- SQLite
- Maven
- Postman

##  Funcionalidades

- Criar produtos
- Listar produtos
- Atualizar produtos
- Deletar produtos
- Persistência dos dados em SQLite

##  Estrutura

```text
src/
└── main/
    └── java/
        └── br.edu.ifpi.api_produtos/
            ├── controller/
            ├── model/
            └── repository/
```
##  Endpoints
Método	Endpoint	Função

GET	/produto	Lista todos os produtos

POST	/produto	Cria um produto

PUT	/produto/{id}	Atualiza um produto

DELETE	/produto/{id}	Remove um produto

##  Como executar

Clone o repositório:

git clone  https://github.com/ViniciusVieira05/api-produtos.git

Entre na pasta:

cd api-produtos

Execute:

./mvnw spring-boot:run

No Windows:

.\mvnw.cmd spring-boot:run

A API estará disponível em:

http://localhost:8080

##  Testes

Os endpoints podem ser testados utilizando o Postman.

Exemplo de criação:

```text
{
    "nome": "Notebook",
    "categoria": "Eletrônicos",
    "preco": 3500.00
}
```

##  Objetivo

Projeto desenvolvido para praticar conceitos de:

APIs REST
Spring Boot
CRUD
JPA/Hibernate
Banco de dados SQLite
Requisições HTTP
Postman

##  Autor

Vinicius Vieira Romão
