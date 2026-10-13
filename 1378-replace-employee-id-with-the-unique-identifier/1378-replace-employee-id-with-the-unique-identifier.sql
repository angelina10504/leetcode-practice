# Write your MySQL query statement below
select name , unique_id 
from Employees  e 
LEFT JOIN EmployeeUNI uni
ON e.id=uni.id;