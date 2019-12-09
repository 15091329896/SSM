`tmptest`
create table book(
	id int primary key,
	name varchar(45)
	
);

create table role(
	id int,
	role_name varchar(45),
	note varchar(45)
	
);

create table people(
	id int,
	name varchar(45),
	sex varchar(45)
)



create table people(
	id int primary key auto_increment,
	name varchar(45),
	man_note varchar(45)
)

drop table people;

select * from people;

insert into people values(1001, '李白', "备注");
delete from people where id = 1001

insert into people (
	name,
	man_note
)values(
	'李白',
	"备注"	
);

insert into people values(1001, '李白的老婆', 'FEMALE');

select * from  people where sex = 'MALE' and name = '李白';


create database chapter5;

use chapter5;

create table t_role (
id int(12) auto_increment,
role_name varchar(60) not null,
note varchar(256) null,
primary key(id)
);

insert into t_role(role_name, note) values('role_name_1', 'note_1');
insert into t_role(role_name, note) values('role_name_2', 'note_2');
insert into t_role(role_name, note) values('role_name_3', 'note_3');

create table t_role2 (
id int(12),
role_name varchar(60) not null,
note varchar(256) null,
primary key(id)
);

create table t_user (
id int(12) auto_increment, 
user_name varchar(60) not null, 
real_name varchar(60) not null, 
sex int(3), 
moble varchar(20) not null, 
email varchar(60) not null, 
note varchar(256) not null,
primary key(id)
);

create table t_user_role (
id int(12) auto_increment, 
user_id int(12) not null,
role_id int(12) not null,
 primary key(id),
 unique(user_id, role_id)
) ;
/*

先清除

*/
drop table if exists t_female_health_form;
drop table if exists t_male_health_form;
drop table if exists t_task;
drop table if exists t_work_card;
drop table if exists t_employee_task;
drop table if exists t_employee;

/*==============================================================*/
/* Table: t_employee                                            */
/*==============================================================*/
create table t_employee
(
   id                   int(12) not null auto_increment,
   real_name            varchar(60) not null,
   sex                  int(2) not null comment '1 - 男 
            0 -女',
   birthday             date not null,
   mobile               varchar(20) not null,
   email                varchar(60) not null,
   position             varchar(20) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_employee_task                                       */
/*==============================================================*/
create table t_employee_task
(
   id                   int(12) not null auto_increment,
   emp_id               int(12) not null,
   task_id              int(12) not null,
   task_name            varchar(60) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_female_health_form                                  */
/*==============================================================*/
create table t_female_health_form
(
   id                   int(12) not null auto_increment,
   emp_id               int(12) not null,
   heart                varchar(64) not null,
   liver                varchar(64) not null,
   spleen               varchar(64) not null,
   lung                 varchar(64) not null,
   kidney               varchar(64) not null,
   uterus               varchar(64) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_male_health_form                                    */
/*==============================================================*/
create table t_male_health_form
(
   id                   int(12) not null auto_increment,
   emp_id               int(12) not null,
   heart                varchar(64) not null,
   liver                varchar(64) not null,
   spleen               varchar(64) not null,
   lung                 varchar(64) not null,
   kidney               varchar(64) not null,
   prostate             varchar(64) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_task                                                */
/*==============================================================*/
create table t_task
(
   id                   int(12) not null auto_increment,
   title                varchar(60) not null,
   context              varchar(256) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_work_card                                           */
/*==============================================================*/
create table t_work_card
(
   id                   int(12) not null auto_increment,
   emp_id               int(12) not null,
   real_name            varchar(60) not null,
   department           varchar(20) not null,
   mobile               varchar(20) not null,
   position             varchar(30) not null,
   note                 varchar(256),
   primary key (id)
);

alter table t_employee_task add constraint FK_Reference_4 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;
alter table t_employee_task add constraint FK_Reference_8 foreign key (task_id)
      references t_task (id) on delete restrict on update restrict;
alter table t_female_health_form add constraint FK_Reference_5 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;
alter table t_male_health_form add constraint FK_Reference_6 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;
alter table t_work_card add constraint FK_Reference_7 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;







