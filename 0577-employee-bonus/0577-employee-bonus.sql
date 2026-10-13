# Write your MySQL query statement below
select name , bonus
from Employee e
Left join Bonus b ON e.empId = b.empId
Where bonus <1000 or bonus IS NULL