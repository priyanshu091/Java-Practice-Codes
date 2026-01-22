# Set Intersection - Finding Common Elements

A Java implementation demonstrating Set operations for finding intersections between multiple collections using HashSet and `retainAll()` method.

## 📋 Assignment Overview

This project implements efficient set intersection operations to find common elements across multiple integer arrays.

## 🎯 Features

### Part A - Basic Intersection
- Create two integer arrays with overlapping values
- Convert arrays to HashSet
- Find common elements using `retainAll()`
- Print intersection results

### Part B - Three-Way Intersection
- Find elements common to ALL three arrays
- Handle edge cases (empty arrays, no common elements)
- Efficient O(n) implementation

### Part C - Analysis
- Display size of each array
- Show intersection sizes
- Calculate overlap percentage based on total unique elements

## 💻 Code Structure

```
SetInterface/Assignment3/
├── FindCommonElementsSet.java    # Core logic implementation
└── Test.java                      # Main class with example usage
```

## 🚀 Usage

```java
int[] arr1 = {1, 2, 3, 4, 5, 6};
int[] arr2 = {4, 5, 6, 7, 8, 9};
int[] arr3 = {3, 4, 5, 10, 11};

// Two-way intersection
Set<Integer> twoWay = FindCommonElementsSet.findBasicIntersection(arr1, arr2);
System.out.println("Common in Array1 & Array2: " + twoWay);

// Three-way intersection
Set<Integer> threeWay = FindCommonElementsSet.threeWayIntersection(arr1, arr2, arr3);
System.out.println("Common in all three: " + threeWay);

// Analysis
FindCommonElementsSet.printArr(arr1, arr2, arr3, twoWay, threeWay);
```

## 📊 Example Output

```
Common in Array1 & Array2: [4, 5, 6]
Common in all three: [4, 5]
Array 1 size: 6
Array 2 size: 6
Array 3 size: 5

Two-way intersection size (Array1 & Array2): 3
Three-way intersection size (All three): 2
Intersection percentage: 16.67%
===============================
```

## 🔑 Key Concepts

### Why `retainAll()` works this way:
```java
set1.retainAll(set2);  // set1 now contains only common elements with set2
set1.retainAll(set3);  // set1 now contains elements common to all three
```

**Important:** `retainAll()` modifies **only the calling set**. That's why we don't need `set2.retainAll(set3)` - we're building the final result in `set1`.

## ⚡ Time Complexity

| Operation | HashSet Approach | Nested Loops |
|-----------|-----------------|--------------|
| Two-way intersection | O(n) | O(n²) |
| Three-way intersection | O(n) | O(n³) |

## 🛠️ Technologies Used

- Java
- Collections Framework (HashSet)
- Set interface operations

## 📚 Learning Outcomes

- Understanding Set intersection operations
- Efficient use of `retainAll()` method
- Handling edge cases in data processing
- Time complexity optimization
- Real-world data comparison scenarios

## 🔍 Real-World Applications

- Finding common interests between users
- Database record matching
- Data deduplication
- Similarity analysis in datasets
- Feature overlap detection

## 👤 Author

Created as part of Java Collections Framework assignment

## 📝 License

This project is open source and available for educational purposes.
