# Java Map Interface - 5 Day Practice Challenge 🚀

A comprehensive collection of assignments to master the Map interface in Java through hands-on practice.

## 📚 Learning Objectives

This repository contains 5 progressively challenging assignments designed to help you master:
- Basic Map operations (put, get, remove, containsKey)
- Safe operations (getOrDefault, putIfAbsent, replace)
- Collection views (keySet, values, entrySet)
- Real-world Map usage patterns
- Iteration techniques

## 🎯 Assignment Overview

### Day 1: Student Grade Manager
**Focus**: Basic operations (put, get, containsKey, size, isEmpty)
- Managing student grades
- Checking existence of students
- Basic Map status checks

**Key Methods**: `put()`, `get()`, `containsKey()`, `size()`, `isEmpty()`

---

### Day 2: Shopping Cart System
**Focus**: CRUD operations and safe retrieval
- Adding/removing products
- Updating quantities
- Safe value retrieval with defaults

**Key Methods**: `put()`, `remove()`, `get()`, `getOrDefault()`, `keySet()`

---

### Day 3: Phone Directory
**Focus**: Safe updates and value collections
- Managing contacts
- Preventing duplicate entries
- Updating existing records safely

**Key Methods**: `putIfAbsent()`, `replace()`, `values()`

---

### Day 4: Word Frequency Counter
**Focus**: Iteration and practical patterns
- Counting word occurrences
- Using Map for frequency analysis
- Advanced iteration with entrySet

**Key Methods**: `entrySet()`, `putIfAbsent()`, `getOrDefault()`

---

### Day 5: Employee Management System
**Focus**: Comprehensive Map usage
- Complex data management
- Calculations using Map data
- Finding maximum/minimum values
- Complete CRUD operations

**All Methods Combined**: Complete Map interface mastery

---

## 📖 Additional Resources

### Map Methods Reference Guide
Check `MapMethodsReference.java` for:
- Complete method documentation with examples
- Common patterns and use cases
- Key differences between similar methods
- Best practices and tips

## 🔑 Essential Map Methods

| Method | Purpose | Common Use Case |
|--------|---------|-----------------|
| `put(K, V)` | Add/update entry | Adding data |
| `get(K)` | Retrieve value | Getting data |
| `remove(K)` | Delete entry | Removing data |
| `containsKey(K)` | Check key exists | Validation |
| `containsValue(V)` | Check value exists | Search |
| `size()` | Get entry count | Statistics |
| `isEmpty()` | Check if empty | Validation |
| `clear()` | Remove all entries | Reset |
| `getOrDefault(K, V)` | Safe retrieval | Prevent null |
| `putIfAbsent(K, V)` | Conditional add | Prevent overwrite |
| `replace(K, V)` | Safe update | Update existing |
| `keySet()` | Get all keys | Iteration |
| `values()` | Get all values | Calculations |
| `entrySet()` | Get key-value pairs | Full iteration |

## 💡 Key Learning Points

1. **entrySet() is your friend** - Best way to iterate when you need both keys and values
2. **Use getOrDefault()** - Prevents NullPointerException
3. **putIfAbsent() for counting** - Common pattern for frequency analysis
4. **replace() is safer than put()** - When you want to ensure key exists
5. **Maps don't allow duplicate keys** - Latest value always wins

## 🚀 How to Use This Repository

1. **Start with MapMethodsReference.java** - Understand all methods first
2. **Complete one assignment per day** - Builds muscle memory
3. **Don't look at solutions immediately** - Try to solve independently
4. **Test your code thoroughly** - Add your own test cases
5. **Push daily to GitHub** - Track your progress

## 📝 Assignment Checklist

- [ ] Day 1: Student Grade Manager
- [ ] Day 2: Shopping Cart System
- [ ] Day 3: Phone Directory
- [ ] Day 4: Word Frequency Counter
- [ ] Day 5: Employee Management System

## 🎓 What You'll Learn

By completing these assignments, you'll:
- Master all essential Map methods
- Understand when to use which method
- Learn common Map patterns in Java
- Build confidence with collection frameworks
- Be ready for real-world Java projects

## 🔗 Resources

- [Java Map Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
- [HashMap vs LinkedHashMap vs TreeMap](https://www.baeldung.com/java-hashmap-vs-linkedhashmap-vs-treemap)

## 📌 Tips for Success

1. Run the code after each change
2. Add print statements to understand flow
3. Try modifying the assignments
4. Create your own test scenarios
5. Comment your code for clarity

## 🤝 Contributing

Feel free to:
- Add more test cases
- Create additional assignments
- Improve existing code
- Share your solutions

## 📅 Progress Tracking

Update this section as you complete each assignment:

```
Week 1 (Jan 28 - Feb 3, 2026)
[✓] Day 1: Completed
[ ] Day 2: In Progress
[ ] Day 3: Not Started
[ ] Day 4: Not Started
[ ] Day 5: Not Started
```

---

**Happy Coding! 🎉**

Remember: Consistency is key. One assignment per day will make you a Map interface expert in just 5 days!

