# Mini Hospital System

A Java-based emergency patient management system using **PriorityQueue** to treat patients based on emergency levels.

---

## Problem Statement

Build a hospital system that manages patients with different emergency levels and treats them in priority order (Level 1 before Level 2 before Level 3).

**Requirements:**
- Patient class with name and emergency level
- PriorityQueue with custom comparator
- ArrayList to maintain treated patient records
- Methods: `addPatient()`, `treatNext()`, `showTreated()`

**Test Case:**
```
Add patients: Level 3, Level 1, Level 2
Treatment order: Level 1 → Level 2 → Level 3
```

---

## Project Structure

```
CombinedArrayAndQueue.Q10MiniHospitalSystem/
├── Patient.java           # Patient data model
├── ManageHospital.java    # Hospital management system
└── TestHospital.java      # Test driver class
```

---

## Core Concepts

### PriorityQueue with Custom Comparator

```java
PriorityQueue<Patient> patientPriorityQueue = new PriorityQueue<>(
    (p1, p2) -> Integer.compare(p1.getEmergencyLevel(), p2.getEmergencyLevel())
);
```

**How it works:**
- `Integer.compare(a, b)` returns negative if `a < b` (a gets priority)
- Returns positive if `a > b` (b gets priority)
- Returns zero if equal

**Result:** Patient with Level 1 treated before Level 3

---

## Key Methods

### ManageHospital Class

**addPatient(Patient patient)**
- Adds patient to priority queue
- Uses `offer()` method

**treatNext()**
- Removes highest priority patient using `poll()`
- Adds to treated patient list
- Handles empty queue case

**showTreated()**
- Displays all treated patients
- Uses `isEmpty()` check before iteration
- Shows "No patient treated yet" if empty

---

## Sample Output

```
Patient Added: Amit (Emergency Level): 3
Patient Added: Ruchi (Emergency Level): 2
Patient Added: Aman (Emergency Level): 1
====================List of Treated Patient====================

No patient Treated yet

Patient Treated: Aman (Level 1)
====================List of Treated Patient====================

1. Aman (Level 1)
```

---

## How to Run

### Prerequisites
- Java JDK 8 or higher

### Steps

1. Compile the code:
```bash
javac CombinedArrayAndQueue/Q10MiniHospitalSystem/*.java
```

2. Run the test class:
```bash
java CombinedArrayAndQueue.Q10MiniHospitalSystem.TestHospital
```

---

## Key Learnings

### Technical Skills
- PriorityQueue implementation with custom comparator
- Lambda expressions for cleaner code
- ArrayList integration for data persistence
- Object-oriented design principles

### Challenges Overcome

**Understanding Integer.compare()**
- Learned how comparison functions work
- Understood negative/zero/positive return values

**isEmpty() vs null check**
- Realized `isEmpty()` checks collection size
- Understood it should be placed before loop, not inside

**Loop placement**
- Enhanced for-loop doesn't execute on empty collections
- Validation should happen before iteration

---

## Concepts Reference

### PriorityQueue Methods
- `offer(element)` - Add element to queue
- `poll()` - Remove and return highest priority element
- `isEmpty()` - Check if queue is empty

### ArrayList Methods
- `add(element)` - Add element to list
- `isEmpty()` - Check if list is empty
- Enhanced for-loop for iteration

---

## Future Enhancements

- Add multiple priority factors (age, severity)
- Implement patient discharge functionality
- Add appointment scheduling
- Database integration for persistence

---

## License

This project is part of a learning assignment for Data Structures & Algorithms practice.

---

**Made with Java**
