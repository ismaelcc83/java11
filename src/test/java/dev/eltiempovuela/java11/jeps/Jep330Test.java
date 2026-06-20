package dev.eltiempovuela.java11.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep330Test {

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
  void shouldPrintSingleFileSourceCodeProgramExample() {
    Jep330.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 330 - Launch Single-File Source-Code Programs"));
    assertTrue(output.contains("Java 11 allows running a .java file directly:"));
    assertTrue(output.contains("java HelloWorld.java"));
    assertTrue(output.contains("javac HelloWorld.java"));
    assertTrue(output.contains("java HelloWorld"));
  }
}
