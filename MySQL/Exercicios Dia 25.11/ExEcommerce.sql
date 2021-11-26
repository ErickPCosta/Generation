create database db_ecommerce;
/*Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment unique,
nome varchar(255) not null,
cor varchar(255) not null,
tamanho int,
quantidade int,
preco decimal not null,
primary key (id)
);

insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Camiseta", "Preta", 3, 10, 25.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Calça jeans", "Azul", 40, 5, 50.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Tênis", "Vermelho e preto", 42, 3, 100.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Bermuda", "verde", 44, 20, 30.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Blusa moletom", "Azul Marinho", 4, 10, 85.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Meia socket", "Branca", 40, 50, 15.00);
insert into tb_produtos(nome, cor, tamanho, quantidade, preco) values ("Short", "Cinza", 46, 15, 25.00);

select * from tb_produtos;

select * from tb_produtos where preco>500;

select * from tb_produtos where preco<500;

update tb_produtos set preco = 600.00 where id = 3;

select concat('R$ ',FORMAT(preco, 2,'pt_br')) as preco from tb_produtos;