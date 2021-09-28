create database university;

create table login(
firstname varchar(50) ,
lastname varchar(50),
email varchar(50),
username varchar(50)not null,
password varchar(15)not null,
constraint pk_username primary key(username)
);





create table student(
  name varchar(100),
 father_name varchar(100),
 age varchar(10),
 dob varchar(20),
 address varchar(100), 
 mobile_no varchar(20), 
 email_id varchar(50), 
 branch varchar(100), 
 course varchar(100), 
 student_id int not null,
 class_xii_percent varchar(20),
 constraint pk_student_id primary key(student_id)
 );



select * from student;
select * from login;
