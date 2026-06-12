# Write your MySQL query statement below
select player_id,event_date as first_login
from Activity a
where event_date=(
    select min(event_date)
    from Activity
    where player_id=a.player_id);