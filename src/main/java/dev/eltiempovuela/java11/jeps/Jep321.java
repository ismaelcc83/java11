package dev.eltiempovuela.java11.jeps;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

// JEP 321 - HTTP Client
public class Jep321 {

  public static void execute() {
    System.out.println("JEP 321 - HTTP Client");
    System.out.println("=====================");

    try {
      HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();

      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://example.com"))
              .timeout(Duration.ofSeconds(10))
              .GET()
              .build();

      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println("Status code: " + response.statusCode());
      System.out.println("Body length: " + response.body().length());

    } catch (IOException exception) {
      System.out.println("I/O error executing HTTP request: " + exception.getMessage());
    } catch (InterruptedException exception) {
      Thread.currentThread().interrupt();
      System.out.println("HTTP request interrupted");
    }
  }
}
