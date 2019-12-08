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

drop table people;

select * from people;

insert into people values(1001, '李白');

insert into people values(1001, '李白的老婆', 'FEMALE');

select * from  people where sex = 'MALE' and name = '李白';





