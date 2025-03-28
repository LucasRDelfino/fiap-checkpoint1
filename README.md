# fiap-checkpoint1

# Lucas Rodrigues Delfino - RM550196
# Pedro Henrique Silva de Morais - RM98804


Criar um novo pedido

POST /pedidos

{
    "clienteNome": "Lucas",
    "valorTotal": 80.0
}

Buscar todos os pedidos

GET /pedidos

Buscar um pedido pelo ID

GET /pedidos/{id}

Atualizar um pedido existente

PUT /pedidos/{id}

{
    "clienteNome": "Lucas Silva",
    "valorTotal": 100.0
}

Deletar um pedido

DELETE /pedidos/{id}

Testes Realizados

Foram realizados 5 testes principais usando o Postman:

Criar um novo pedido (POST /pedidos)

![image](https://github.com/user-attachments/assets/f12a1026-f4fb-4a85-a41d-05c967e12992)

Buscar todos os pedidos (GET /pedidos)

![image](https://github.com/user-attachments/assets/a61e5835-439c-426d-9de3-6e7c649d7199)

Buscar um pedido específico (GET /pedidos/{id})

![image](https://github.com/user-attachments/assets/f69fa86c-b5d6-49d0-b83c-e245c628de36)

Atualizar um pedido existente (PUT /pedidos/{id})

![image](https://github.com/user-attachments/assets/41959ff2-8396-4647-a61f-4547dff6ca38)

Deletar um pedido (DELETE /pedidos/{id})
![image](https://github.com/user-attachments/assets/bf8939f6-6a3e-4b4e-a13f-0bdadfeee323)
