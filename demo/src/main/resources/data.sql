INSERT INTO produto (id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'cama', 'box duplex com cabeceira', 'https://www.google.com/aclk?sa=l&ai=DChcSEwiq39nl953zAhWThJEKHb0sDvUYABAFGgJjZQ&sig=AOD64_1e9ye6pvLVb9NTNPy-APDK6L84EA&adurl&ctype=5&ved=2ahUKEwiGwM7l953zAhVMpZUCHbiLC1MQvhd6BAgBEEs ',
        '01/01/2007', '25/09/2021', 2204.91 );
INSERT INTO produto (id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (2, 'geladeira', 'Frost Free de Baixo consumo', 'https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwi7hI2B-p3zAhUM67IKHfE-A7UYABAGGgJscg&ae=2&ei=txdRYceaCrnV1sQPgNWf4A0&ohost=www.google.com&cid=CAESQOD23p15_ih00KUINnVEowA5-srsWmfrdoYQhYjwexdW8kacjnCHKt_32V4epF8F3krdTHrxENcIvKU8FE27xaw&sig=AOD64_2o-w9W1WGrqfRItU04j46hombWqg&ctype=5&q=&sqi=2&ved=2ahUKEwiH0vqA-p3zAhW5qpUCHYDqB9wQ9aACegQIARBW&adurl',
        '05/02/2006', '25/09/2021', 3398.00 );


INSERT INTO categoria (id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'img1', 'Moveis/Conforto', 'Aqui  voce encontra produtos de cama mesa e banho');
INSERT INTO categoria (id, imagemSimboloUrl, nome, descricao)
VALUES (2, 'img2', 'Eletrodomesticos', 'Aqui nos temos os principais eletrodomesticos que voce precisa ter em sua casa');

INSERT INTO promocao (id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'Natal Familiar', '25% sobre todo os Eltrodomesticos', '24/12/2021', '26/12/2021', '01/01/2021', '26/09/2021');

INSERT INTO promocao (id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (2, 'Black Fraude da Virada', 'Nosso Revellion ta doido', '01/01/2022', '02/01/2022', '08/01/2021', '09/12/2021');

INSERT INTO categoriaProduto (id, categoriaId, produtoId)
VALUES (2, 2, 1);
INSERT INTO categoriaProduto (id, categoriaId, produtoId)
VALUES (1, 2, 2);



INSERT INTO promocaoItem (id, valorPromocao, dataCadastro, dataUltimaAtualizacao, produtoId, promocaoId)
VALUES (1, 2000.00, '24/09/2021', '25/09/2021', 1, 1);

INSERT INTO promocaoItem (id, valorPromocao, dataCadastro, dataUltimaAtualizacao, produtoId, promocaoId)
VALUES (2, 2986.57, '24/09/2021', '25/09/2021', 2, 2);







