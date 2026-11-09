/*
Enter your query here.
*/

Select distinct c.company_code, 
c.founder, 
count(distinct lm.lead_manager_code),
count(distinct sm.senior_manager_code),
count(distinct m.manager_code),
count(distinct e.employee_code)
from Company as c
inner join Lead_Manager as lm on c.company_code = lm.company_code
inner join Senior_Manager as sm on lm.lead_manager_code = sm.lead_manager_code
inner join Manager as m on m.senior_manager_code = sm.senior_manager_code
inner join Employee as e on e.manager_code = m.manager_code
group by c.company_code, c.founder
order by c.company_code;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna