select name as Employee
from Employee A
where salary > (select salary from Employee where id = A.managerId)