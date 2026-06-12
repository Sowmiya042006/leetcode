# Write your MySQL query statement below
select id as Id from  Weather w
where temperature>(
    Select temperature from Weather
    where DATEDIFF(w.recordDate, recordDate) = 1);