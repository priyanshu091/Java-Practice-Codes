
Library Management System - ArrayList with Custom Objects

## 📋 Project Overview
A simple library management system demonstrating how to store and manage custom `Book` objects in an ArrayList. This project focuses on working with user-defined classes in Java collections rather than primitive data types.

---

## 🎯 Learning Objectives
- Store custom objects in ArrayList
- Implement search functionality by object properties
- Use getters to access private object data
- Override toString() for readable object representation
- Handle empty collections gracefully
- Practice encapsulation principles

---

## 📂 Project Structure
```
ArrayListOperations/
└── Q5ListwithCustomObjects/
    ├── Book.java              # Custom Book class
    ├── Library.java           # Library management class
    ├── TestLibrary.java       # Test suite
    └── README.md              # This file
```

---

## 🔧 Classes and Features

### **Book Class**

**Purpose:** Represents a book with three properties

**Attributes:**
```java
private int bookId;      // Unique identifier
private String title;    // Book name
private String author;   // Author name
```

**Methods:**
- `Constructor` - Initializes book with id, title, author
- `getBookId()` - Returns book ID (needed for searching)
- `toString()` - Returns formatted book information

**Key Design Decision:**
```java
// Only getter for bookId - because search needs it
// No setters - books are immutable once created
public int getBookId() {
    return bookId;
}
```

**toString() Implementation:**
```java
@Override
public String toString() {
    return "\nBook Title: " + title +
           "\nBook ID: " + bookId +
           "\nBook Author: " + author + "\n";
}
```

---

### **Library Class**

**Purpose:** Manages collection of books

**Instance Variable:**
```java
List bookList = new ArrayList<>();
```

**Why ArrayList?**
- Dynamic size (grows as books are added)
- Fast random access by index
- Supports custom object storage

---

#### **Method 1: addBook()**

**Signature:**
```java
void addBook(int bookId, String title, String author)
```

**Implementation:**
```java
Book book = new Book(bookId, title, author);  // Create object
bookList.add(book);                           // Add to list
```

**Flow:**
1. Create new Book object with provided parameters
2. Add Book object to ArrayList
3. ArrayList stores reference to Book object (not a copy)

**Example:**
```java
lb.addBook(001, "Coding Book", "Anonymous");
// Creates: Book object with id=1, title="Coding Book", author="Anonymous"
// Stores: Reference to this object in bookList
```

---

#### **Method 2: findBookById()**

**Signature:**
```java
void findBookById(int searchbookID)
```

**Implementation Pattern:**
```java
boolean found = false;
int index = 0;

while (index < bookList.size()) {
    Book b = bookList.get(index);          // Get book at index
    if (searchbookID == b.getBookId()) {   // Compare IDs
        System.out.println(b);              // Print if found
        found = true;
    }
    index++;
}

if (!found) {
    System.out.println("Book Not Found");
}
```

**Step-by-Step Logic:**

**Step 1: Initialize tracking variables**
```java
boolean found = false;  // Tracks search result
int index = 0;          // Current position
```

**Step 2: Loop through entire list**
```java
while (index < bookList.size()) {
    // Check each book
}
```

**Step 3: Get book and compare**
```java
Book b = bookList.get(index);      // Get Book object
if (searchbookID == b.getBookId()) // Call getter to compare
```

**Step 4: Handle result**
```java
if (!found) {
    // Only print if no match found in entire loop
}
```

**Key Points:**
- `get(index)` returns `Book` object (not primitive)
- Can call `getBookId()` on returned object
- Must use getter because `bookId` is private
- Flag prevents "not found" when book exists

---

#### **Method 3: showAllBooks()**

**Signature:**
```java
void showAllBooks()
```

**Implementation:**
```java
if (bookList.isEmpty()) {
    System.out.println("No books in Library");
    return;  // Exit early if empty
}

int index = 0;
while (index < bookList.size()) {
    Book b = bookList.get(index);
    System.out.println((index + 1) + ". " + b);  // Numbering starts at 1
    index++;
}
```

