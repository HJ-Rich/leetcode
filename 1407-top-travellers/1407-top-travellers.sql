SELECT u.name AS name,
        CASE
            WHEN SUM(r.distance) IS NULL THEN 0
            ELSE SUM(r.distance)
        END AS travelled_distance
FROM Users u
LEFT OUTER JOIN Rides r ON u.id = r.user_id
GROUP BY r.user_id
ORDER BY travelled_distance DESC, name ASC