-- 1. Replace All ‘A’s from ‘MALAYALAM’ by E
select replace('MALAYALAM','A','E') 


-- 3. Find total number of clerks
SELECT COUNT(*) 
FROM emp
WHERE job = 'CLERK';

-- 4. Find the no. of employees working under different department.
SELECT deptno, COUNT(*) AS total_employees
FROM emp
GROUP BY deptno;

-- Find total number of clerks joined after 01-jan-81’
SELECT ename , hiredate 
FROM emp 
where hiredate >'01-jan-81'

-- 6. Find total of basis salary and commission
SELECT (sal + comm) as Total
FROM emp

-- 7. Find the yearly compensation paid to all managers (12* (sal + NVL (comm, 0)))
SELECT ename AS "Manager Name", (12 * (sal + COALESCE(comm, 0))) AS "YearlyCompensation"
FROM 
    emp
WHERE 
    job = 'MANAGER';

--   8. Find the average salary of all salesmen.
SELECT avg(sal) 
FROM EMP 
WHERE job = 'SALESMAN';

--Who is paid most in the company?
select max(sal) from emp

-- Display the name of the highest paid employees of each department
SELECT deptno ,MAX(sal) AS "Maximum Salary"
FROM emp
GROUP BY deptno
ORDER BY "Maximum Salary";

-- 11. Who comes first in the alphabetical order (MIN)?
SELECT ename, sal
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);

--12. Find the minimum salary of various categories of employees
SELECT job, MIN(sal) FROM emp GROUP BY job;


-- 13. Find the maximum salary of the employees in various depts, Job wise
SELECT 
    deptno, 
    job, 
    MAX(sal) AS max_salary
FROM emp
GROUP BY deptno, job
ORDER BY deptno, max_salary DESC;

-- 14. List the various categories of employees, depts. So that the maximum salary is greater then 1500(Group by job, dept).
SELECT job, deptno, MAX(sal) AS max_salary
FROM EMP
GROUP BY job, deptno
HAVING MAX(sal) > 1500;

-- 15. Find the minimum and maximum salary of all managers in all depts.
SELECT ename,deptno,MIN(sal) AS min_sal,MAX(sal) AS max_sal
FROM emp
WHERE job = 'MANAGER'
GROUP BY deptno,ename
ORDER BY deptno;

-- 16. Find the minimum salary of all managers in all depts. Where minimum salary is above 2500.
SELECT ename,min(sal) as min_sal
FROM emp
WHERE job = 'MANAGER'
GROUP BY ename,deptno
HAVING min(sal) > 2500
ORDER BY deptno;