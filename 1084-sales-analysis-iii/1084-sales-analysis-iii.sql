SELECT DISTINCT s.product_id, 
        p.product_name 
FROM Sales s
JOIN Product p ON s.product_id = p.product_id
WHERE s.product_id NOT IN 
    ( 
        SELECT DISTINCT product_id
        FROM Sales
        WHERE DATE(sale_date) >= '2019-04-01' 
            OR DATE(sale_date) < '2019-01-01'
    )
