-- Display the names, jobs and bonus for all employees assuming all managersget abonus of Rs. 500, clerks get Rs.200 and all others except the president Rs.350. thepresident gets 20 percent of his salary as bonus.
SELECT *, 
    CASE 
        WHEN job = 'MANAGER' THEN 500
        WHEN job = 'CLERK' THEN 200
        WHEN job = 'president' THEN sal * 0.2
        ELSE 350 
    END AS BONUS
FROM emp;

-- Display the names of all employees and their bonus. Assume each employeegetsa bonus of 20 percent of his salary subject to the maximum of Rs. 200.
SELECT 
    ename, 
    LEAST(sal * 0.20, 200) AS bonus 
FROM emp;

--. Display the employee details in the following manner. „Miller joined onthetwentythird of January of the year eighty second‟






--  Display the name of all employees, and „Greater‟ or „smaller‟ dependingonwherethe salary of the employees is greater than or less than 1500.
SELECT ename,
CASE
 WHEN sal > 1500 then 'Greater' 
 ELSE 'Smaller'
END AS VIEW
FROM emp 

/* Display the DA of all employees and calculation is in the following manner
 If salary >=5000 then DA is 75% of Salary
 If salary >=3000 and salary<5000 then DA is 60% of Salary Else     DAis50%of
 Salary
*/
SELECT sal,
CASE
   WHEN sal >=5000 then sal*0.75
   WHEN sal >=3000 and sal<5000 then sal*0.60
   ELSE sal*0.50
END AS DA
FROM EMP

;

/*Display the names, job and hire date of employees with there hire dates indescorder inside each department.*/
SELECT ename, job, hiredate, deptno
FROM emp
ORDER BY deptno ASC, hiredate DESC;

--  What would be the date after two months?
SELECT hiredate + INTERVAL '2 months'as after_two_monts FROM emp 

--  List the employee number, name of all employees Employee names shouldhaveonly the first letter in upper case and department no in descending order.
SELECT 
    empno, 
    INITCAP(ename) AS employee_name
FROM emp 
ORDER BY 
    deptno DESC;

-- Concatenate the name of the person with his job separated by threespaces(CONCAT).
SELECT concat(ename,'   ',job) as emp_data
FROM emp 

--Display the names of all employees, padding them to the right upto16characters with
SELECT RPAD(ename,16,'*')as PADDING FROM emp 

--  Show the first three characters of names of all employees
SELECT SUBSTR(ename,1,3) FROM emp 

-- Find the salary of all employees rounding it to the nearest Rs.1000
SELECT ROUND(sal, -3) AS Rounded_Salary 
FROM emp;

-- Find employees name and job whose employees names last character isequalto jobs last character
SELECT ename, job 
FROM emp 
WHERE SUBSTR(ename, -1, 1) = SUBSTR(job, -1, 1);

-- Display the names and salary of the employees in the descending order of theirincome.
SELECT ename,sal
FROM emp
ORDER BY sal+comm DESC 

-- . Display the names of all employees with any „A‟ at any place of the name
SELECT ename
FROM emp
WHERE ename ~'.A'

