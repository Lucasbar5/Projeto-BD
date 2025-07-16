# Projeto-BD
Projeto desenvolvido para a disciplina de Banco de Dados, utilizando **Spring Boot**, **Docker**, e banco de dados **PostgreSQL**.

## Eventos academicos

Foi escolhido o tema de eventos academicos devido a maior familiaridade na area.

---

## 🚀 Como executar a aplicação

Certifique-se de ter o **Docker** e **Docker Compose** instalados na sua máquina.

No diretório raiz do projeto, execute o comando abaixo para subir todos os serviços:

```bash
docker compose up --build
```
A aplicação estará disponível em: http://localhost:8080

## 🌐 Endpoints principais
### 🔎 Swagger (Documentação da API):
```bash
http://localhost:8080/swagger-ui/index.html#/
```
### 📊 Dashboard Administrativo:
```bash
http://localhost:8080/admin/dashboard
```
## 🗃️ Banco de Dados
O projeto utiliza PostgreSQL, e o PGAdmin está disponível para gerenciar o banco.

<img width="1145" height="784" alt="image" src="https://github.com/user-attachments/assets/50c7fbc5-3e68-4d0e-bde0-fc97a93a0aff" />


### PGAdmin acessível em:
```bash
http://localhost:8084
```
Host: psql

Porta: 5432

Banco de Dados: db

Usuário: admin

Senha: 123456
