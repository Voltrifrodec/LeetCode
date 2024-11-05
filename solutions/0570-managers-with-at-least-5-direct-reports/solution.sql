# Write your MySQL query statement below
SELECT employee.name
FROM Employee AS employee
INNER JOIN Employee AS manager ON employee.id = manager.managerId
GROUP BY manager.managerId
HAVING COUNT(manager.managerId) >= 5;
