-- 1. self join
SELECT a1.machine_id, ROUND(AVG(a2.timestamp-a1.timestamp),3) AS processing_time
FROM Activity a1
JOIN Activity a2
ON a1.machine_id=a2.machine_id AND a1.process_id=a2.process_id AND a1.activity_type='start' AND a2.activity_type='end'
GROUP BY a1.machine_id


-- 2. sub query

-- SELECT a1.machine_id,
-- ROUND(
--     (select AVG(a2.timestamp) FROM Activity a2 WHERE a2.activity_type='end' AND a2.machine_id=a1.machine_id)
--     -
--     (select AVG(a2.timestamp) FROM Activity a2 WHERE a2.activity_type='start' AND a2.machine_id=a1.machine_id)

-- , 3) AS processing_time 

-- FROM Activity a1
-- GROUP BY a1.machine_id