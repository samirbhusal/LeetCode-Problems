# Write your MySQL query statement below
Select s.user_id, 
ROUND((SUM(IF(c.action = "confirmed", 1, 0)) / COUNT(*)), 2) as confirmation_rate
From Signups as s
Left Join Confirmations as c
On s.user_id = c.user_id
Group By s.user_id;