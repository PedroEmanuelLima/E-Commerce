# 							E-Commerce

Solução de e-commerce com arquitetura de microsserviços integrados a partir de orientação a eventos.

Desenvolvido a partir da livecoding com o especialista [Daniel Hatanaka]([Daniel Hatanaka | LinkedIn](https://www.linkedin.com/in/hatanakadaniel/)).

## Stack

- Sprig
  - Spring Boot
  - Spring Cloud Stream

- Apache Kafka
- Gradle
- Docker-compose
- PostgreSQL



## Diretórios

- #### Frontend

  - **Possui um front-end estático com formulário de preenchimento para acessar a api.**

- #### Checkout

  - **Responsável por receber a requisição de pagamento, armazenar e informar a parte que irá processar o pagamento.**
  
- #### Payment

  - **Irá receber os dados de pagamento, processar e retornar uma mensagem independente do resultado do processamento.**

    

Repositórios originais desenvolvido durante a livecoding: 

- https://github.com/hatanakadaniel/ecommerce-checkout-api
- https://github.com/hatanakadaniel/ecommerce-payment-api