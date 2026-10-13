# Write your MySQL query statement below
select e.name , uni.unique_id 
from Employees  e 
LEFT JOIN EmployeeUNI uni
ON e.id=uni.id;