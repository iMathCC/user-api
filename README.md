# AstroVoluntário API

Plataforma de conexão entre voluntários e causas/ONGs locais.

## Tecnologias

- Java 17
- Spring Boot 3.3.13
- Spring Security 6
- JWT (JSON Web Token)
- Spring Data JPA + Hibernate
- PostgreSQL + Flyway
- BCrypt (senhas)
- Lombok + MapStruct
- Springdoc OpenAPI (Swagger)
- DTOs, Service Layer, Exception Handler

## Funcionalidades (Fase 1)

### Autenticação e Segurança
- ✅ Cadastro de usuários com validação
- ✅ Login com geração de token JWT
- ✅ Senhas criptografadas com BCrypt
- ✅ Rotas protegidas (requer token)
- ✅ Roles: ADMIN, VOLUNTARIO, ONG
- ✅ Tratamento global de exceções
- ✅ Documentação Swagger com autenticação JWT

### Arquitetura
- ✅ Camadas bem separadas (Controller → Service → Repository)
- ✅ DTOs para não expor entidades
- ✅ Flyway para migrações de banco
- ✅ Configuração segura via variáveis de ambiente

## Como rodar

### Pré-requisitos
- Java 17
- PostgreSQL (ou use H2 para testes)

### Passo a passo

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/astro-voluntario.git
cd astro-voluntario
