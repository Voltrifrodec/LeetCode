# Write your MySQL query statement below
SELECT act1.machine_id, ROUND(AVG(act1.timestamp - act2.timestamp), 3) AS `processing_time`
FROM Activity act1
JOIN Activity act2 ON 
    act1.process_id = act2.process_id AND
    act1.machine_id = act2.machine_id AND
    act1.timestamp > act2.timestamp
GROUP BY act1.machine_id;
