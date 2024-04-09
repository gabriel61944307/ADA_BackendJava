## Para executar esse projeti é necessário seguir alguns passos:

### 1: Executar o comando docker-compose up na raiz do projeto
#####  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; O arquivo docker-compose.yml na raiz do projeto contem as especificações do container que suporta a aplicação

### 2: Realizar a criação da tabela no banco de dados utilizando o seguinte script sql:
    CREATE TABLE produtos (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(100),
        quantidade INT,
        categoria VARCHAR(50),
        preco DECIMAL(10, 2)
    );

### Obs: O arquivo .csv foi gentilmente cedido pelo colega Thiago Figueiró da turma 1112 de Back-End Java