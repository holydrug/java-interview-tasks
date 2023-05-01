-- 627. Swap Salary
-- https://leetcode.com/problems/swap-salary/

update Salary
set sex = case sex
    when 'f' then 'm'
    when 'm' then 'f'
end;
