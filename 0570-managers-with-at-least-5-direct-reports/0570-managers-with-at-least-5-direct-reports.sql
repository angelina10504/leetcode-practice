# Write your MySQL query statement below
select e.name
from Employee as e
INNER JOIN Employee AS m on e.id=m.managerId
group by m.managerId
having COUNT(m.managerId)>=5