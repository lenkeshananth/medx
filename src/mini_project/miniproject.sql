set echo on;

drop table Medicine cascade CONSTRAINT;
drop table Supplier cascade CONSTRAINT;
drop table Orders cascade CONSTRAINT;
drop table Inventory cascade CONSTRAINT;
drop table Transaction cascade CONSTRAINT;
drop table Customer cascade CONSTRAINT;
drop table Sales cascade CONSTRAINT;
drop table Returns cascade CONSTRAINT;
drop table Employees cascade CONSTRAINT;
drop table Employee_Sales cascade CONSTRAINT;
drop table Return_Detail cascade CONSTRAINT;
drop sequence employee_seq;a
-- Create the Medicine table
CREATE TABLE Medicine (
    medicine_id INT PRIMARY KEY,
    name VARCHAR2(32) NOT NULL,
    manufacturer VARCHAR2(32) NOT NULL,
    medicine_quantity INT NOT NULL,
    price NUMBER(10, 2) NOT NULL
);


-- Create the Supplier table
CREATE TABLE Supplier (
    supplier_id INT PRIMARY KEY,
    supplier_name VARCHAR2(32) NOT NULL,
    contact VARCHAR2(30) NOT NULL
);

-- Create the Orders table
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    medicine_id INT REFERENCES Medicine(medicine_id),
    supplier_id INT REFERENCES Supplier(supplier_id),
    order_quantity INT NOT NULL,
    order_date DATE NOT NULL
);

-- Create the Inventory table
CREATE TABLE Inventory (
    inventory_id INT PRIMARY KEY,
    medicine_id INT REFERENCES Medicine(medicine_id),
    inventory_quantity INT NOT NULL
);

-- Create the Transaction table
CREATE TABLE Transaction (
    transaction_id INT PRIMARY KEY,
    inventory_id INT REFERENCES Inventory(inventory_id),
    transaction_type VARCHAR2(32) NOT NULL,
    transaction_quantity INT NOT NULL,
    transaction_date DATE NOT NULL
);

-- Create the Customer table
CREATE TABLE Customer (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR2(32) NOT NULL,
    customer_email VARCHAR2(32) NOT NULL,
    customer_phone VARCHAR2(15) NOT NULL
);

-- Create the Sales table
CREATE TABLE Sales (
    sale_id INT PRIMARY KEY,
    customer_id INT REFERENCES Customer(customer_id),
    medicine_id INT REFERENCES Medicine(medicine_id),
    sale_quantity INT NOT NULL,
    total_amount NUMBER   ,
    sale_date DATE NOT NULL
);

-- Create the Returns table
CREATE TABLE Returns (
    return_id INT PRIMARY KEY,
    sale_id INT REFERENCES Sales(sale_id),
    return_date DATE NOT NULL,
    return_reason VARCHAR2(32) NOT NULL,
    return_quantity INT NOT NULL
);

-- Create the Employees table
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR2(32) NOT NULL,
    position VARCHAR2(20) NOT NULL,
    employee_email VARCHAR2(32) NOT NULL,
    employee_phone VARCHAR2(15) NOT NULL,
    password VARCHAR2(10) NOT NULL,
    DOB DATE NOT NULL,
    address VARCHAR2(30) NOT NULL,
    pincode NUMBER(6) NOT NULL
);

-- Create the Employee_Sales table
CREATE TABLE Employee_Sales (
    sale_id INT REFERENCES Sales(sale_id),
    employee_id INT REFERENCES Employees(employee_id),
    commission NUMBER(10, 2) NOT NULL,
    PRIMARY KEY (sale_id, employee_id)
);


--for extra display data (only storing)
CREATE TABLE Return_Detail (
    return_id INT PRIMARY KEY,
    medicine_name VARCHAR2(32) NOT NULL,
    return_reason VARCHAR2(32) NOT NULL,
    return_quantity INT NOT NULL,
    return_date DATE NOT NULL
);


