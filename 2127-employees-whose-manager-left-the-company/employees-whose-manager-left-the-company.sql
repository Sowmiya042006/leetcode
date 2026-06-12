# Write your MySQL query statement below
select e.employee_id as employee_id 
from Employees e
left join Employees m
on e.manager_id=m.employee_id
where e.salary<30000 and 
e.manager_id is not null and 
m.employee_id is null
order by e.employee_id;

/*select employee_id
from Employees e
where salary<30000 and manager_id not in
(
    select employee_id 
    from Employees
)
order by employee_id;*/