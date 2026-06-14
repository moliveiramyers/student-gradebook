# Student Gradebook Application

## Overview

This project is a Student Gradebook application developed in Java. The program allows users to add students, record grades, calculate averages, determine pass/fail status, and save/load data from a file.

The application uses object-oriented programming principles and demonstrates the required Java concepts for this module.

---

## Features

* Add new students
* View all students
* Add grades to students
* Calculate student averages
* Display pass/fail status
* Save student data to a file
* Load student data from a file when the program starts

---

## Technologies Used

* Java
* Java Collections Framework (ArrayList)
* File I/O (FileReader, BufferedReader, FileWriter)
* Object-Oriented Programming

---

## Program Structure

### Models

**Student**

* Stores student information
* Stores grades
* Calculates average grades

### Services

**GradebookService**

* Manages student records
* Adds students
* Adds grades
* Exports and imports data

### Views

**MenuView**

* Displays menu options to the user

### Utilities

**FileManager**

* Saves data to a file
* Loads data from a file

---

## Requirements Demonstrated

### Variables

Variables are used throughout the project to store names, grades, menu choices, averages, and collections.

Example:

```java
String name;
double grade;
int choice;
```

### Expressions

Expressions are used when calculating averages.

Example:

```java
return total / grades.size();
```

### Conditionals

Conditionals are used to validate choices and determine pass/fail status.

Example:

```java
if(student.calculateAverage() >= 10)
```

### Loops

Loops are used for menu navigation and processing collections.

Example:

```java
while(choice != 0)
```

and

```java
for(Student student : students)
```

### Functions

Methods are used throughout the project.

Examples:

```java
addStudent()
addGrade()
showStudents()
calculateAverage()
```

### Classes

The project contains multiple classes:

* Student
* GradebookService
* MenuView
* FileManager
* Main

### Java Collection Framework

The application uses ArrayList to store students and grades.

Example:

```java
ArrayList<Student> students
ArrayList<Double> grades
```

### Read and Write to File

The application saves and loads student data using text files.

Examples:

```java
FileWriter
FileReader
BufferedReader
```

---

## How to Run

1. Open the project in Visual Studio Code.
2. Ensure Java JDK is installed.
3. Compile the project.
4. Run Main.java.
5. Use the menu options to manage students and grades.

---

## Future Improvements

* Delete students
* Edit grades
* Search for students
* Sort students by average
* Graphical User Interface (GUI)

---

## Author

Marjorie Myers

Java Module Project
