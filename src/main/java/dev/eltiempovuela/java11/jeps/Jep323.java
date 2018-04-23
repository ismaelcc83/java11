package dev.eltiempovuela.java11.jeps;

import java.util.List;
import java.util.stream.Collectors;

// JEP 323 - Local-Variable Syntax for Lambda Parameters
public class Jep323 {

  public List<String> toUpperCase(List<String> names) {
    return names.stream().map((var name) -> name.toUpperCase()).collect(Collectors.toList());
  }

  public void execute() {
    System.out.println("JEP 323 - var in Lambda Parameters");
    System.out.println("==================================");

    List<String> names = List.of("ismael", "silvia", "eric");

    toUpperCase(names).forEach(System.out::println);
  }
}
