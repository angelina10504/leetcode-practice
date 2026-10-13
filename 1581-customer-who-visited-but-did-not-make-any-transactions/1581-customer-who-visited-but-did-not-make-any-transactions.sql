# Write your MySQL query statement below
select v.customer_id , count(v.visit_id) AS count_no_trans
From Visits v
LEFT JOIN Transactions t
ON v.visit_id=t.visit_id
WHERE t.amount is NULL
GROUP BY v.customer_id