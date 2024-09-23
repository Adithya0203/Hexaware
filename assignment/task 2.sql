-- 1
insert into students (first_name, last_name, date_of_birth, email, phone_number) 
values("John","Doe","1995-08-15","john.doe@example.com",1234567890);

-- 2
insert into enrollments (student_id, course_id, enrollment_date) values
("110","C104",curdate());

-- 3
update teacher
set email = "alva_durwad19@protonmail.com"
where teacher_id = 10;

-- 4
delete from enrollments where course_id = "C104" and student_id = 106;

-- 5
update courses
set teacher_id = 6 
where course_id = "C109";

-- 6
delete from enrollments where student_id = 109;
delete from payments where student_id = 109;
delete from students where student_id = 109;

-- 7
update payments
set amount = 2500.00
where payment_id = 504;