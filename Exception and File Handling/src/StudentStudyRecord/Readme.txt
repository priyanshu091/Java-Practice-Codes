Student Study Record – Java File Handling Example

This project is a small Java practice program created to understand
how file writing works using FileWriter and BufferedWriter.

--------------------------------------------------
What this program does
--------------------------------------------------
• Takes student details from user input
• Stores the data in a text file
• Appends new records instead of overwriting
• Automatically adds the current date
• Writes data in a clean, readable format

--------------------------------------------------
Concepts Used
--------------------------------------------------
1. Scanner
   - Used to take input from the user (name, subject, study hours)

2. FileWriter
   - Used to connect the Java program with a text file
   - Append mode (true) is used so previous data is not deleted

3. BufferedWriter
   - Wrapped around FileWriter
   - Improves performance while writing data
   - Allows writing multiple lines efficiently
   - newLine() is used for proper line separation

4. LocalDate
   - Used to get the current date
   - LocalDate.now() provides today's date

5. String.format()
   - Used for clean and readable string formatting
   - Acts like f-string style formatting in Java

6. Try-with-resources
   - Automatically closes BufferedWriter
   - Prevents resource leaks

--------------------------------------------------
Why BufferedWriter is used
--------------------------------------------------
BufferedWriter is used because:
• Multiple lines are written to the file
• It improves performance
• It is a best practice for file writing in Java

--------------------------------------------------
File Output Example
--------------------------------------------------
Name: Rahul
Subject: Java
Hours Studied: 2.5
Date: 19-12-2025
-------------------------

--------------------------------------------------
Purpose of this Project
--------------------------------------------------
This is not a big project.
It is a learning-based practice program created to understand
Java file handling concepts step by step.

The goal is consistency and learning fundamentals clearly.

--------------------------------------------------
Author
--------------------------------------------------
Priyanshu Vishwakarma
Java Beginner | Practicing Core Java Concepts