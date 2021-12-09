package com.mycompany.app;

/**
 * Hello world app.
 */
public class App {

  private final String message = "Hi World!";

  public App() {}

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }

  private final String getMessage() {
    return message;
  }
}
