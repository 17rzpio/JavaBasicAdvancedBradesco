/*create database cadastrodois
default character set utf8
default collate utf8_general_ci;


use cadastrodois;


create table pessoasdois(
id int not null auto_increment,
nome varchar(30) not null,
nascimento date,
sexo enum('m','f'),
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) default 'brasil',
primary key (id)
)default charset = utf8;*/
/*insert into pessoasdois
(id,nome,nascimento,sexo,peso,altura,nacionalidade)
values
('1','rodrigo','1990-10-01', 'm','78.5','1.83','brasil');*/


/*insert into pessoasdois
(nome,nascimento,sexo,peso,altura,nacionalidade)
values
('rodrigo','1990-10-01', 'm','78.5','1.83','brasil');*/
/*insert into pessoasdois values
(DEFAULT,'rodrigo','1990-10-01', 'm','78.5','1.83','brasil');*/

/*
insert into pessoasdois values
(DEFAULT,'rodrigo','1990-10-01', 'm','78.5','1.83','brasil'),
(DEFAULT,'rodrigo','1990-10-01', 'm','78.5','1.83','brasil'),
(DEFAULT,'rodrigo','1990-10-01', 'm','78.5','1.83','brasil')
;


select * from pessoasdois;*/

/*alter table pessoasdois
add column profissao varchar(10);

alter table pessoasdois
drop column profissao;*/



/*alter table pessoasdois
add column profissaodois varchar(10) after nome;*/

/*alter table pessoasdois
add column codigo int first;*/

/*alter table pessoasdois
modify column profissao varchar(20);*/


/*alter table pessoasdois
modify column prof varchar(20) not null default '';



alter table pessoasdois
change column profissaodois prof varchar(20);*/

/*alter table pessoasdois
rename to pessoastres;*/
/*
create table if not exists cursos(
nome varchar(30) not null unique,
descricao text,
carga int unsigned,
totaulas int,
ano year default '2016'
)default charset=utf8;*/

/*alter table cursos
add column idcurso int first;

alter table cursos
add primary key(idcurso);
*/
/*
insert into cursos values
(1,'rodrigo','1990-10-01', '8','785','1833'),
(2,'hodrigo','9-10-01', '7','7851','183'),
(3,'rodrico','1990-12-01', '5','7825','1183');

#select *from cursos;

update cursos
set nome = 'rotrigo'
where idcurso = '1';

update cursos
set nome = 'rutrigo', totaulas= '7'
where idcurso = '1';

update cursos
set nome = 'rutrigo', totaulas= '7'
where idcurso = '1'
limit 1;*/

/*delete from cursos
where idcurso = '3';

delete from cursos
where year='785'
limit 1;


truncate table cursos;*/
/*
insert into cursos values
(291,'rodrsigo','1990-10-01', '83','785','1813'),
(852,'hodreigo','9-10-01', '72','7851','1823'),
(638,'rodfrico','1990-12-01', '15','7825','1183'),
(521,'roedrigo','1990-10-01', '38','785','1433'),
(141,'roqdrigo','1990-10-01', '58','785','1533'),
(114,'rodiarigo','1990-10-01', '48','7085','633'),
(213,'rodlrigo','1990-10-01', '38','7985','1733'),
(135,'rodirigo','1990-10-01', '28','7785','1833'),
(441,'rodrtigo','1990-10-01', '48','7685','1833'),
(158,'rodriwgo','1990-10-01', '68','7585','1033'),
(1685,'rodrpigo','1990-10-01', '8','7485','833'),
(381,'rodriçgo','1990-10-01', '80','7385','183'),
(21191,'rodrimgo','1990-10-01', '82','7285','133'),
(104,'rodringo','1990-10-01', '81','7185','1833');*/
#select nome, carga, ano from cursos;
/*select * from cursos
where totaulas = '785'
order by nome;
select nome, carga from cursos
where totaulas between '0' and '800'
order by nome;*/
/*select nome, carga from cursos
where totaulas != '0' and ano <'800'
order by nome;*/
/*
select nome, carga from cursos
where nome like 'r%'
order by totaulas;*/
#update cursos set nome ='hodrigo' where idcurso='2';
/*select nome, carga from cursos
where nome like 'r%o_'
order by totaulas;*/
/*select nome, carga from cursos
where nome like 'r%g_'
order by totaulas;*/
#select distinct carga from cursos;
#select count(nome) from cursos;
#select max(totaulas) from cursos;
#elect min(totaulas) from cursos;
#diz maximo dentro de um campo
#select sum(totaulas) from cursos;
#select avg(totaulas) from cursos;
#select nome from pessoasdois where sexo ='f';
#select * from pessoasdois where nascimento between '2000/01/01' and '2015/12/31';
#select nome from pessoasdois where profissaodois = 'programador';
#select * from pessoasdois where sexo ='f' and nacionalidade = 'brasil' and nome like 'J%';
/*
insert into pessoasdois values
(DEFAULT,default,'rodrigo silva','teste','1990-10-01', 'm','78.5','1.83','suecia','professor');*/
#select nome, nacionalidade from pessoasdois where nome like '%silva%' and peso < 100;
#select max(altura) from pessoasdois where sexo ='m' and nacionalidade ='brasil';
#select avg(peso) from pessoasdois;
/*
insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','1990-10-01', 'f','68.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2001-10-01', 'f','58.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','1989-10-01', 'f','48.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigo silva','teste','1990-10-01', 'm','38.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigo silva','teste','1990-10-01', 'm','28.5','1.83','brasil','professor'),
(DEFAULT,default,'rodrigoa silva','teste','1990-10-01', 'f','68.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','1995-10-01', 'f','58.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','1990-10-01', 'f','48.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigo silva','teste','1990-10-01', 'm','38.5','1.83','suecia','professor'),
(DEFAULT,default,'rodrigo silva','teste','1990-10-01', 'm','28.5','1.83','brasil','professor');*/
#select min(peso) from pessoasdois where sexo = 'f' and nacionalidade != 'brasil' and nascimento between '1990/01/01' and '2000/12/31';
/*
insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','1990-10-01', 'f','68.5','1.93','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2001-10-01', 'f','58.5','2.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','1989-10-01', 'f','48.5','9.83','suecia','professor');*/
#select count(*) from pessoasdois where altura > '1.9';
/*select totaulas, count(nome) from cursos
group by totaulas;*/
/*select totaulas, count(nome) from cursos
group by totaulas
having count(nome)>1;*/
/*select carga, count(*) from cursos
group by carga
having carga >(select avg(carga) from cursos);*/
/*select profissaodois, count(profissaodois) from pessoasdois
group by profissaodois;*/
/*select sexo,count(nome) from pessoasdois where nascimento > '2005/01/01'
group by sexo;*/

