# Write your MySQL query statement below
# GROUP BY won't return null if no values are present, so the ORDER+HAVING+LIMIT won't work
#   
#   SELECT num
#   FROM MyNumbers
#   GROUP BY num
#   HAVING COUNT(num) = 1
#   ORDER BY num DESC
#   LIMIT 1;
#
# Subquery will do the trick, however.

SELECT MAX(num) AS `num`
FROM (SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1) AS MyNumbersQuery; # Every derived table must have its own alias
