CREATE DATABASE db_generation_game_online;


USE db_generation_game_online;


CREATE TABLE tb_classes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL
);


INSERT INTO tb_classes (nome, tipo) VALUES
    ('Guerreiro', 'Melee'),
    ('Mago', 'Magia'),
    ('Arqueiro', 'Ranged'),
    ('Ladrão', 'Agilidade'),
    ('Cavaleiro', 'Melee');


CREATE TABLE tb_personagens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nivel INT NOT NULL,
    ataque INT NOT NULL,
    defesa INT NOT NULL,
    classe_id INT,
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);


INSERT INTO tb_personagens (nome, nivel, ataque, defesa, classe_id) VALUES
    ('Herói 1', 10, 2500, 1500, 1),
    ('Feiticeiro 1', 8, 1800, 1200, 2),
    ('Arqueira 1', 9, 2100, 1100, 3),
    ('Ladrão 1', 7, 2200, 900, 4),
    ('Cavaleiro 1', 11, 2800, 2000, 5),
    ('Herói 2', 12, 2600, 1600, 1),
    ('Mago 1', 6, 1600, 800, 2),
    ('Arqueiro 2', 10, 2300, 1300, 3);


SELECT * FROM tb_personagens WHERE ataque > 2000;


SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;


SELECT * FROM tb_personagens WHERE nome LIKE '%C%';


SELECT tb_personagens.nome, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.tb_classes_id;




SELECT tb_personagens.*, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id
WHERE tb_classes.nome = 'Arqueiro';




