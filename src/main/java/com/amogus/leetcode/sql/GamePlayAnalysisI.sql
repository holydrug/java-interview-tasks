-- 511. Game Play Analysis I
-- https://leetcode.com/problems/game-play-analysis-i/

select
    player_id,
    MIN(event_date) as first_login
from Activity
group by player_id
