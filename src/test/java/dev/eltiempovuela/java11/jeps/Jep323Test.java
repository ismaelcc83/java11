package dev.eltiempovuela.java11.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Jep323Test {

  private final Jep323 jep323 = new Jep323();

  @Test
  void shouldConvertNamesToUpperCase() {
    List<String> names = List.of("ismael", "silvia", "eric");

    List<String> result = jep323.toUpperCase(names);

    assertEquals(List.of("ISMAEL", "SILVIA", "ERIC"), result);
  }
}
