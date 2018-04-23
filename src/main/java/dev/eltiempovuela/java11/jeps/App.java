package dev.eltiempovuela.java11.jeps;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int option;

    do {
      printMenu();

      System.out.print("Choose an option: ");
      option = readOption(scanner);

      System.out.println();

      switch (option) {
        case 1:
          ByteCodes.execute();
          break;
        case 2:
          new Jep286().execute();
          break;
        case 3:
          Jep286_2.execute();
          break;
        case 4:
          Jep314.execute();
          break;
        case 5:
          Jep321.execute();
          break;
        case 6:
          new Jep323().execute();
          break;
        case 7:
          Jep330.execute();
          break;
        case 0:
          System.out.println("Exiting application...");
          break;
        default:
          System.out.println("Invalid option. Please choose a valid JEP.");
          break;
      }

      System.out.println();

    } while (option != 0);

    scanner.close();
  }

  private static void printMenu() {
    System.out.println("======================================");
    System.out.println(" Java 10 and Java 11 JEP Exploration");
    System.out.println("======================================");
    System.out.println("1. Bytecode generation for enhanced for loop");
    System.out.println("2. JEP 286 - Local-Variable Type Inference");
    System.out.println("3. JEP 286 - Type inference example");
    System.out.println("4. JEP 314 - Additional Unicode Language-Tag Extensions");
    System.out.println("5. JEP 321 - HTTP Client");
    System.out.println("6. JEP 323 - var in Lambda Parameters");
    System.out.println("7. JEP 330 - Launch Single-File Source-Code Programs");
    System.out.println("0. Exit");
    System.out.println("======================================");
  }

  private static int readOption(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Please enter a number: ");
      scanner.next();
    }

    return scanner.nextInt();
  }
}
