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
	sex int
)

drop table people;

select * from people;

insert into people values(1001, '李白', 0);

insert into people values(1002, '李晓静', 1);

delete from people where id = 1001;





