package dev.eltiempovuela.java11.jeps;

import java.util.ArrayList;
import java.util.List;

// JEP 286 - Local-Variable Type Inference
public class Jep286 {

  public List<String> copyNames(List<String> origin) {
    var destination = new ArrayList<String>();
    destination.addAll(origin);
    return destination;
  }

  public void execute() {
    var origin = List.of("Ismael", "Silvia", "Eric");
    var destination = copyNames(origin);

    destination.forEach(System.out::println);
  }
}
