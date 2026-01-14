# Assignment 1: Basic Set Operations

```
╔═══════════════════════════════════════════════════════════╗
║          BASIC SET OPERATIONS - FUNDAMENTALS              ║
╚═══════════════════════════════════════════════════════════╝
```

## 📝 Problem Statement

Create a HashSet, add 5 numbers (including one duplicate), and perform basic operations like checking element existence and getting the size.

**Input:** Numbers 1, 2, 3, 2, 4  
**Expected Output:**
```
Set: [1, 2, 3, 4]
Contains 3? true
Size: 4
```

## 💡 Concepts Learned

### 1. Set Interface Basics
Set is a collection that **does not allow duplicate elements**. When you add the same element twice, it automatically ignores the duplicate. This is the most important property of Set.

### 2. HashSet Implementation
`HashSet<Integer>` is the most commonly used Set implementation. It stores elements in no particular order and provides O(1) time complexity for basic operations like add, remove, and contains.

### 3. Key Methods Used
- **`add(element)`** - Adds element to Set, returns false if duplicate
- **`contains(element)`** - Checks if element exists in O(1) time
- **`size()`** - Returns the number of elements in Set

### 4. Automatic Duplicate Handling
In this assignment, number `2` was added twice, but the Set automatically kept only one copy. This eliminates the need for manual duplicate checking.

### 5. Unordered Collection
Notice that the output order may not match the insertion order. HashSet doesn't guarantee any specific order - elements are stored based on their hash values.

## 🎯 Key Takeaway

Set automatically maintains uniqueness without any extra code. This makes it perfect for scenarios where you need to store unique elements or quickly check if an element exists.

---

**Time Complexity:** O(1) for add, contains, and size operations  
**Space Complexity:** O(n) where n is the number of unique elements