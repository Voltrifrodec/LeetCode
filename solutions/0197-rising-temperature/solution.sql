# Write your MySQL query statement below
SELECT DISTINCT weather_curr.id
FROM Weather weather_curr, Weather weather_prev
WHERE
    TO_DAYS(weather_curr.recordDate) - TO_DAYS(weather_prev.recordDate) = 1
    AND weather_prev.temperature < weather_curr.temperature;
