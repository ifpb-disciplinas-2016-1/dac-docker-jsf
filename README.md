##passo 1 - Limpando e gerando a pasta target
mvn clean install

##passo 2 - Criando a imagem da aplicação
docker build -t dac-exemplo-jsf .

##passo 3 - Criando a imagem do banco de dados
-na pasta postgres, executar:
docker build -t dac-postgres .

##passo 4 - Iniciando o container do banco
docker run -p 5432:5432 -d dac-postgres

##passo 5 - Verificando a criação do banco e da tabela
docker exec -it <id-container>a1ee3ef8a6c0 psql -U postgres dac-jsf
dac-jsf=# \dt
dac-jsf=# select * from pessoa;

##passo 6 - Iniciando o container da aplicação
docker run -ti -p 8080:8080 -p 4848:4848 dac-exemplo-jsf
