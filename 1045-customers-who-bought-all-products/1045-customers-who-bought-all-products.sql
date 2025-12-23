# Write your MySQL query statement below
SELECT C.customer_id 
FROM Customer as C
JOIN Product AS P
ON C.product_key=P.product_key
GROUP BY C.customer_id
HAVING COUNT(DISTINCT(C.product_key))=(SELECT COUNT(*) FROM Product);
