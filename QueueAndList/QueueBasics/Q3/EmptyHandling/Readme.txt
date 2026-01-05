============================================================
PROJECT NAME : Queue Empty Handling (Java)
============================================================

AUTHOR        : Priyanshu Vishwakarma
LANGUAGE      : Java
TOPIC         : Queue (FIFO) – Empty Queue Handling
LEVEL         : Beginner / Practice Assignment
============================================================


DESCRIPTION
------------------------------------------------------------
This project demonstrates the implementation of Queue in Java
with proper empty queue handling.

The program safely processes items stored in a Queue using:
- isEmpty() check
- poll() method
- null handling
- while loop

It also demonstrates clean Object-Oriented Programming (OOP)
design with separate classes for:
- Item
- QueueProcessor
- Test class


FEATURES
------------------------------------------------------------
✓ Add items to queue
✓ Process queue items safely
✓ Handle empty queue condition
✓ Process custom objects inside queue
✓ Display queue status without modifying it
✓ Multiple test scenarios covered


CONCEPTS USED
------------------------------------------------------------
- Java Queue Interface
- LinkedList implementation
- FIFO (First In First Out)
- poll(), offer(), peek()
- isEmpty() method
- while loop
- for-each loop
- OOP principles
- Defensive programming
- Null handling


PROJECT STRUCTURE
------------------------------------------------------------
QueueAndList/
 └── QueueBasics/
     └── Q3/
         └── EmptyHandling/
             ├── Item.java
             ├── QueueProcessor.java
             └── TestQueueProcessor.java


HOW TO RUN
------------------------------------------------------------
1. Open the project in IntelliJ IDEA / Eclipse
2. Make sure all files are in the correct package
3. Run the TestQueueProcessor class
4. Observe the console output


EXPECTED OUTPUT
------------------------------------------------------------
- Items added to queue
- Queue status before processing
- Items processed in FIFO order
- Safe handling when queue is empty
- Final processing summary


LEARNING OUTCOME
------------------------------------------------------------
After completing this project, you will understand:
- How Queue works internally
- Why poll() is safer than remove()
- How to avoid NullPointerException
- How to design clean and testable code
- How to handle edge cases like empty queue


FUTURE IMPROVEMENTS
------------------------------------------------------------
- Add exception handling
- Add logging instead of System.out.println
- Convert to generic queue processor
- Add unit tests using JUnit


============================================================
END OF FILE
============================================================