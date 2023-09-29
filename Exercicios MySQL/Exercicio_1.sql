create database db_rh;

use db_rh;

create table db_rh(
	id bigint auto_increment,
    funcionario varchar(255)not null,
    cargo varchar(255) not null,
    horario varchar(255) not null,
    numero int,
    faltas decimal not null,
    primary key (id)
    );
    
   INSERT INTO db_rh(funcionario, cargo, horario, numero, faltas, salario)
   values ("marcos", "ajudante", "manha", 1, 5, 1.500);
   
   INSERT INTO db_rh(funcionario, cargo, horario, numero, faltas, salario)
   values ("pedro", "ajudante", "manha", 2, 0, 1.600);
   
   INSERT INTO db_rh(funcionario, cargo, horario, numero, faltas, salario)
   values ("ana", "supervisor", "tarde", 5, 2, 3.000);
   
   
  
   alter table db_rh drop salario;
   alter table db_rh add salario decimal;
   
   select * from db_rh;
   select * from db_rh where salario >= 2000;
	select * from db_rh where salario < 2000;
   
   
   UPDATE db_rh
   SET salario = 3000.99
   WHERE id=4
   
   
   
	

