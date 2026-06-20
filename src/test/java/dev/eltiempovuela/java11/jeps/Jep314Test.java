package dev.eltiempovuela.java11.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep314Test {

  private final PrintStream originalOut = System.out;
  private ByteArrayOutputStream outputStream;

  @BeforeEach
  void setUp() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void shouldPrintVmArgumentsExample() {
    Jep314.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 314 - Example"));
    assertTrue(output.contains("This example can be tested with VM arguments."));
    assertTrue(output.contains("-Xms512M -Xmx512M -Duser.language=es -Duser.country=ES"));
  }
}
