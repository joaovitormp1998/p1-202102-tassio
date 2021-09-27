CREATE TABLE  produto (
                          id INT PRIMARY KEY ,
                          nome VARCHAR(100),
                          descricao VARCHAR(100),
                          fotoUrl VARCHAR(100),
                          dataHoraCadastro VARCHAR(20),
                          dataHoraUltimaAtualizacao VARCHAR(20),
                          valorUnitario FLOAT
);
CREATE TABLE categoria (
                           id INT PRIMARY KEY ,
                           imagemSimboloUrl VARCHAR(100),
                           nome VARCHAR(100),
                           descricao VARCHAR(300)
);
CREATE TABLE categoriaProduto(
                                 id INT PRIMARY KEY ,
                                 categoriaId INT NOT NULL,
                                 produtoId INT NOT NULL,
                                 foreign key (categoriaId) references categoria(id),
                                 foreign key (produtoId) references produto(id)
);
CREATE TABLE promocao(
                         id INT PRIMARY KEY ,
                         nome VARCHAR(100),
                         descricao VARCHAR(300),
                         dataInicio VARCHAR(20) ,
                         dataFim VARCHAR(20),
                         dataHoraCadastro VARCHAR(20),
                         dataHoraUltimaAtualizacao VARCHAR(20)

);
CREATE TABLE promocaoItem
(
    id INT PRIMARY KEY ,
    valorPromocao FLOAT,
    dataHoraCadastro VARCHAR(20),
    dataHoraUltimaAtualizacao VARCHAR(20),
    produtoId INT NOT NULL,
    promocaoId INT NOT NULL,
    foreign key (promocaoId) references promocao(id),
    foreign key (produtoId) references produto(id)
);