package dev.eltiempovuela.java11.jeps;

// JEP 330 - Launch Single-File Source-Code Programs
public class Jep330 {

  public static void execute() {
    System.out.println("JEP 330 - Launch Single-File Source-Code Programs");
    System.out.println("=================================================");
    System.out.println();

    System.out.println("Java 11 allows running a .java file directly:");
    System.out.println();
    System.out.println("java HelloWorld.java");
    System.out.println();

    System.out.println("Before Java 11:");
    System.out.println("javac HelloWorld.java");
    System.out.println("java HelloWorld");
  }
}
