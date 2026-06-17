# Write your MySQL query statement below
SELECT id,
CASE 
  WHEN p_id IS NULL 
   THEN 'Root'
  when id in(
    select p_id 
    from tree 
    where p_id is not null) 
    then 'Inner'
   else
     'Leaf'
   end as type
   from Tree;
