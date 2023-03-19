-- Write your MySQL query statement below
-- formatted with piotrgredowski/poor-mans-t-sql-formatter-vscode-extension
SELECT c.name AS Customers -- just changes the output name
FROM Customers AS c
WHERE c.id NOT IN (
        SELECT o.customerId
        FROM Orders AS o
        );
