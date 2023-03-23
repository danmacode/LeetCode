# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE tb1
FROM   person AS tb1,
       person AS tb2
WHERE  tb1.email = tb2.email
       AND tb1.id > tb2.id; 