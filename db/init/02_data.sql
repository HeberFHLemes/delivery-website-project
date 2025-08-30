INSERT INTO produto(nome, descricao, preco, imagem) VALUES(
    'X-Tudo',
    'O Hambúrguer mais completo de Caxias!',
    20.99,
    'xtudo.jpg'
);

INSERT INTO produto(nome, descricao, preco, imagem) VALUES(
    'Batata-Frita',
    'Porção de batata-frita média',
    6.99,
    'batata-frita.jpg'
);

INSERT INTO produto(nome, descricao, preco, imagem) VALUES(
    'Pepsi',
    'Refrigerante Pepsi de 600ml',
    7.99,
    'cola.jpg'
);

INSERT INTO ingrediente(nome) VALUES('Pão');
INSERT INTO ingrediente(nome) VALUES('Carne');
INSERT INTO ingrediente(nome) VALUES('Alface');
INSERT INTO ingrediente(nome) VALUES('Tomate');
INSERT INTO ingrediente(nome) VALUES('Molho da Casa');
INSERT INTO ingrediente(nome) VALUES('Queijo');
INSERT INTO ingrediente(nome) VALUES('Cebola');

INSERT INTO produto_ingrediente (produto_id, ingrediente_id, quantidade, unidade_medida)
SELECT p.id, i.id, 1, 'UN'
FROM produto p JOIN ingrediente i ON i.nome = 'Pão'
WHERE p.nome = 'X-Tudo'
UNION ALL
SELECT p.id, i.id, 200, 'g'
FROM produto p JOIN ingrediente i ON i.nome = 'Carne'
WHERE p.nome = 'X-Tudo'
UNION ALL
SELECT p.id, i.id, 5, 'g'
FROM produto p JOIN ingrediente i ON i.nome = 'Alface'
WHERE p.nome = 'X-Tudo';