/*
insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','68.5','1.93','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','58.5','2.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','48.5','9.83','suecia','professor');*/
/*insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','68.5','1.93','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','58.5','2.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','48.5','9.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','68.5','1.93','senegal','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','58.5','2.83','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','48.5','9.83','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','68.5','1.93','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','58.5','2.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','48.5','9.83','suica','professor');*/
/*
select count(nome), nacionalidade from pessoasdois where nacionalidade != 'brasil'
group by nacionalidade 
having count(nacionalidade) >3 ;*/


/*
insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','368.5','0.93','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','358.5','2.83','suecia','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','348.5','9.83','suecia','professor');
insert into pessoasdois values
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','368.5','1.93','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','358.5','2.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','348.5','0.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','368.5','1.93','senegal','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','358.5','2.83','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','348.5','9.83','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2006-10-01', 'm','368.5','0.93','holanda','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2009-10-01', 'f','358.5','2.83','suica','professor'),
(DEFAULT,default,'rodrigoa silva','teste','2089-10-01', 'm','348.5','9.83','suica','professor');
*//*
select altura, count(*) from pessoasdois where peso > '100'
group by altura
having altura >(select avg(altura) from pessoasdois);*/
/*alter table pessoasdois
add column cursopreferido int;
alter table pessoasdois
add foreign key (cursopreferido)
references cursos (idcurso);*/
#desc pessoasdois;
/*update pessoasdois
set cursopreferido = '3'
where id = '1';
select pessoasdois.nome, pessoasdois.cursopreferido, cursos.nome, cursos.ano from pessoasdois join cursos
on cursos.idcurso = pessoasdois.cursopreferido;*/
/*select pessoasdois.nome, pessoasdois.cursopreferido, cursos.nome, cursos.ano from pessoasdois left outer join cursos
on cursos.idcurso = pessoasdois.cursopreferido;*/
/*create table pessoaassiste(
id int not null auto_increment,
data date,
idpessoa int,
idcurso int,
primary key (id),
foreign key (idpessoa) references pessoasdois(id),
foreign key (idcurso) references cursos(idcurso)
) default charset = utf8;*/
/*insert into pessoaassiste values
(default,'1990-09-01','1','1');*/
/*select * from pessoasdois p
join pessoaassise a
on p.id = a.idpessoa;*/
/*select * from pessoasdois p
join pessoaassiste a
on p.id = a.idpessoa
join cursos c
on a.idcurso = c.idcurso;*/

create database sistema_de_funcionarios;
use sistema_de_funcionarios;

create table funcionarios(
id int not null auto_increment,
nome varchar(50) not null,
sobrenome varchar(50) not null,
data_nascimento varchar(50) not null,
email varchar(50),
cargo int not null,
salario decimal(13,2),
primary key (id)
)default charset = utf8;

create table cargos(
id int not null auto_increment,
nome varchar(50) not null,
primary key (id)
)default charset = utf8;





