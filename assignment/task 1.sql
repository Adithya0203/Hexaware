create database sisdb;

show databases;

use sisdb;

create table students(
student_id int auto_increment not null primary key,
first_name char(30) not null,
last_name char(30) not null,
date_of_birth date not null,
email varchar(50) not null,
phone_number varchar(15) not null
);

alter table students auto_increment = 100;

create table teacher(
teacher_id int auto_increment not null primary key,
first_name char(30) not null,
last_name char(30) not null,
email varchar(50) not null
);

create table courses(
course_id varchar(6) not null primary key,
course_name char(30) not null,
credits int not null,
teacher_id int not null,
foreign key(teacher_id)references teacher(teacher_id)
  on delete cascade
  on update cascade
);

create table enrollments(
enrollment_id int auto_increment not null primary key,
student_id int not null,
course_id varchar(6) not null,
enrollment_date date not null,
foreign key(student_id)references students(student_id),
  on delete cascade
  on update cascade,
foreign key(course_id)references courses(course_id)
  on delete cascade
  on update cascade
);

alter table enrollments auto_increment = 300;

create table payments(
payment_id int auto_increment not null primary key,
student_id int not null,
amount decimal(9,2) not null,
payment_date date not null,
foreign key(student_id)references students(student_id)
  on delete cascade
  on update cascade
);

alter table payments auto_increment = 500;

insert into students (first_name, last_name, date_of_birth, email, phone_number) values 
('John', 'Doe', '2000-05-15', 'john.doe@example.com', '+91 98765 43210'),
('Priya', 'Sharma', '1999-07-22', 'priya.sharma@outlook.com', '+91 9123456789'),
('Rahul', 'Mehta', '2000-12-10', 'rahul.mehta@yahoo.com', '+91 9865432109'),
('Sneha', 'Patel', '1998-09-05', 'sneha.patel@hotmail.com', '+91 9988776655'),
('Amit', 'Kumar', '2002-04-28', 'amit.kumar@rediffmail.com', '+91 9122345678'),
('Anjali', 'Reddy', '2001-11-19', 'anjali.reddy@gmail.com', '+91 9871234567'),
('Vikas', 'Singh', '2000-08-30', 'vikas.singh@yahoo.com', '+91 9125678901'),
('Neha', 'Verma', '1999-02-14', 'neha.verma@outlook.com', '+91 9812345670'),
('Raj', 'Kapoor', '1998-05-24', 'raj.kapoor@rediffmail.com', '+91 9981234567'),
('Megha', 'Desai', '2002-07-18', 'megha.desai@hotmail.com', '+91 9876543212');

insert into teacher (teacher_id, first_name, last_name, email) values (1, 'Davie', 'Fruchter', 'dfruchter0@t-online.de');
insert into teacher (teacher_id, first_name, last_name, email) values (2, 'Blake', 'Lube', 'blube1@mapquest.com');
insert into teacher (teacher_id, first_name, last_name, email) values (3, 'Magdalene', 'Scarbarrow', 'mscarbarrow2@go.com');
insert into teacher (teacher_id, first_name, last_name, email) values (4, 'Linnea', 'Biswell', 'lbiswell3@ebay.co.uk');
insert into teacher (teacher_id, first_name, last_name, email) values (5, 'Eb', 'Maggiore', 'emaggiore4@feedburner.com');
insert into teacher (teacher_id, first_name, last_name, email) values (6, 'Victoria', 'Byer', 'vbyer5@digg.com');
insert into teacher (teacher_id, first_name, last_name, email) values (7, 'Jarid', 'Abramof', 'jabramof6@tmall.com');
insert into teacher (teacher_id, first_name, last_name, email) values (8, 'Nisse', 'Okey', 'nokey7@infoseek.co.jp');
insert into teacher (teacher_id, first_name, last_name, email) values (9, 'Kylen', 'Tetlow', 'ktetlow8@fda.gov');
insert into teacher (teacher_id, first_name, last_name, email) values (10, 'Alva', 'Durward', 'adurward9@fc2.com');

insert into courses (course_id, course_name, credits, teacher_id) values ('C101', 'Calculus I', 4, 1);
insert into courses (course_id, course_name, credits, teacher_id) values ('C102', 'General Physics', 3, 2);
insert into courses (course_id, course_name, credits, teacher_id) values ('C103', 'Organic Chemistry', 4, 3);
insert into courses (course_id, course_name, credits, teacher_id) values ('C104', 'Microbiology', 3, 4);
insert into courses (course_id, course_name, credits, teacher_id) values ('C105', 'World History', 3, 5);
insert into courses (course_id, course_name, credits, teacher_id) values ('C106', 'English Literature', 3, 6);
insert into courses (course_id, course_name, credits, teacher_id) values ('C107', 'Data Structures', 4, 7);
insert into courses (course_id, course_name, credits, teacher_id) values ('C108', 'Macroeconomics', 3, 8);
insert into courses (course_id, course_name, credits, teacher_id) values ('C109', 'Ethics and Philosophy', 2, 9);
insert into courses (course_id, course_name, credits, teacher_id) values ('C110', 'Renaissance Art', 2, 10);

insert into enrollments (student_id, course_id, enrollment_date) values (101, 'C107', '2024-02-14');
insert into enrollments (student_id, course_id, enrollment_date) values (102, 'C101', '2024-05-23');
insert into enrollments (student_id, course_id, enrollment_date) values (104, 'C103', '2024-06-27');
insert into enrollments (student_id, course_id, enrollment_date) values (105, 'C110', '2024-07-19');
insert into enrollments (student_id, course_id, enrollment_date) values (106, 'C101', '2024-08-03');
insert into enrollments (student_id, course_id, enrollment_date) values (107, 'C106', '2024-01-15');
insert into enrollments (student_id, course_id, enrollment_date) values (108, 'C102', '2024-09-21');
insert into enrollments (student_id, course_id, enrollment_date) values (109, 'C109', '2024-10-12');
insert into enrollments (student_id, course_id, enrollment_date) values (110, 'C105', '2024-11-05');

insert into payments (student_id, amount, payment_date) values (101, 1500.00, '2024-01-10');
insert into payments (student_id, amount, payment_date) values (102, 1200.50, '2024-02-15');
insert into payments (student_id, amount, payment_date) values (103, 2000.75, '2024-03-05');
insert into payments (student_id, amount, payment_date) values (104, 1750.00, '2024-04-12');
insert into payments (student_id, amount, payment_date) values (105, 2200.00, '2024-05-22');
insert into payments (student_id, amount, payment_date) values (106, 1725.25, '2024-06-20');
insert into payments (student_id, amount, payment_date) values (107, 1600.50, '2024-07-18');
insert into payments (student_id, amount, payment_date) values (108, 1950.75, '2024-08-25');
insert into payments (student_id, amount, payment_date) values (109, 2100.00, '2024-09-07');
insert into payments (student_id, amount, payment_date) values (110, 1700.50, '2024-10-02');