-- Insert values into the Medicine table
INSERT INTO Medicine VALUES (1, 'Aspirin', 'Pharma Inc.', 100, 5.99);
INSERT INTO Medicine VALUES (2, 'Tylenol', 'HealthCorp', 150, 8.49);
INSERT INTO Medicine VALUES (3, 'Ibuprofen', 'Med Solutions', 200, 6.79);
INSERT INTO Medicine VALUES (4, 'Amoxicillin', 'Antibiotics Ltd.', 50, 12.50);
INSERT INTO Medicine VALUES (5, 'Ciprofloxacin', 'Antibiotics Ltd.', 75, 15.99);
INSERT INTO Medicine VALUES (6, 'Metformin', 'Diabetes Pharma', 120, 9.99);
INSERT INTO Medicine VALUES (7, 'Lisinopril', 'HeartCare', 100, 14.29);
INSERT INTO Medicine VALUES (8, 'Levothyroxine', 'Thyroid Health', 130, 7.99);
INSERT INTO Medicine VALUES (9, 'Omeprazole', 'StomachCare', 80, 11.49);
INSERT INTO Medicine VALUES (10, 'Simvastatin', 'Cholesterol Care', 90, 10.59);

-- Insert values into the Supplier table
INSERT INTO Supplier VALUES (1, 'Global Pharma', 'contact@globalpharma.com');
INSERT INTO Supplier VALUES (2, 'MedSupply', 'info@medsupply.com');
INSERT INTO Supplier VALUES (3, 'Health Distributors', 'sales@healthdistributors.com');
INSERT INTO Supplier VALUES (4, 'Pharma Wholesale', 'support@pharmawholesale.com');
INSERT INTO Supplier VALUES (5, 'Medicorp', 'contact@medicorp.com');
INSERT INTO Supplier VALUES (6, 'Wellness Suppliers', 'info@wellnesssuppliers.com');
INSERT INTO Supplier VALUES (7, 'CareMedical', 'sales@caremedical.com');
INSERT INTO Supplier VALUES (8, 'MedDepot', 'support@meddepot.com');
INSERT INTO Supplier VALUES (9, 'PharmaDirect', 'contact@pharmadirect.com');
INSERT INTO Supplier VALUES (10, 'HealthMart', 'info@healthmart.com');

