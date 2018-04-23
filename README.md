# Java 10 and Java 11 JEPs

Practical exploration of some relevant JEPs introduced in Java 10 and Java 11.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## JEPs included

- **JEP 286** - Local-Variable Type Inference
- **JEP 314** - Additional Unicode Language-Tag Extensions
- **JEP 321** - HTTP Client
- **JEP 323** - Local-Variable Syntax for Lambda Parameters
- **JEP 330** - Launch Single-File Source-Code Programs

## Project structure

```text
src
└── main
    └── java
        └── dev
            └── eltiempovuela
                └── java11
                    └── jeps
                        ├── App.java
                        ├── ByteCodes.java
                        ├── Jep286.java
                        ├── Jep286_2.java
                        ├── Jep314.java
                        ├── Jep321.java
                        ├── Jep323.java
                        └── Jep330.java
```

## Requirements

- JDK 11
- Maven 3.8 or higher

## How to compile

```bash
  mvn clean compile
```

## How to run

Run the `App` class.

If the Maven Exec Plugin is configured, you can also run:

```bash
  mvn exec:java
```

The application shows a simple menu where each option executes one JEP example.

## Purpose

The goal of this project is to test and understand Java features through small and simple code examples.
Important note

This project includes JEPs from both Java 10 and Java 11.

JEP 286 and JEP 314 belong to Java 10, while JEP 321, JEP 323 and JEP 330 belong to Java 11.
