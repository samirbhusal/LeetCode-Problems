/*
Enter your query here.
*/

select distinct city from station
where city regexp '^[^aeiouAEIOU]'
OR city regexp '[^aeiouAEIOU]$';


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna