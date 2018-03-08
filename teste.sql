/* 
a. Crie uma tabela Pais com os atributos id (int autoincrement) , nome(varchar 100),
populacao (bigint) e area (number 15,2). Carregue alguns países. Consulte a Wikipedia para
obter as informações de população e área.
*/
CREATE DATABASE Aula02;

USE Aula02;

CREATE TABLE pais (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    populacao BIGINT,
    area NUMERIC(15,2)
);

INSERT INTO pais (id, nome, populacao, area) VALUES (1, "EUA", "308745538 ", "9371175");
INSERT INTO pais (id, nome, populacao, area) VALUES (2, "Brasil", "207660929", "8515767049");
INSERT INTO pais (id, nome, populacao, area) VALUES (3, "México", "119530753", "1958201");
INSERT INTO pais (id, nome, populacao, area) VALUES (4, "Canadá", "	35151728", "9984670");
INSERT INTO pais (id, nome, populacao, area) VALUES (5, "Bolivia", "10969049", "1098581");
