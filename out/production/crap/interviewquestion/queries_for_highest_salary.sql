CREATE TABLE Employee (EmployeeId int, EmployeeName varchar(255), Salary int);


INSERT INTO test_db.Employee
(EmployeeId, EmployeeName, Salary)
VALUES(1, 'Jhon', 50);
INSERT INTO test_db.Employee
(EmployeeId, EmployeeName, Salary)
VALUES(2, 'Bob', 45);
INSERT INTO test_db.Employee
(EmployeeId, EmployeeName, Salary)
VALUES(3, 'Vick', 65);
INSERT INTO test_db.Employee
(EmployeeId, EmployeeName, Salary)
VALUES(4, 'Alice', 112);


SELECT * FROM Employee 


-- For first highest salary
select * from Employee order by Salary desc limit 0,1;

-- For second highest salary
select * from Employee order by Salary desc limit 1,1;

-- For third highest salary
select * from Employee order by Salary desc limit 2,1;
