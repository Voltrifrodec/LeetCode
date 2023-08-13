# Write your MySQL query statement below
SELECT e.name as 'Employee'
FROM Employee e, Employee m
WHERE e.salary > m.salary AND e.ManagerId = m.id;
