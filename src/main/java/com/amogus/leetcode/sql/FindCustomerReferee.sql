-- 584. Find Customer Referee
-- https://leetcode.com/problems/find-customer-referee/

select Customer.name from Customer where referee_id != 2 or referee_id is null