select name 
from Employee
where id in (
    select managerId
    from Employee
    Group By managerId
    Having count(managerId) >=5
);