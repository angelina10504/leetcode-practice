# Write your MySQL query statement below
select mgr.employee_id , mgr.name , count(emp.employee_id) as reports_count, round(avg(emp.age)) as average_age
from Employees emp
Join employees mgr ON emp.reports_to=mgr.employee_id
group by employee_id
order by employee_id
