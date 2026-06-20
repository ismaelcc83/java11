# Java 11 Features

![Maven Build](https://github.com/ismaelcc83/java11/actions/workflows/maven.yml/badge.svg)

Practical exploration of some relevant features introduced in Java 10 and Java 11.

This repository contains small, focused and executable examples designed to understand relevant language and platform improvements such as local-variable type inference, HTTP Client, local-variable syntax for lambda parameters and single-file source-code programs.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## Features included

- **JEP 286** - Local-Variable Type Inference
- **JEP 314** - Additional Unicode Language-Tag Extensions
- **JEP 321** - HTTP Client
- **JEP 323** - Local-Variable Syntax for Lambda Parameters
- **JEP 330** - Launch Single-File Source-Code Programs

> Note: JEP 286 and JEP 314 were introduced in Java 10, but they are included in this Java 11 repository because Java 11 is the first long-term support version after Java 8.

## Project structure

```text
java11/
├── .github/
│   └── workflows/
│       └── maven.yml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── dev/
│   │           └── eltiempovuela/
│   │               └── java11/
│   │                   └── jeps/
│   │                       ├── App.java
│   │                       ├── ByteCodes.java
│   │                       ├── Jep286.java
│   │                       ├── Jep286_2.java
│   │                       ├── Jep314.java
│   │                       ├── Jep321.java
│   │                       ├── Jep323.java
│   │                       └── Jep330.java
│   └── test/
│       └── java/
│           └── dev/
│               └── eltiempovuela/
│                   └── java11/
│                       └── jeps/
│                           ├── ByteCodesTest.java
│                           ├── Jep286Test.java
│                           ├── Jep286_2Test.java
│                           ├── Jep314Test.java
│                           ├── Jep321Test.java
│                           ├── Jep323Test.java
│                           └── Jep330Test.java
├── .gitignore
├── LICENSE
├── pom.xml
└── README.md
```

## Requirements

- JDK 11
- Maven 3.8 or higher

## How to compile

```bash
mvn clean compile
```

## How to run

Run the `App` class from your IDE.

The application shows a simple console menu where each option executes one Java 11 example.

## How to test

```bash
mvn clean test
```

## How to verify

Run the full Maven verification lifecycle:

```bash
mvn clean verify
```

This command compiles the project, runs the tests and executes the configured quality checks.

## How to format

If Spotless is configured in the `pom.xml`, format the code with:

```bash
mvn spotless:apply
```

To check formatting without modifying files:

```bash
mvn spotless:check
```

## Continuous Integration

This project includes a GitHub Actions workflow that runs the Maven build automatically on pushes and pull requests.

The workflow executes:

```bash
mvn clean verify
```

## Purpose

The goal of this project is to explore and understand Java 10 and Java 11 features through small, simple and executable code examples.

The examples are intentionally simple, but the project also includes unit tests and build automation to keep the repository clean, maintainable and closer to a professional Java project structure.

## Notes

Java 11 is an important long-term support version and introduced relevant platform improvements for backend development.

The examples in this repository focus on:

- using `var` to reduce verbosity while keeping code readable;
- understanding where local-variable type inference is useful and where explicit types are clearer;
- using the standard HTTP Client introduced in Java 11;
- using local-variable syntax in lambda parameters;
- understanding how single-file source-code programs can be launched directly.
