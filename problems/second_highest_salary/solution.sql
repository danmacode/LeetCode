-- Write your MySQL query statement below
-- formatted with prettier-sql

-- Write an SQL query to report the second highest salary
-- from TABLE Employee 
-- if there's not second highest salary, the query reports null
SELECT
    IFNULL (
        (
            SELECT DISTINCT
                Salary
            FROM
                Employee
            ORDER BY
                Salary DESC -- High to Low
            LIMIT
                1, 1 -- Select the second highest
        ),
        NULL -- If not found, report NULL
    ) AS SecondHighestSalary;