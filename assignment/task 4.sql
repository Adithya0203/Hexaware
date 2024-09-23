-- 1
select avg(student_count) as avg_students_course 
from (
select course_id,count(student_id) as student_count from enrollments group by course_id
) 
as course_enrollments;

-- 2
select max(total_amount) from (select student_id,sum(amount) as total_amount from payments group by student_id) as max_amount;

-- 3
select course_id, count(student_id) as enrollment_count from enrollments
group by course_id having count(student_id) = (
select max(enrollment_count)
from
(
select count(student_id) as enrollment_count from enrollments
group by course_id
) 
as course_enrollments
);

-- 4
select t.teacher_id, concat(t.first_name,last_name) as name,sum(p.amount) as total_payments
from teacher t join courses c on t.teacher_id = c.teacher_id
join enrollments e on c.course_id = e.course_id
join payments p on e.student_id = p.student_id
group by t.teacher_id order by teacher_id;

-- 5
select student_id from enrollments
group by student_id
having count(course_id) = 
(
select count(distinct course_id) from enrollments
);

-- 6
select c.teacher_id from courses c join teacher t on c.teacher_id = t.teacher_id where t.teacher_id not in (select c.teacher_id from courses c);

-- 7
select avg(age) from (select student_id,date_of_birth,round(datediff(curdate(),date_of_birth) / 365) as age from students) as average_age;

-- 8
select course_id from courses where course_id not in (select course_id from enrollments);

-- 9
select e.student_id,e.course_id,(select sum(p.amount) from payments p where p.student_id = e.student_id) as total_payments
from enrollments e join courses c on e.course_id = c.course_id
group by e.student_id,c.course_id;

-- 10
select student_id,count(payment_id) as paid_count
from payments group by student_id
having count(payment_id) > 1;

-- 11
select s.student_id,sum(amount) as total from payments p,students s where p.student_id = s.student_id group by student_id;

-- 12
select course_name,count(e.course_id) as students_enrolled from courses c 
left join enrollments e on c.course_id = e.course_id group by c.course_id;

-- 13
select student_id,round(avg(amount),2) as avg_paid from payments
group by student_id;