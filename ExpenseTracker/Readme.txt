============================================================
                EXPENSE TRACKER (JAVA)
              OOPS + COLLECTIONS + FILE I/O
============================================================

PROJECT OVERVIEW
------------------------------------------------------------
This is a simple console-based Expense Tracker application
developed using Core Java.

The main objective of this project is to practice and
understand Object Oriented Programming (OOPS) concepts
along with Collections, Exception Handling, and File Handling.

This application allows:
- Creating expense objects
- Storing multiple expenses
- Displaying all expenses
- Calculating total expense
- Saving expense records to a text file


CONCEPTS USED
------------------------------------------------------------
1. Core Java

2. Object Oriented Programming (OOPS)
   - Classes and Objects
   - Encapsulation
   - Constructors
   - Method Overriding (toString)

3. Collections Framework
   - ArrayList

4. Exception Handling
   - IllegalArgumentException
   - try-catch blocks

5. File Handling
   - FileWriter (append mode)
   - Writing data into a .txt file


PROJECT STRUCTURE
------------------------------------------------------------
ExpenseTracker/
|
|-- Expense.java
|-- ExpenseManager.java
|-- ExpenseTrackerMain.java
|-- Expenses.txt   (generated at runtime)


CLASS DETAILS
------------------------------------------------------------

Expense.java
------------------------------------------------------------
This class represents a single expense.

Responsibilities:
- Stores expense details (category, description, amount)
- Uses encapsulation (private variables)
- Validates input using constructor and setters
- Provides readable output using toString() method


ExpenseManager.java
------------------------------------------------------------
This class handles all business logic.

Responsibilities:
- Stores Expense objects using ArrayList
- Displays all expenses
- Calculates total expense
- Saves expense data into a file (Expenses.txt)


ExpenseTrackerMain.java
------------------------------------------------------------
This is the main class and entry point of the application.

Responsibilities:
- Creates Expense objects
- Adds expenses to ExpenseManager
- Displays expenses and total amount
- Saves output to file


SAMPLE CONSOLE OUTPUT
------------------------------------------------------------
---- Expense List ----
Category: food      Description: Lunch      Amount: 230.0
Category: Travel    Description: from Bus   Amount: 60.0
Category: Shopping  Description: Clothes    Amount: 800.0
------------------------------------------------------------
Total Amount of All Expenses: 1090.0
Expenses Saved to File Successfully


FILE OUTPUT (Expenses.txt)
------------------------------------------------------------
-----Expenses List-----
Category: food      Description: Lunch      Amount: 230.0
Category: Travel    Description: from Bus   Amount: 60.0
Category: Shopping  Description: Clothes    Amount: 800.0
----------------------
Total Expense: 1090.0 Rs


HOW TO RUN
------------------------------------------------------------
1. Open the project in IntelliJ IDEA or VS Code
2. Compile and run ExpenseTrackerMain.java
3. Check console output
4. Check Expenses.txt file in project root directory


WHY THIS PROJECT
------------------------------------------------------------
- Beginner-friendly Java project
- Strong OOPS practice
- Real-life use case
- Clean and simple design
- Good foundation for Core Java learning


FUTURE IMPROVEMENTS
------------------------------------------------------------
- User input using Scanner
- Category-wise expense calculation
- Menu-driven interface
- Reading data from file
- Adding date and time to expenses


AUTHOR
------------------------------------------------------------
Priyanshu Vishwakarma
Java Learner | Core Java | OOPS | File Handling

============================================================
