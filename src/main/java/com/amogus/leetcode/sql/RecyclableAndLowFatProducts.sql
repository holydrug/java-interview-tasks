-- 1757. Recyclable and Low Fat Products
-- https://leetcode.com/problems/recyclable-and-low-fat-products/

select Products.product_id from Products where low_fats = 'Y' and recyclable = 'Y'