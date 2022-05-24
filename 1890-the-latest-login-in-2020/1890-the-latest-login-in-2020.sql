SELECT user_id,
        MAX(time_stamp) AS last_stamp
FROM Logins
WHERE '2020-01-01' <= time_stamp
    AND time_stamp < '2021-01-01'
GROUP BY user_id