# Write your MySQL query statement below
select E1.name from Employee E1
JOIN(
    Select managerId, Count(*) as directReports
    from Employee 
    GROUP BY managerId
    HAVING COUNT(*)>=5
)
E2 on E1.id=E2.managerId;