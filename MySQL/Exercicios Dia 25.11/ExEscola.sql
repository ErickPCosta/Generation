create database db_escola;
/*Atividade 3
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos estudantes deste registro dessa escola.
Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos estudantes para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;
Faça um select que retorne o/as estudantes com a nota maior do que 7.
Faça um select que retorne o/as estudantes com a nota menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

use db_escola;

create table tb_estudantes(
id bigint auto_increment unique,
nome varchar(255)not null,
idade int,
turma int,
ano varchar(255)not null,
periodo varchar(255) not null,
nota int,
primary key (id)
);

insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Erick Costa", 18, 38, "1º Ano", "Diurno",10);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Maria Silva", 20, 40, "2º Ano", "Noturno",8);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("José Sousa", 32, 39, "1º Ano", "Vespertino",7);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Aimée Thompson", 18, 38, "1º Ano", "Diurno",10);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Rafael Queiróz", 19, 38, "1º Ano", "Diurno",10);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Ronaldo Nazario", 43, 42, "2º Ano", "Noturno",9);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Rogerio Ceni", 44, 40, "2º Ano", "Noturno",8);
insert into tb_estudantes(nome, idade, turma, ano, periodo, nota) values ("Romário Faria", 50, 44, "3º Ano", "Noturno",7);

select * from tb_estudantes;

select * from tb_estudantes where nota>7;

select * from tb_estudantes where nota<7;

update tb_estudantes set nota=5 where id = 3;
