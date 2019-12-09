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
	id int,
	name varchar(45)
	
)

drop table if exists people;

select * from people;

insert into people values(1001, '李白', "备注");
delete from people where id = 1001

insert into people (
	name
)values(
	"李白"
);
select abs(-1)
select abs(-0.5) from people;
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


create procedure count_all_peopple (
	 in name varchar,
	out people_num  int
) begin
	
	select count(*) into people_num from people
		where name  = name;
end

create  procedure  ps_count  (out  num  int)
     begin
       select  count(*)  into  num  from  people
     end; 
     
     
     
delimiter //
create procedure ps_count()
	begin
		select count(*) from people;
	end //
	
delimiter;	
	
	
create procedure  ps_count()
begin
	select count(*) from people;
end
	
	
	
call tmptest.ps_count();





create table t_student
(
    id int(11) primary key auto_increment,
  name varchar(255) not null,
  age  int(11) not null
);

 
insert into t_student values(null,'大宇',22),(null,'小宇',20);

drop procedure if exists getStuById;
select * from t_student
 
delimiter //  -- 定义存储过程结束符号为//


create procedure getStuById(in stuId int(11),out stuName varchar(255),out stuAge int(11)) -- 定义输入与输出参数
comment 'query students by their id'  -- 提示信息
sql security definer  -- DEFINER指明只有定义此SQL的人才能执行，MySQL默认也是这个
begin
   select name ,age into stuName , stuAge from t_student where id = stuId; -- 分号要加
end // -- 结束符要加

select * from people; 

delimiter ;  -- 重新定义存储过程结束符为分号

call tmptest.getStuById(1,@name,@age);



//
create procedure procedure_test_4()
begin
	
	select * from people;
end


drop procedure if exists procedure_test5;
delimiter $$

create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`()
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare var_id int default 100;
		set var_id = 120;
		select var_id;
		select * from people;
    end$$

delimiter ;


drop procedure if exists procedure_test_6;
delimiter $$
	create procedure procedure_test_6()
		begin
			select * from people;
		end $$

delimiter $$



/*
	存储过程
*/

drop procedure if exists procedure_test_7; 

delimiter $$
	
	create procedure procedure_test_7(
		in id int
	)
		begin
			declare var_name varchar(60);
			
			/*
				变量赋值
				set
				select into
			*/
			#set var_name = "李白";
			
			select name into var_name 
				from people p
				where p.id = id;
			
			select var_name;
		end $$

delimiter $$


call procedure_test_7(10);


/*
	通过游标遍历取出结果集中的数据
	

*/















/*
	函数：必须要有返回值

*/


drop function if exists function_test_5;
delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    function `tmptest`.`function_test_5`(id int)
    returns varchar(60)
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		return (
			select name from people p
				where p.id = id
		);
    end$$
delimiter ;



select function_test_5(10);


drop procedure if exists procedure_test5;

delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`(out num int)
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare var_name varchar(60);
		declare var_num int default 0;
	
		declare cursor_test_1 cursor for
			select name from people;
		set var_num = 0;
		open cursor_test_1;
		fetch cursor_test_1 into var_name;
		while var_name <> null do
			set var_num = var_num + 1;
		    fetch cursor_test_1 into var_name;
		end while;
		close cursor_test_1;
		set num=var_num;
		select num;
    end$$
delimiter ;


declare num int;
call procedure_test5(num);
select num;

drop procedure if exists procedure_test5;

delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`(out num int, out name varchar(60))
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare var_name varchar(60);
		declare var_num int default 0;
	
		declare cursor_test_1 cursor for
			select name from people;
		set var_num = 0;
		open cursor_test_1;
		fetch cursor_test_1 into var_name;
		set name = var_name;
		while var_num < 10  do
			set var_num = var_num + 1;
			
		    fetch cursor_test_1 into var_name;
		end while;
		close cursor_test_1;
		set num=var_num;
    end$$
delimiter ;

call procedure_test5(@count, @name);

select @count,@name;

drop procedure if exists procedure_test5;

delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`(out num int, out name varchar(60))
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare var_name varchar(60);
		declare var_num int default 0;
	
		declare cursor_test_1 cursor for
			select name from people;
		set var_num = 0;
		open cursor_test_1;
		fetch cursor_test_1 into var_name;
		set name = var_name;
		loop_lable:loop
			set var_num = var_num + 1;
			if(var_num > 10) then 
				leave loop_lable;
			end if;
		end loop;
		close cursor_test_1;
		set num=var_num;
    end$$