**Features:**
- Empty check with early return
- Numbered list (1, 2, 3... not 0, 1, 2)
- Calls `toString()` automatically when printing object
- Clean separation with `=` characters

**Output Format:**
```
========================= Showing All Books =========================
1. 
Book Title: Coding Book
Book ID: 1
Book Author: Anonymous

2. 
Book Title: Theory Book
Book ID: 2
Book Author: Unknown
```

---

## 💡 Key Concepts Demonstrated

### 1. **Custom Objects in ArrayList**

**Concept:** ArrayList can store ANY type, not just primitives
```java
// Primitive wrapper
List numbers = new ArrayList<>();

// Custom object
List books = new ArrayList<>();  // ✅ Works!
```

**Why it matters:**
- Real applications deal with complex objects
- Need to understand object references vs values
- Collections store references, not copies

---

### 2. **Object References**

**What happens:**
```java
Book book = new Book(1, "Java", "Author");
bookList.add(book);
```

**Memory:**
```
Stack:                    Heap:
book ──────────────────> Book object
                         - bookId: 1
                         - title: "Java"
                         - author: "Author"

bookList:
[0] ──────────────────> Same Book object (reference copy)
```

**Key Point:** ArrayList stores reference, not a separate copy!

---

### 3. **Encapsulation in Action**

**Problem:** Need to access bookId for searching

**Wrong Approach:**
```java
// Make bookId public ❌
public int bookId;

// Access directly
if (searchId == b.bookId)  // Breaks encapsulation!
```

**Correct Approach:**
```java
// Keep bookId private ✅
private int bookId;

// Provide getter
public int getBookId() {
    return bookId;
}

// Access via method
if (searchId == b.getBookId())  // Encapsulation maintained!
```

**Benefits:**
- Can add validation in getter if needed
- Can change internal implementation later
- Controlled access to data

---

### 4. **toString() Importance**

**Without toString():**
```java
System.out.println(book);
// Output: Book@15db9742  ❌ (memory address - not helpful!)
```

**With toString():**
```java
@Override
public String toString() {
    return "Book Title: " + title + "...";
}

System.out.println(book);
// Output: Book Title: Java  ✅ (readable!)
```

**When called:**
- Automatically by `println(object)`
- Explicitly via `object.toString()`
- During string concatenation: `"Book: " + book`

---

### 5. **Boolean Flag Pattern**

**Purpose:** Track whether something happened in a loop

**Pattern:**
```java
boolean found = false;  // Assume not found

while (...) {
    if (condition) {
        found = true;   // Mark as found
    }
}

if (!found) {           // Check after loop
    // Handle not found case
}
```

**Why needed:**
- Can't break loop (might want to find all matches)
- Need to know result after entire loop completes
- Prevents incorrect "not found" messages

---

## 🧪 Test Cases

### Test 1: Add Books
```java
lb.addBook(001, "Coding Book", "Anonymous");
lb.addBook(002, "Theory Book", "Unknown");

Expected: 2 books in library
```

### Test 2: Display All Books
```java
lb.showAllBooks();

Expected Output:
========================= Showing All Books =========================
1. 
Book Title: Coding Book
Book ID: 1
Book Author: Anonymous

2. 
Book Title: Theory Book
Book ID: 2
Book Author: Unknown
```

### Test 3: Find Existing Book
```java
lb.findBookById(001);

Expected Output:
========================= Book Found =========================
Book Details:
Book Title: Coding Book
Book ID: 1
Book Author: Anonymous
```

### Test 4: Find Non-Existent Book
```java
lb.findBookById(003);

Expected Output:
========================= Book Not Found =========================
```

### Test 5: Empty Library
```java
Library emptyLib = new Library();
emptyLib.showAllBooks();

Expected Output:
========================= Showing All Books =========================
No books in Library
```

---

## 📊 ArrayList Methods Used

