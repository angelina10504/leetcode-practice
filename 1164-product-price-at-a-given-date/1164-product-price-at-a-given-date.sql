# Write your MySQL query statement below
select product_id,  IFNULL(
    (
        select new_price from Products p2 
        where p2.product_id = p1.product_id
        AND p2.change_date <='2019-08-16'
        ORDER BY p2.change_date DESC
        LIMIT 1
    ),
    10
) AS price
from (
    select distinct product_id
    from Products
)p1