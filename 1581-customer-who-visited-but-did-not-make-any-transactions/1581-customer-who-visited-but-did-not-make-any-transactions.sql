# Write your MySQL query statement below
Select v.customer_id, Count(v.visit_id) as count_no_trans
From Visits as v
Left Join Transactions as t
On v.visit_id = t.visit_id
Where transaction_id is null
Group By v.customer_id;