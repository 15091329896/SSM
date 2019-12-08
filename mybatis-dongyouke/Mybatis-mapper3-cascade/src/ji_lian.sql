/*======================================================*/
/*	Table:	t_employee						*/
/*======================================================*/
create table t_employee
(
	id  int(12) not null auto_increment,
	real_name varchar(60) not null,
	sex int(2) not null comment '1 - 男 0 - 女',
	birthday date not null,
	mobile varchar(20) not null,
	email varchar(60) not null,
	position varchar(20) not null,
	note varchar(256),
	primary key (id)
);


select * from t_employee;

select str_to_date('20190101',"%Y%m%d");

insert into t_employee(
	real_name,
	sex,
	birthday,
	mobile,
	email,
	position,
	note

	)
	values(
		'李白', 
		1, 
		20190101,
		'15012222',
		'email地址',
		'李住址',
		'李白的备注'
		 );




/*======================================================*/
/*	Table:	t_employee_task						*/
/*======================================================*/
create table t_employee_task
(
	id  int(12) not null auto_increment,
	emp_id int(12) not null,
	task_id int(12) not null,
	task_name varchar(60) not null,
	note varchar(256),
	primary key (id)
);
drop table if exists t_employee_task


/*======================================================*/
/*	Table:	t_female_health_form */
/*======================================================*/

create table t_female_health_form
(
	id  int(12) not null auto_increment,
	emp_id int(12) not null,
	heart varchar(64) not null,
	liver varchar(64) not null,
	spleen varchar(64) not null,
	lung varchar(64) not null,
	kidney varchar(64) not null,
	uterus varchar(64) not null,
	note varchar(256),
	primary key (id)
);

/*======================================================*/
/*	Table:	t_male_health_form */
/*======================================================*/

create table t_male_health_form
(
	id  int(12) not null auto_increment,
	emp_id int(12) not null,
	heart varchar(64) not null,
	liver varchar(64) not null,
	spleen varchar(64) not null,
	lung varchar(64) not null,
	kidney varchar(64) not null,
	prostate varchar(64) not null,
	note varchar(256),
	primary key (id)
);
select * from t_male_health_form;
/*======================================================*/
/*	Table:	t_task */
/*======================================================*/
drop table if exists t_task

create table t_task
(
	id  int(12) not null auto_increment,
	title varchar(60) not null,
	context varchar(256) not null,
	note varchar(256),
	primary key (id)
);

select * from t_task;

insert into t_task (title, context, note)
	values("任务1", "任务1内容", "任务备注");

/*======================================================*/
/*	Table:	t_work_card */
/*======================================================*/

create table t_work_card
(
	id  int(12) not null auto_increment,
	emp_id int(12) not null,
	real_name varchar(60) not null,
	department varchar(20) not null,
	mobile varchar(20) not null,
	position varchar(256) not null,
	note varchar(256),
	primary key (id)
);

drop table if exists t_work_card

insert into t_work_card 
	values 
	(
	2,
	 2, 
	 "李白", 
	 "部门1", "15091329896", "地址1", "备注1"
	
	)
select * from t_work_card



alter table t_employee_task 
	add constraint fk_reference_4 
		foreign key (emp_id)
		references t_employee (id) 
		on delete restrict 
		on update restrict;
		
alter table t_employee_task 
	add constraint fk_reference_8 
		foreign key (task_id)
		references t_employee_task (id) 
		on delete restrict 
		on update restrict;
		
		
alter table t_female_health_form 
	add constraint fk_reference_5 
		foreign key (emp_id)
		references t_employee (id)
		on delete restrict 
		on update restrict;

alter table t_male_health_form 
	add constraint fk_reference_6 
		foreign key (emp_id)
		references t_employee (id) 
		on delete restrict 
		on update restrict;

alter table t_work_card
	add constraint fk_reference_7
		foreign key (emp_id)
		references t_employee (id)
		on delete restrict
		on update restrict;
		
select     id, title, context, note    from t_task;		
		