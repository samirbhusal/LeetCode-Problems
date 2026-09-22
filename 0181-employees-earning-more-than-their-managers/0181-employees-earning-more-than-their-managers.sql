# Write your MySQL query statement below
Select e.name as Employee
from Employee as e
Join Employee as e1
on e.managerId = e1.id
where e.salary > e1.salary;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna