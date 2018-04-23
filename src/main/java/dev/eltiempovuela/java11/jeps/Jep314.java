package dev.eltiempovuela.java11.jeps;

// JEP 314 - Example
public class Jep314 {

  public static void execute() {
    System.out.println("JEP 314 - Example");
    System.out.println("=================");
    System.out.println();

    System.out.println("This example can be tested with VM arguments.");
    System.out.println("Example:");
    System.out.println("-Xms512M -Xmx512M -Duser.language=es -Duser.country=ES");
  }
}
