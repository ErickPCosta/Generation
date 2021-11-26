create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment unique,
nome varchar(255) not null,
ataque bigint not null,
vida int not null,
arma varchar(255) not null,
primary key (id)
);

insert into tb_classe (nome, ataque, vida, arma) values ("Arqueiro", 3000, 2000, "Arco e Flecha");
insert into tb_classe (nome, ataque, vida, arma) values ("Mago", 2000, 1000, "Cajado");
insert into tb_classe (nome, ataque, vida, arma) values ("Guerreiro", 1000, 3000, "Espada da Justiça");
insert into tb_classe (nome, ataque, vida, arma) values ("Paladino", 5000, 4000, "Lança Divina");
insert into tb_classe (nome, ataque, vida, arma) values ("Bruxa", 2000, 3000, "Luva das Trevas");

create table tb_personagens(
id bigint auto_increment unique,
nome varchar(255) not null,
ataqueBasico varchar(255) not null,
ataqueFatal varchar(255) not null,
defesa int not null,
nivel int not null,
classe_id bigint,
primary key (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);

insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("NoobMaster69", "Flecha mortal", "Flecha flamejante", 500, 15, 1);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Wyllie", "Tempestade de gelo", "Torre elétrica", 3000, 30, 2);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Walli-e", "Golpe de luz", "Trombetas do além", 2000, 50, 4);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Fallen", "Quick Scope", "STOP BLOWING MY MIND", 10000, 32, 1);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Fer", "Ataque rapido", "Golpe da justiça", 1500, 31, 3);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("FNX", "Renascer das cinzas", "SEM FNX, SEM MAJOR", 1000, 30, 5);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Coldzera", "Canhão de fogo", "Mirage", 5000, 29, 2);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Taco", "Absorção de poder", "Bloqueador surpresa", 2500, 27, 4);
insert into tb_personagens(nome, ataqueBasico, ataqueFatal, defesa, nivel, classe_id) values ("Zews", "Mundo de ilusão", "Caminhos sem fim", 999, 27, 5);

select * from tb_personagens;

select * from tb_classe where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 2000;

select * from tb_personagens where nome like "%w%";

/*select * from tb_personagens inner join tb_classes on tb_personagens.classe_id = tb_classe.id;  
PERGUNTAR PARA O PROFESSOR PQ N FUNCIONA */

select tb_classe.nome,tb_classe.ataque,tb_classe.vida,tb_classe.arma,
tb_personagens.nome, tb_personagens.ataqueBasico, tb_personagens.ataqueFatal, tb_personagens.defesa,
tb_personagens.nivel, tb_personagens.classe_id 
from tb_personagens
inner join tb_classe
on tb_classe.id = tb_personagens.classe_id ;


select * from tb_personagens where classe_id = 1;

select tb_classe.nome,tb_classe.ataque,tb_classe.vida,tb_classe.arma,
tb_personagens.nome, tb_personagens.ataqueBasico, tb_personagens.ataqueFatal, tb_personagens.defesa,
tb_personagens.nivel, tb_personagens.classe_id 
from tb_personagens
inner join tb_classe
on tb_classe.id = tb_personagens.classe_id
where classe_id = 1 ;
