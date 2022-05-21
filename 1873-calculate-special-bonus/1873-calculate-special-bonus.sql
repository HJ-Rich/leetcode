
SELECT employee_id,
    CASE
        WHEN (employee_id % 2 = 1) AND LOCATE('M', name) != 1 THEN salary
        ELSE 0
    END AS bonus
FROM Employees