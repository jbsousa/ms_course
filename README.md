# Microsserviços Java com Spring Boot e Spring Cloud
Projeto criado durante o curso de [Microsserviços Java com Spring Boot e Spring Cloud](https://www.udemy.com/course/microsservicos-java-spring-cloud), ministradas pelo professor Nélio Alves. No curso foi possível ter uma introdução a algumas das principais ferramentas do Spring Cloud, para elaboração de um sistema em microsserviços que se comunicam de maneira transparente, escalável e balanceamento de carga.

Application Layout         |  Modelo Conceitual
:-------------------------:|:-------------------------:
<img src="https://github.com/jbsousa/ms_course/blob/main/layout.png" width="auto" height="auto">| <img src="https://github.com/jbsousa/ms_course/blob/main/conceptual_model.png" width="auto" height="auto">

### Tecnologias utilizadas
- Feign para requisições de API;
- Ribbon para balanceamento de cargas;
- Servidor Eureka para registro e visualização dos microsserviços;
- API Gateway Zuul para roteamento de de autorização;
- Hystrix para tolerância a falhas;
- OAuth e JWT para autenticação e autorização 
- Config Server centralizado no GitHub;
- Containers Docker para a base de dados e microsserviços.
