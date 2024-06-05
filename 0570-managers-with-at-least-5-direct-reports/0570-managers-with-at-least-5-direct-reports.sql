# Write your MySQL query statement below
SELECT 
    e1.name AS name
FROM 
    Employee e1
JOIN 
    (SELECT 
         managerId, 
         COUNT(*) AS direct_reports
     FROM 
         Employee
     WHERE 
         managerId IS NOT NULL
     GROUP BY 
         managerId
     HAVING 
         COUNT(*) >= 5) e2
ON 
    e1.id = e2.managerId;
