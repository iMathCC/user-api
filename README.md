# AstroVoluntário

Plataforma de conexão entre voluntários e causas/ONGs locais.

Projeto desenvolvido com o objetivo de praticar **Spring Boot**, **segurança** e arquitetura limpa.

## Tecnologias

- Java 17
- Spring Boot 3.3.13
- Spring Data JPA + Hibernate
- PostgreSQL + Flyway
- Lombok + MapStruct
- Springdoc OpenAPI (Swagger)
- DTOs, Service Layer, Exception Handler

## Funcionalidades atuais (Fase 0)

- Cadastro de usuários com validação
- Listagem de usuários
- Camadas bem separadas (Controller → Service → Repository)
- Tratamento global de exceções
- Documentação automática da API

## Como rodar

1. Clone o repositório
2. Configure o banco PostgreSQL (usuário `postgres` + senha)
3. Atualize `src/main/resources/application.properties` com suas credenciais
4. Rode:

```bash
./mvnw clean spring-boot:run