delimiter ;

call procedure_test5(@count, @name);
select @count,@name;



drop procedure if exists procedure_test5;

delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`(out num int, out name varchar(60))
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare var_name varchar(60);
		declare var_num int default 0;
	
		declare cursor_test_1 cursor for
			select name from people;
		set var_num = 0;
		open cursor_test_1;
		fetch cursor_test_1 into var_name;
		set name = "libai";
		
		repeat
		
			set var_num = var_num + 1;
			until var_num > 5
			
		
		end repeat;
		
		
		close cursor_test_1;
		set num=var_num;
    end$$
delimiter ;

call procedure_test5(@count, @name);
select @count,@name;




drop procedure if exists procedure_test5;

delimiter $$
create
    
    procedure `tmptest`.`procedure_test5`(in num int, out name varchar(60))
    begin
		/*
			通过if对输入的数字进行判断
				大于5，设置name是李白
				小于5，设置name是张三
		*/
		if(num > 5) then
			set name  = "李白";
		else
			set name = "张三";
		end if;
    end$$
delimiter ;

call procedure_test5(12, @name);
select @count,@name;






drop procedure if exists procedure_test5;

delimiter $$
create
    
    procedure `tmptest`.`procedure_test5`(in num int, out name varchar(60))
    begin
		/*
			通过if对输入的数字进行判断
				大于5，设置name是李白
				小于5，设置name是张三
		*/
		declare male_int int default 1;
		declare female_int int default 0;
		if(num > 5) then
			set name  = "李白";
		else
			set name = "张三";
		end if;
		
		case num
			when male_int then  
				set name = "男李白";
			when female_int then  
				set name = "女张三";	
		end case;
    end$$
delimiter ;

call procedure_test5(1, @name);
select @name;



drop procedure if exists procedure_test5;

delimiter $$
create
    
    procedure `tmptest`.`procedure_test5`(in index int, out name varchar(60))
    begin
		insert into people values(1, 'libai');
    end$$
delimiter ;

call procedure_test5(1, @name);
select @name;
if(i > index) then
				leave loop_lable;
			end if;

		loop_lable:loop
			set var_num = var_num + 1;
			if(var_num > 10) then 
				leave loop_lable;
			end if;
		end loop;




insert into people 
				values(1, "李白");
				
				
drop procedure if exists procedure_test5;

delimiter $$
create
    /*[DEFINER = { user | CURRENT_USER }]*/
    procedure `tmptest`.`procedure_test5`(in num int, out num2 int)
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    begin
		declare i int default 0;
		loop_lable:loop
			set i = i + 1;
			if(i > num) then
				leave loop_lable;
			end if;
		end loop;
		select * from people;
		set num2 = i;
    end$$
delimiter ;

call procedure_test5(10, @num);

select @num;

drop procedure if exists procedure_test_6;
delimiter $$
create
    
    procedure `tmptest`.`procedure_test_6`(in index int)
    
    begin
    
		select * from people;
    end$$
delimiter ;


drop procedure if exists procedure_test_5;

delimiter $$

create procedure procedure_test_5(in num int)
	begin
		declare i int default 0;
		loop_lable:loop
			set i = i + 1;
			insert into people 
				values(i, "李白");
			if(i > num) then 
				leave loop_lable;
			end if;
		end loop;
		select * from people;
	end $$
delimiter $$

call procedure_test_5(100);

select count(*) from people;


drop procedure if exists procedure_test_5;
delimiter $$

create procedure  procedure_test_5(in num int)
	begin 
		declare i int default 0;
		while i < num do
			delete from people
				where id = i;
			set i = i + 1;
		end while;
		select count(*) from people;
	end 
	
	
	$$

delimiter $$

select * from people;

call procedure_test_5(100);

drop procedure procedure_test_5;
delimiter $$
	create procedure  procedure_test_5(in num int)
	begin
		declare i int default 0;
		repeat
			set i = i + 1;
			insert into people
				values(i, concat("李白", i));
			until i > num
		end repeat;
		select * from people;
	end
	$$
delimiter $$

call procedure_test_5(100);

/*
	查看存储过程和函数

*/
show procedure status like "procedure_test_5";

show create procedure procedure_test_5;
function_test_5
show create function function_test_5;
show function status like "function_test_5";
