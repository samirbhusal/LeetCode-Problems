# Write your MySQL query statement below
Select p.product_name as product_name, s.year as year, s.price as price
From Sales as s
Join Product as p
On s.product_id = p.product_id;