-- Insert values into the Orders table
INSERT INTO Orders VALUES (1, 1, 1, 50, TO_DATE('2024-01-15', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (2, 2, 2, 75, TO_DATE('2024-01-20', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (3, 3, 3, 100, TO_DATE('2024-02-10', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (4, 4, 4, 30, TO_DATE('2024-02-15', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (5, 5, 5, 40, TO_DATE('2024-03-05', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (6, 6, 6, 60, TO_DATE('2024-03-10', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (7, 7, 7, 80, TO_DATE('2024-03-15', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (8, 8, 8, 70, TO_DATE('2024-04-01', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (9, 9, 9, 90, TO_DATE('2024-04-10', 'YYYY-MM-DD'));
INSERT INTO Orders VALUES (10, 10, 10, 50, TO_DATE('2024-04-20', 'YYYY-MM-DD'));

-- Insert values into the Inventory table
INSERT INTO Inventory VALUES (1, 1, 100);
INSERT INTO Inventory VALUES (2, 2, 150);
INSERT INTO Inventory VALUES (3, 3, 200);
INSERT INTO Inventory VALUES (4, 4, 50);
INSERT INTO Inventory VALUES (5, 5, 75);
INSERT INTO Inventory VALUES (6, 6, 120);
INSERT INTO Inventory VALUES (7, 7, 100);
INSERT INTO Inventory VALUES (8, 8, 130);
INSERT INTO Inventory VALUES (9, 9, 80);
INSERT INTO Inventory VALUES (10, 10, 90);

-- Insert values into the Transaction table
INSERT INTO Transaction VALUES (1, 1, 'Purchase', 50, TO_DATE('2024-01-15', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (2, 2, 'Purchase', 75, TO_DATE('2024-01-20', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (3, 3, 'Purchase', 100, TO_DATE('2024-02-10', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (4, 4, 'Purchase', 30, TO_DATE('2024-02-15', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (5, 5, 'Purchase', 40, TO_DATE('2024-03-05', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (6, 6, 'Purchase', 60, TO_DATE('2024-03-10', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (7, 7, 'Purchase', 80, TO_DATE('2024-03-15', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (8, 8, 'Purchase', 70, TO_DATE('2024-04-01', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (9, 9, 'Purchase', 90, TO_DATE('2024-04-10', 'YYYY-MM-DD'));
INSERT INTO Transaction VALUES (10, 10, 'Purchase', 50, TO_DATE('2024-04-20', 'YYYY-MM-DD'));

-- Insert values into the Customer table
INSERT INTO Customer VALUES (1, 'Kalai', 'kalai@gmail.com', '978-756-4563');
INSERT INTO Customer VALUES (2, 'Jahan', 'jahan@gmail.com', '897-345-8456');
INSERT INTO Customer VALUES (3, 'Robert', 'robert@gmail.com', '945-678-9012');
INSERT INTO Customer VALUES (4, 'Michael', 'michael@gmail.com', '956-789-0123');
INSERT INTO Customer VALUES (5, 'Maran', 'maran@gmail.com', '867-890-1234');
INSERT INTO Customer VALUES (6, 'David', 'david@gmail.com', '778-901-2345');
INSERT INTO Customer VALUES (7, 'Miller', 'miller@gmail.com', '989-012-3456');
INSERT INTO Customer VALUES (8, 'Jack', 'jack@gmail.com', '890-123-4567');
INSERT INTO Customer VALUES (9, 'Anderson', 'anderson@gmail.com', '901-234-5678');
INSERT INTO Customer VALUES (10, 'Chandru', 'chandru@gmail.com', '712-345-6789');

-- Insert values into the Sales table
INSERT INTO Sales VALUES (1, 1, 1, 10, 59.90, TO_DATE('2024-05-01', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (2, 2, 2, 20, 169.80, TO_DATE('2024-05-05', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (3, 3, 3, 15, 101.85, TO_DATE('2024-05-10', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (4, 4, 4, 5, 62.50, TO_DATE('2024-05-15', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (5, 5, 5, 8, 127.92, TO_DATE('2024-05-20', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (6, 6, 6, 12, 119.88, TO_DATE('2024-05-25', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (7, 7, 7, 18, 257.22, TO_DATE('2024-06-01', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (8, 8, 8, 14, 111.86, TO_DATE('2024-06-05', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (9, 9, 9, 16, 183.84, TO_DATE('2024-06-10', 'YYYY-MM-DD'));
INSERT INTO Sales VALUES (10, 10, 10, 11, 116.49, TO_DATE('2024-06-15', 'YYYY-MM-DD'));

-- Insert values into the Returns table
INSERT INTO Returns VALUES (1, 1, TO_DATE('2024-05-02', 'YYYY-MM-DD'), 'Defective', 2);
INSERT INTO Returns VALUES (2, 2, TO_DATE('2024-05-06', 'YYYY-MM-DD'), 'Expired', 1); 
INSERT INTO Returns VALUES (3, 3, TO_DATE('2024-05-11', 'YYYY-MM-DD'), 'Wrong Item', 3);
INSERT INTO Returns VALUES (4, 4, TO_DATE('2024-05-16', 'YYYY-MM-DD'), 'Changed Mind', 1);
INSERT INTO Returns VALUES (5, 5, TO_DATE('2024-05-21', 'YYYY-MM-DD'), 'Defective', 2);
INSERT INTO Returns VALUES (6, 6, TO_DATE('2024-05-26', 'YYYY-MM-DD'), 'Damaged', 1);
INSERT INTO Returns VALUES (7, 7, TO_DATE('2024-06-02', 'YYYY-MM-DD'), 'Incorrect Quantity', 1);
INSERT INTO Returns VALUES (8, 8, TO_DATE('2024-06-06', 'YYYY-MM-DD'), 'Defective', 2);
INSERT INTO Returns VALUES (9, 9, TO_DATE('2024-06-11', 'YYYY-MM-DD'), 'Changed Mind', 1);
INSERT INTO Returns VALUES (10, 10, TO_DATE('2024-06-16', 'YYYY-MM-DD'), 'Damaged', 1);

-- Insert values into the Employees table
INSERT INTO Employees VALUES (1, 'lenkesh', 'Manager', 'velu@gmail.com', '723-456-7890', 'pass1234', TO_DATE('1985-05-15', 'YYYY-MM-DD'), '123 Elm St', 123456);
INSERT INTO Employees VALUES (2, 'Vishal', 'Sales Associate', 'vishal@gmail.com', '894-567-8901', 'pass5678', TO_DATE('1990-07-20', 'YYYY-MM-DD'), '456 Oak St', 234567);
INSERT INTO Employees VALUES (3, 'Saran', 'Cashier', 'saran@gmail.com', '785-678-9012', 'pass9101', TO_DATE('1992-08-25', 'YYYY-MM-DD'), '789 Pine St', 345678);
INSERT INTO Employees VALUES (4, 'Mohan', 'Stock Clerk', 'mohan@gmail.com', '976-789-0123', 'pass1121', TO_DATE('1988-11-30', 'YYYY-MM-DD'), '101 Maple St', 456789);
INSERT INTO Employees VALUES (5, 'Charlie', 'Security', 'charlie@gmail.com', '967-890-1234', 'pass3141', TO_DATE('1983-02-17', 'YYYY-MM-DD'), '202 Birch St', 567890);
INSERT INTO Employees VALUES (6, 'Dana', 'Manager', 'dana@gmail.com', '878-901-2345', 'pass5161', TO_DATE('1979-03-22', 'YYYY-MM-DD'), '303 Cedar St', 678901);
INSERT INTO Employees VALUES (7, 'Elsa', 'Sales Associate', 'elsa@gmail.com', '799-012-3456', 'pass7181', TO_DATE('1995-04-27', 'YYYY-MM-DD'), '404 Spruce St', 789012);
INSERT INTO Employees VALUES (8, 'Harris', 'Cashier', 'harris@gmail.com', '870-123-4567', 'pass9201', TO_DATE('1987-06-18', 'YYYY-MM-DD'), '505 Willow St', 890123);
INSERT INTO Employees VALUES (9, 'George', 'Stock Clerk', 'george@gmail.com', '901-234-5678', 'pass1123', TO_DATE('1981-09-14', 'YYYY-MM-DD'), '606 Aspen St', 901234);
INSERT INTO Employees VALUES (10, 'Hari', 'Security', 'hari@gmail.com', '987-345-6789', 'pass3141', TO_DATE('1986-12-05', 'YYYY-MM-DD'), '707 Fir St', 123456);

-- Insert values into the Employee_Sales table
INSERT INTO Employee_Sales VALUES (1, 1, 5.99);
INSERT INTO Employee_Sales VALUES (2, 2, 8.49);
INSERT INTO Employee_Sales VALUES (3, 3, 6.79);
INSERT INTO Employee_Sales VALUES (4, 4, 12.50);
INSERT INTO Employee_Sales VALUES (5, 5, 15.99);
INSERT INTO Employee_Sales VALUES (6, 6, 9.99);
INSERT INTO Employee_Sales VALUES (7, 7, 14.29);
INSERT INTO Employee_Sales VALUES (8, 8, 7.99);
INSERT INTO Employee_Sales VALUES (9, 9, 11.49);
INSERT INTO Employee_Sales VALUES (10, 10, 10.59);




-- This is used to auto increment the employee id in the employee table
CREATE SEQUENCE employee_seq
START WITH 10
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- This trigger is used to call the sequence whenever a row is trying to insert in the employees table
CREATE OR REPLACE TRIGGER employee_before_insert
BEFORE INSERT ON Employees
FOR EACH ROW
WHEN (NEW.employee_id IS NULL)
BEGIN
  SELECT employee_seq.NEXTVAL
  INTO :NEW.employee_id
  FROM dual;
END;
/

COMMIT;

