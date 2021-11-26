create database db_rh;
/*Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

use db_rh;

create table tb_funcionaries(
id bigint auto_increment unique,
nome varchar(255)not null,
idade int,
setor varchar(255)not null,
cargo varchar(255)not null,
salario decimal not null,
primary key(id)
);

insert into tb_funcionaries(nome, idade, setor, cargo, salario) values ("Erick", 18, "Setor Operacional", "Developer", 35000);
insert into tb_funcionaries(nome, idade, setor, cargo, salario) values ("Maria", 20, "Setor Comercial", "Jovem Aprendiz", 1500);
insert into tb_funcionaries(nome, idade, setor, cargo, salario) values ("João", 44, "Setor Admistrativo", "Auditoria", 7000);
insert into tb_funcionaries(nome, idade, setor, cargo, salario) values ("Lilian", 20, "Financeiro", "Gestão de tesouraria e compras", 10000);

select * from tb_funcionaries;

select * from tb_funcionaries where salario>2000;

select * from tb_funcionaries where salario<2000 ;

update tb_funcionaries set cargo="Executivo(a) de Vendas" where id=2;
