# OOP, SOLID & System Design Practice Repository

This repository contains my hands-on practice and implementation of:

- Object-Oriented Programming (OOP)
- SOLID Principles
- Low-Level Design (LLD)
- System Design Concepts
- Design Patterns (GoF)

The goal of this repository is to strengthen software design thinking, improve code structure, and build interview-ready problem-solving skills.

---

## 📌 Objectives

- Write clean and maintainable code
- Apply OOP concepts in real-world scenarios
- Implement SOLID principles practically
- Practice system design problems
- Build scalable and extensible architectures

---

## 🧠 Topics Covered

### 1️⃣ OOP Concepts
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Composition vs Inheritance

### 2️⃣ SOLID Principles
- Single Responsibility Principle (SRP)
- Open Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

### 3️⃣ Design Patterns (GoF)
- Creational Patterns
- Structural Patterns
- Behavioral Patterns

### 4️⃣ Low-Level Design Projects
- OOP Fundamentals
- Parking Lot System
- Movie Ticket Booking System
- Unix File Search System
- Vending Machine System
- Elevator System
- Grocery Store System
- Tic-Tac-Toe Game
- Blackjack Game
- Shipping Locker System
- Automated Teller Machine (ATM) System
- Restaurant Management System

## 📂 Project Structure

Each folder contains:
- Problem statement
- Design explanation
- Code implementation
- Improvements & extensions

---

## 🛠 Tech Stack

- Java
- Object-Oriented Design
- UML (Class Diagrams)
- Clean Code Practices

---

## 🎯 Why This Repository?

This repository is created to:

- Strengthen core engineering fundamentals
- Prepare for backend/system design interviews
- Build structured thinking
- Improve code readability and maintainability

---

## 📈 Learning Approach

For every problem:

1. Understand the requirements
2. Identify entities and relationships
3. Apply OOP concepts
4. Refactor using SOLID principles
5. Improve extensibility using design patterns
6. Write clean and modular code

---

## 🚀 Future Enhancements

- Add UML diagrams
- Add unit tests
- Add Spring Boot implementations
- Add real-world production-level examples

---

## 🤝 Contribution

This is a personal learning repository. Suggestions and improvements are welcome.

---

## 📬 Author

Name: Amit Dewal
Focus: Backend Development | System Design | Clean Architecture

---
# system-design-java

# Eclipse IDE Productivity Shortcuts

This document lists useful Eclipse shortcuts that help developers
navigate and understand large Java projects efficiently.

------------------------------------------------------------------------

## 1. Open Type (Class / Interface)

**Shortcut**

Ctrl + Shift + T

**Purpose**

Opens any **Java type** in the workspace.

**Use Cases**

-   Open a class quickly\
-   Navigate to interfaces or enums\
-   Jump between different Java classes

**Example**

Search for:

UserService

Eclipse will show matching Java classes and allow you to open the
selected one.

------------------------------------------------------------------------

## 2. Open Resource (Any File)

**Shortcut**

Ctrl + Shift + R

**Purpose**

Opens **any file** in the project.

**Supported Files**

-   .java
-   .xml
-   .yml
-   .properties
-   .html
-   .js
-   .md
-   Any other project file

**Example**

Search for:

application.yml

Useful for quickly opening configuration files.

------------------------------------------------------------------------

## 3. Go To Declaration / Definition

**Shortcut**

F3

**Purpose**

Navigates directly to the **definition of a class, method, or
variable**.

**Example**

userService.getUserById(id);

Press **F3** on `getUserById()` to jump to its implementation.

------------------------------------------------------------------------

## 4. Find All References

**Shortcut**

Ctrl + Shift + G

**Purpose**

Finds **all places where a class, method, or variable is used**.

**Example**

Select:

getUserById()

Eclipse will show every file where this method is referenced.

------------------------------------------------------------------------

## 5. Call Hierarchy

**Shortcut**

Ctrl + Alt + H

**Purpose**

Displays the **method call chain** and helps understand execution flow.

**Example Flow**

Controller\
↓\
Service\
↓\
Repository

------------------------------------------------------------------------

## 6. Type Hierarchy

**Shortcut**

F4

**Purpose**

Shows **inheritance relationships** between classes and interfaces.

**Example**

Animal\
├── Dog\
├── Cat\
└── Bird

Useful when exploring **object-oriented design structures**.

------------------------------------------------------------------------

## 7. Class Outline

**Shortcut**

Ctrl + O

**Purpose**

Displays all **methods and fields inside the current class**.

Example methods:

createUser()\
updateUser()\
deleteUser()\
findUser()

Allows quick navigation within a class.

------------------------------------------------------------------------

## 8. Switch Between Open Files

**Shortcut**

Ctrl + E

**Purpose**

Switch quickly between **recently opened files**.

------------------------------------------------------------------------

## 9. Global Search

**Shortcut**

Ctrl + H

**Purpose**

Search across the entire project for:

-   Text
-   Classes
-   Methods
-   Annotations

------------------------------------------------------------------------

## 10. Safe Refactor Rename

**Shortcut**

Alt + Shift + R

**Purpose**

Rename a **variable, method, or class** safely across the project.\
All references are automatically updated.

------------------------------------------------------------------------

## Most Frequently Used Shortcuts

Ctrl + Shift + T → Open class\
F3 → Go to definition\
Ctrl + Shift + G → Find usages\
Ctrl + Alt + H → Call hierarchy

These shortcuts significantly improve productivity when navigating large
Java codebases.

