# User API - Spring Boot + PostgreSQL

## 📖 Descrição

API REST simples para criação e listagem de usuários, com persistência de dados em banco PostgreSQL.

Projeto desenvolvido com foco em aprendizado de backend, integração com banco de dados e estruturação de uma aplicação utilizando Spring Boot.

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL

---

## 🚀 Funcionalidades

- Criar usuário (nome e email)
- Listar todos os usuários
- Persistência em banco de dados

---

## ▶️ Como rodar o projeto

### 1. Criar banco no PostgreSQL

CREATE DATABASE astock;

### 2. Criar a tabela

Execute o arquivo: src/main/resources/schema.sql


### 3. Configurar o banco

No arquivo application.properties, coloque suas credenciais:

spring.datasource.url=jdbc:postgresql://localhost:5432/astock
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

### 4. Rodar a aplicação:

./mvnw spring-boot:run

ou

mvn spring-boot:run

### 🌐 Endpoints

Criar usuário
POST /users

Exemplo:
{
  "nome": "Name",
  "email": "names@email.com"
}

### Listar usuários
GET /users


### 🧠 Observações

O ID é gerado automaticamente pelo banco
O email é único (não pode repetir)