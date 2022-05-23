SELECT u.name AS name,
        IFNULL(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT OUTER JOIN Rides r ON u.id = r.user_id
GROUP BY r.user_id
ORDER BY travelled_distance DESC, name ASC