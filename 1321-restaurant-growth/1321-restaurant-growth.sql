# Write your MySQL query statement below
select 
    t1.visited_on as visited_on, 
    sum(t2.day_sum) as amount,
    round(avg(t2.day_sum), 2) as average_amount
from
  ( select 
        visited_on, 
        sum(amount) as day_sum 
    from 
        Customer 
    group by 
        visited_on ) t1,

   (select 
        visited_on, 
        sum(amount) as day_sum 
    from 
        Customer 
    group by 
        visited_on ) t2
where 
    DATEDIFF(t1.visited_on, t2.visited_on) between 0 and 6
group by
    t1.visited_on
having 
    count(t2.visited_on) = 7;