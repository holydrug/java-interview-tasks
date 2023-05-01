-- 595. Big Countries
-- https://leetcode.com/problems/big-countries/

select World.name, World.population, World.area from World where area >= 3000000 or population >= 25000000