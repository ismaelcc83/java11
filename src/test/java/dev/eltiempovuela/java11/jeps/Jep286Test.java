package dev.eltiempovuela.java11.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Jep286Test {

  private final Jep286 jep286 = new Jep286();

  @Test
  void shouldCopyNames() {
    List<String> origin = List.of("Ismael", "Silvia", "Eric");

    List<String> result = jep286.copyNames(origin);

    assertEquals(origin, result);
  }
}
