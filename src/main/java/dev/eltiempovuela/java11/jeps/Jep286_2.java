package dev.eltiempovuela.java11.jeps;

// JEP 286 - Local-Variable Type Inference
public class Jep286_2 {

  public static void execute() {
    var character = 'a';
    var number = 1;

    number = character;

    System.out.println("Character: " + character);
    System.out.println("Number after assignment: " + number);
  }
}
