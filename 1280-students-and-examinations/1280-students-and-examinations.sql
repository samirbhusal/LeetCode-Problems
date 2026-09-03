# Write your MySQL query statement below
Select s.student_id, s.student_name, sub.subject_name, 
Count(e.subject_name) as attended_exams
From Students as s
cross join Subjects as sub
Left Join Examinations as e
On s.student_id = e.student_id
And sub.subject_name = e.subject_name
Group By s.student_id, s.student_name, sub.subject_name
Order By s.student_id, sub.subject_name;