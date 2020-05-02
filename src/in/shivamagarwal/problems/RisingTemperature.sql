#MySQL query
SELECT w1.Id from weather w1, weather w2
WHERE w1.temperature > w2.temperature
AND DATEDIFF (w1.recorddate,w2.recorddate)=1
