Select e.name, b.bonus
From Employee as e
Left Join Bonus as b 
on e.empId = b.empId
where b.bonus < 1000 || b.bonus is null;