| Method | Purpose | Example |
|--------|---------|---------|
| `add(object)` | Add custom object | `bookList.add(book)` |
| `get(index)` | Retrieve object | `Book b = bookList.get(i)` |
| `size()` | Get count | `bookList.size()` |
| `isEmpty()` | Check if empty | `bookList.isEmpty()` |

---

## 🔍 Code Quality Features

### ✅ **Good Practices Implemented**

1. **Encapsulation**
    - Private variables
    - Public getters (only where needed)
    - No setters (immutability)

2. **Defensive Programming**
    - Empty list check before display
    - Boolean flag for search result
    - Early return pattern

3. **Clean Output**
    - Formatted separators with `"=".repeat(25)`
    - Numbered lists (1-based, not 0-based)
    - Clear section headers

4. **Proper toString()**
    - Multi-line formatting
    - All relevant information included
    - Readable structure

---

## 💭 Comparison: Q4 vs Q5

| Aspect | Q4 (StudentList) | Q5 (Library) |
|--------|------------------|--------------|
| Data Type | String (primitive wrapper) | Book (custom class) |
| Storage | `List<String>` | `List<Book>` |
| Access | Direct string value | Via getters on object |
| Complexity | Simple | More realistic |
| Real-world | Basic example | Actual use case |

**Key Difference:**
```java
// Q4: Simple
String name = students.get(i);
System.out.println(name);

// Q5: Object-oriented
Book book = books.get(i);
System.out.println(book.getTitle());  // Need getter
```

---

## 🚀 Possible Enhancements

**Not implemented but could be added:**

1. **Remove book by ID**
```java
void removeBook(int bookId) {
    // Loop and remove matching book
}
```

2. **Search by title or author**
```java
void findBookByTitle(String title) {
    // Search using title.equals()
}
```

3. **Update book details**
```java
void updateBook(int bookId, String newTitle) {
    // Find and update
}
```

4. **Sort books**
```java
void sortByTitle() {
    // Use Collections.sort()
}
```

5. **Count total books**
```java
int getTotalBooks() {
    return bookList.size();
}
```

---

## 📈 Progress Tracker

**Questions Completed:** 5/10 (50% milestone! 🎉)

**Section 2 Complete:**
- ✅ Q4: List Basic Operations
- ✅ Q5: List with Custom Objects

**Next Target:** Q6 - Queue + List Integration

---

## 🎓 Key Takeaways

1. **ArrayList works with any object type** - not limited to primitives
2. **Objects stored by reference** - not copied
3. **Getters essential** for accessing private data from stored objects
4. **toString() crucial** for debugging and display
5. **Boolean flags** track state across iterations
6. **Encapsulation** maintained even in collections
7. **Custom classes** make collections more powerful and realistic

---

## 🔗 Resources

- [ArrayList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- Object-Oriented Programming principles
- Encapsulation best practices

---

## 📝 Additional Notes

**Why use custom objects?**
- Real applications rarely use just String/Integer
- Need to model complex entities (Book, Student, Patient, etc.)
- Collections become more meaningful and useful

**When to use ArrayList?**
- Need index-based access
- Frequent reading, less frequent modifications
- Don't need thread safety
- Size changes dynamically

**Alternative: LinkedList**
- Better for frequent insertions/deletions
- Worse for random access
- Same interface, different performance

---

**Author:** [Your Name]  
**Date:** January 2026  
**Part of:** Hospital ER Assignment Practice Series (Q1-Q10)  
**Milestone:** 50% Complete! 🎉

---

END OF README
```

---

## 🎯 **Post Strategy:**

**Screenshots to Include:**
1. Book class code (showing encapsulation)
2. Library class methods
3. Test output showing formatted books
4. Folder structure

**First Comment:**
```
💡 Fun Fact: ArrayList doesn't just store primitives!

You can store:
✅ Custom classes (Book, Student, Car...)
✅ Other collections (List of Lists)
✅ Even interfaces!

The power of generics 🚀