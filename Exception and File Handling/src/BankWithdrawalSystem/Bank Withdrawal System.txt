# Bank Withdrawal System (Java)

## ?? About This Program
This program simulates a simple bank withdrawal system using Java.
It demonstrates complete Exception Handling concepts.

## ?? What this program does
- Takes account balance from user
- Takes withdrawal amount from user
- Validates the input values
- Performs withdrawal if all conditions are correct
- Shows appropriate error messages using custom exceptions

## ?? Validation Rules
1. Withdrawal amount must be greater than 0
2. Balance must not be negative
3. Withdrawal amount should not be greater than balance

## ?? Custom Exceptions Used
1. InvalidAmtException  
   - Thrown when withdrawal amount or balance is invalid

2. InsufficientBalanceException  
   - Thrown when withdrawal amount is greater than balance

## ?? Java Concepts Used
- Custom Exceptions
- throw keyword
- throws keyword
- try-catch-finally
- Multiple catch blocks
- Scanner for user input

## ? Output Behavior
- On success: Remaining balance is displayed
- On error: Proper error message is shown
- Finally: "Transaction Ended" is always printed

## ?? Purpose
This program is created for learning and practicing
Java Exception Handling with real-life example.
