-- 1148. Article Views I
-- https://leetcode.com/problems/article-views-i/

select distinct author_id as id from Views where viewer_id = author_id order by id