-- 1
select s.student_id,sum(amount) as total from students s,payments p where s.student_id = 106 and s.student_id = p.student_id;

-- 2
select c.course_id,course_name,count(e.course_id) from courses c 
left join enrollments e on c.course_id = e.course_id group by c.course_id;

-- 3
select s.student_id,concat(s.first_name,s.last_name) as name from students s
left join enrollments e on s.student_id = e.student_id where e.student_id is null;

-- 4
select s.student_id,concat(s.first_name,' ',s.last_name) as name,e.enrollment_date,c.course_name from students s
join enrollments e on s.student_id = e.student_id 
join courses c on e.course_id = c.course_id;

-- 5
select t.teacher_id,c.course_name from teacher t,courses c where t.teacher_id = c.teacher_id;

-- 6
select c.course_name,concat(s.first_name,' ',s.last_name) as name,e.enrollment_date
from students s
join enrollments e on s.student_id = e.student_id
join courses c on e.course_id = c.course_id
where c.course_id = "C101";

-- 7
select s.student_id from students s left join payments p on s.student_id = p.student_id where p.payment_id is null;

-- 8
select c.course_id from courses c left join enrollments e on c.course_id = e.course_id where e.enrollment_id is null;

-- 9
select e1.student_id from enrollments e1
join enrollments e2 on e1.student_id = e2.student_id
and e1.course_id <> e2.course_id
group by e1.student_id
having COUNT(DISTINCT e1.course_id) > 1;

-- 10
select t.teacher_id from teacher t left join courses c on t.teacher_id = c.teacher_id where c.teacher_id is null;