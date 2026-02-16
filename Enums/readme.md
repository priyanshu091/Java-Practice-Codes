# 🚦☕📅 Java Enums Practice Assignments

This repository contains **3 structured Java assignments** focused on mastering `enum` in Java — from basic usage to advanced real-world scenarios.

I know it’s not a big achievement yet… but I’m consistently trying to **learn, understand, and apply Java concepts properly** 💪  
These assignments helped me strengthen my core Java fundamentals.

---

## 📦 Package: `Enums`

This package contains:

1. 📅 Day Of Week Manager  
2. ☕ Coffee Shop Order System  
3. 🚦 Traffic Light System  

Each assignment increases in difficulty and covers deeper enum concepts.

---

# 📅 Assignment 1: Day Of Week Manager

## 🎯 Objective
Learn basic enum declaration, usage, and built-in methods.

## 🧠 What I Learned

- How to declare an `enum`
- Using:
  - `values()`
  - `ordinal()`
  - `name()`
  - `valueOf()`
- Comparing enums using `==`
- Creating custom static methods with enums
- Handling wrap-around logic using modulo
- Enum iteration using enhanced for loop

## 🔑 Key Concepts Practiced

```java
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY, SUNDAY
}
```

### ✔ Implemented Features
- Print all enum constants
- Check if a day is weekend
- Get next day (with Sunday → Monday wrap-around)
- Convert String → Enum
- Compare enums safely using `==`

---

# ☕ Assignment 2: Coffee Shop Order System

## 🎯 Objective
Learn enum with:
- Fields
- Constructors
- Getter methods
- Combining multiple enums

## 🧠 What I Learned

- Enums can have:
  - Instance variables
  - Constructors
  - Methods
- How to assign different values to each enum constant
- How to combine two enums in business logic
- Creating static utility methods
- Real-world modeling using enums

---

## 🏷 CoffeeSize Enum

Each size contains:
- 💰 Price
- 🥤 Volume (ml)

```java
SMALL(100, 250),
MEDIUM(150, 350),
LARGE(200, 450),
EXTRA_LARGE(250, 550)
```

### Features Implemented
- Getter methods (`getPrice()`, `getVolumeInMl()`)
- Formatted description method
- Price calculation using multiplier

---

## 🏷 CoffeeType Enum

Each type contains:
- 📈 Price Multiplier

```java
ESPRESSO(1.0),
LATTE(1.2),
CAPPUCCINO(1.3),
AMERICANO(1.1),
MOCHA(1.5)
```

### Features Implemented
- Multiplier-based pricing system
- Static method to calculate total order price
- Order display method
- Multiple example orders

---

# 🚦 Assignment 3: Traffic Light System

## 🎯 Objective
Learn advanced enum concepts including:
- Abstract methods in enums
- Constant-specific method implementation
- Switch statements with enums
- Complex enum interaction

---

## 🧠 What I Learned

- Enums can have abstract methods
- Each enum constant can override methods differently
- Enums can model real-world systems
- Using `switch` with enums
- Iterating over enum values for logic
- Creating business rules using enums

---

## 🚦 TrafficLight Enum

Each traffic light contains:
- ⏳ Duration (seconds)
- 🚨 Action (STOP / SLOW DOWN / GO)

```java
RED(60) {
    public String getAction() { return "STOP"; }
},
YELLOW(5) {
    public String getAction() { return "SLOW DOWN"; }
},
GREEN(45) {
    public String getAction() { return "GO"; }
};
```

### Features Implemented
- Abstract method `getAction()`
- Private constructor
- Getter for duration
- `getNextLight()` method using switch
- Total cycle time calculation

---

## 🚗 Vehicle Enum

Each vehicle contains:
- 🚑 Priority Level (1 = highest priority)

```java
CAR(3),
BIKE(4),
TRUCK(2),
BUS(2),
AMBULANCE(1)
```

### Features Implemented
- Vehicle priority system
- Rule-based pass logic
- Static method `canPass()` using switch

---

## 🏗 Concepts Covered Across All Assignments

✔ Basic enum declaration  
✔ Enum with fields and constructors  
✔ Enum with abstract methods  
✔ Constant-specific behavior  
✔ Switch-case with enums  
✔ Enum iteration  
✔ Business logic modeling  
✔ Real-world system simulation  

---

# 📈 Learning Outcome

After completing these assignments, I can confidently:

- Use enums beyond basic constants
- Design real-world systems using enums
- Apply OOP principles inside enums
- Write cleaner and safer code using enum features
- Avoid common enum mistakes (like using `new` or `.equals()`)

---


# 💡 Note

This project is part of my Java learning journey.  
I am continuously improving my problem-solving skills and strengthening core Java concepts.

More structured assignments coming soon 🚀
