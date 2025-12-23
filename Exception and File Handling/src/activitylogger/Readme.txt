==============================
ACTIVITY LOGGER APPLICATION
==============================

AUTHOR
------
Priyanshu Vishwakarma

PROJECT TYPE
------------
Java Console Application (File Handling, Menu Driven)

DESCRIPTION
-----------
Activity Logger App is a Java console-based program that records
user activities like Login and Logout in a file and allows
viewing the stored logs anytime.

This project demonstrates practical usage of Java File Handling,
try-with-resources, loops, switch-case, and proper resource management.


-----------------------------
FEATURES
-----------------------------
- Menu-driven interface
- Login and Logout tracking
- Activity logging in a file
- View complete log file
- Handles invalid user inputs
- Automatic resource closing


-----------------------------
MENU OPTIONS
-----------------------------
1. Login
2. Logout
3. View Log File
4. Exit

Menu repeats until Exit is selected.


-----------------------------
TECHNOLOGIES & CONCEPTS USED
-----------------------------
- Core Java
- FileWriter (writing logs)
- FileReader (reading logs)
- try-with-resources
- switch-case
- while loop
- Scanner class
- Boolean state management


-----------------------------
HOW THE PROGRAM WORKS
-----------------------------
- Program shows a menu and takes user input.
- switch-case executes logic based on choice.

Login:
- Writes "User Logged In" to file
- Updates login status

Logout:
- Writes "User Logged Out" to file
- Updates login status

View Log File:
- Reads file character by character
- Prints content until End Of File (-1)

Exit:
- Stops the program

Invalid input shows a warning message.


-----------------------------
FILE HANDLING DETAILS
-----------------------------
Log File:
src/filehandling/activitylogger/app_activity.log

- FileWriter works in append mode
- Old logs are preserved
- flush() ensures immediate writing
- FileReader reads data character by character


-----------------------------
RESOURCE MANAGEMENT
-----------------------------
- FileWriter and FileReader use try-with-resources
- Files close automatically
- Scanner is closed in finally block


-----------------------------
ERROR HANDLING
-----------------------------
- IOException handled using try-catch
- Separate handling for read and write errors


-----------------------------
LEARNING OUTCOMES
-----------------------------
- Java file handling basics
- Working of read() and write()
- End Of File handling using -1
- Usage of try-with-resources
- Building a menu-driven console app


-----------------------------
CONCLUSION
-----------------------------
This project is a clean beginner-level Java application that
demonstrates file handling, control flow, and proper resource
management. It is suitable for college assignments and GitHub practice.

-----------------------------
END OF FILE
-----------------------------