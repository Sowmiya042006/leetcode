# Write your MySQL query statement below
select c.name as name
from Customer c
left join Customer r
on c.referee_id=r.id
where c.referee_id!=2 or c.referee_id is null;