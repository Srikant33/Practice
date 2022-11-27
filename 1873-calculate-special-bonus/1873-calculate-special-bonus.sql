# Write your MySQL query statement below
Select employee_id, salary as bonus from EMPLOYEES where employee_id %2 <>0 and name not like 'M%'
union
Select employee_id, 0 as bonus from EMPLOYEES where employee_id %2 = 0 or name like 'M%'
 order by employee_id