# Write your MySQL query statement below
SELECT
    e2.employee_id,
    e2.name,
    COUNT(e2.employee_id) AS `reports_count`,
    ROUND(AVG(e1.age)) AS `average_age`
FROM Employees e1
JOIN Employees e2
    ON e2.employee_id = e1.reports_to
GROUP BY e2.employee_id
ORDER BY e2.employee_id;
