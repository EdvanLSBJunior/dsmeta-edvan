# dsmeta-edvan

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/EdvanLSBJunior/dsmeta-edvan/blob/main/LICENSE) 

# Sobre o projeto

https://dsmeta-edvan.netlify.app/

dsmeta-edvan é uma aplicação full stack web construída na **semana de imersão React e Spring DevSuperior** (#sds9)
evento organizado pela [DevSuperior](https://devsuperior.com.br "Site da DevSuperior") 

A aplicação consiste em uma pesquisa de dados de vendedores, onde os dados são consultados por data e apresentados na tela a data da venda, nome do vendedor,
quantidade de visitas, quantidade de vendas e o valor total das vendas, seguido de um botão denominado: Notificar,
que envia a informação  contida naquela linha via sms para o telefone cadastrado.

## Layout Web
![Web 1](https://github.com/EdvanLSBJunior/assets/blob/main/images(sds9)/dsmeta.JPG)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Twillio (para envio de SMS)
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Axios
## Implantação em produção
- Back end: HerokuCLI
- Front end web: Netlify
- Banco de dados: H2

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/EdvanLSBJunior/dsmeta-edvan

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/EdvanLSBJunior/dsmeta-edvan

# entrar na pasta do projeto front end
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn dev
```

# Autor

Edvan Lázaro

https://www.linkedin.com/in/edvanjunior/
