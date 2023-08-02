# Write your MySQL query statement below
SELECT Users.name, SUM(Transactions.amount) AS balance
FROM Users
JOIN Transactions on Transactions.account = Users.account
GROUP by Users.account
HAVING balance > 10000;
