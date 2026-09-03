# Write your MySQL query statement below
Select a1.machine_id, Round((AVG(a2.timestamp) - AVG(a1.timestamp)),3) as processing_time
From Activity as a1
Join Activity as a2
on a1.machine_id = a2.machine_id 
And a1.process_id = a2.process_id
And a1.activity_type = "start" 
And a2.activity_type = "end"
Group By a1.machine_id
Order By a1.machine_id;