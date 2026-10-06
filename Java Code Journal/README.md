# Java Code Journal

Java OOP learning exercises as a 2nd-year BSIT student at St. John Paul II College of Davao.

## Overview

This folder contains 10 Java programs focused on Object-Oriented Programming concepts, particularly inheritance and polymorphism. The exercises are organized into themed categories — movies, sports, technology, and brands — and represent learning and practice work, not professional code.

## What's Inside

| File | Description |
|------|-------------|
| `Activity1.java` | Creates a `Student` object and calls `talent()` and `who()` methods. |
| `Antoque.java` | Student profile class with fields (name, course, grades), a parameterized constructor, and methods (`Self()`, `Likes()`, `Motto()`). |
| `November.java` | Main class that instantiates `Antoque` and displays all fields and method outputs. |
| `November1.java` | Main class that creates an `Antoque1` object and calls `evaluateGrade()` and `introduceself()` methods. |
| `Movies1.java` | Inheritance demo — `genres` base class with 10 subclasses (Action, Comedy, Horror, Romance, Scifi, Fantasy, Mystery, Thriller, Adventure, Drama). Each overrides `plot()`. |
| `Movies2.java` | Inheritance demo — `directors` base class with 16 subclasses (Spielberg, Cameron, Nolan, Tarantino, Scorsese, Hitchcock, Kubrick, Jackson, Burton, Scott, Coppola, Miyazaki, Lucas, DelToro, Fincher). Each overrides `famousworks()`. |
| `Sports1.java` | Inheritance demo — `games` base class with 8 subclasses (Basketball, Soccer, Badminton, Boxing, Volleyball, Tennis, Baseball, Pickleball). Each overrides `rules()`. |
| `Sportss2.java` | Inheritance demo — `Athletes` base class with 12 subclasses (Bolt, Phelps, Messi, Ronaldo, Serena, Jordan, Lebron, Biles, Federer, Pele, Ali, Woods). Each overrides `record()`. |
| `Tech1.java` | Inheritance demo — `devices` base class with 10 subclasses (Smartphone, Laptop, Dekstop, Tablet, Printer, Scanner, Camera, Router, Projector, Smartwatch). Each overrides `features()`. |
| `Tech2.java` | Inheritance demo — `brands` base class with 16 subclasses (Apple, Samsung, Sony, Nike, Adidas, Tesla, Toyota, Cocacola, Pepsi, JBL, Microsoft, Dell, HP, Canon, Logitech). Each overrides `flagship()`. |

## Technologies Used

![Java](https://img.shields.io/badge/-Java-%23A78BFA?style=flat-square&logo=java&logoColor=white)

Java SE (IDE and version [NEEDS VERIFICATION])

## Screenshots

[ADD SCREENSHOTS]

## How It Works

Each themed program follows the same OOP pattern:

1. A **base class** defines a method (e.g., `plot()`, `rules()`, `features()`, `flagship()`)
2. **Subclasses** extend the base class and override that method with specific content
3. The **main class** instantiates each subclass and calls the overridden method

This demonstrates **inheritance** (subclasses use `extends`) and **polymorphism** (method overriding — different implementations of the same method name).

### Example: Movies1.java

```
Base class: genres
  ├── Action        → plot() prints "Hero saves all"
  ├── Comedy        → plot() prints "Funny surprise"
  ├── Horror        → plot() prints "Monster returns"
  ├── Romance       → plot() prints "lovers reunite"
  ├── Scifi         → plot() prints "AI takes over"
  ├── Fantasy       → plot() prints "Magic wins"
  ├── Mystery       → plot() prints "Killer Revealed"
  ├── Thriller      → plot() prints "Secret Exposed"
  ├── Adventure     → plot() prints "Treasure found"
  └── Drama         → plot() prints "Truth changes lives"
```

The main method creates one object of each subclass and calls `plot()` on each.

[NEEDS VERIFICATION: `Activity1.java` references a `Student` class not in this folder. `November1.java` references an `Antoque1` class not in this folder.]

## How to Run

1. Ensure Java JDK is installed
2. Compile: `javac FileName.java`
3. Run: `java FileName`

> Note: Some files depend on classes in other files (e.g., `November.java` uses `Antoque.java`). Compile related files together.

## What I Learned

- **Classes and Objects** — defining classes with fields and methods, creating object instances
- **Constructors** — initializing objects with parameterized constructors using `this`
- **Inheritance** — using `extends` to create specialized subclasses from a base class
- **Polymorphism** — method overriding, where each subclass provides its own implementation
- **Encapsulation** — class fields and methods grouped within class boundaries
- **Packages** — organizing code with `package` declarations
- **Method Calls** — invoking methods on objects and chaining calls

## Future Improvements

[NEEDS VERIFICATION]

## Author

Princess Jade B. Antoque  
2nd-Year BSIT Student  
St. John Paul II College of Davao  
[GitHub](https://github.com/princessjadeantoque-cloud/cess)
