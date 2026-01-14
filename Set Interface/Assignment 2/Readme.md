# Assignment 2: Remove Duplicates from Array

```
╔═══════════════════════════════════════════════════════════╗
║        REMOVE DUPLICATES - PRACTICAL APPLICATION          ║
╚═══════════════════════════════════════════════════════════╝
```

## 📝 Problem Statement

Given an array with duplicate elements, use HashSet to remove duplicates and print only unique elements.

**Input:** `[5, 2, 8, 2, 9, 5, 6, 8, 3]`  
**Expected Output:** `2 3 5 6 8 9` (order may vary)

## 💡 Concepts Learned

### 1. Array to Set Conversion
This is a common interview problem. The most efficient way to remove duplicates from any collection is to convert it to a Set. No manual checking or nested loops needed.

### 2. For-Each Loop with Arrays
Used enhanced for-loop to iterate through array elements: `for (Integer i : arr)`. This is cleaner and more readable than traditional for-loop with index.

### 3. Automatic Deduplication
When adding array elements to HashSet, duplicates are automatically filtered out. Element `2` appeared twice in array but added only once to Set. Same with `5` and `8`.

### 4. Set Iteration
Demonstrated iterating through Set using for-each loop. This is the standard way to access all elements in a Set since Sets don't support index-based access like arrays or lists.

### 5. Practical Use Case
This assignment shows real-world usage of Set - removing duplicates is one of the most common operations in data processing, database queries, and algorithm problems.

### 6. Why HashSet?
HashSet was chosen because it provides O(1) insertion time. For an array of size n, this solution runs in O(n) time, which is optimal. Using nested loops would take O(n²).

## 🎯 Key Takeaway

Set's inherent duplicate prevention makes it the perfect tool for deduplication tasks. This pattern appears frequently in coding interviews and production code.

---

**Time Complexity:** O(n) - iterate array once  
**Space Complexity:** O(k) where k is number of unique elements