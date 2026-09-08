# Write your MySQL query statement below
Select 
    p.product_id, 
    IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) AS average_price
From 
    Prices as p
Left Join 
    UnitsSold as u
ON
    p.product_id = u.product_id
And u.purchase_date Between p.start_date and p.end_date

Group By p.product_id;