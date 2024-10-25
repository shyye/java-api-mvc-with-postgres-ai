CREATE TABLE Employees (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    jobName TEXT NOT NULL,
    salaryGrade TEXT NOT NULL,
    department TEXT NOT NULL
);

INSERT INTO Employees (name, jobName, salaryGrade, department) VALUES
('John Doe', 'Developer', 'A', 'Engineering'),
('Jane Smith', 'Manager', 'B', 'Sales');