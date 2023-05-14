-- 175. Combine Two Tables
-- https://leetcode.com/problems/combine-two-tables/

select firstName, lastName, city, state
from Person
left join Address
on Person.personId = Address.personId