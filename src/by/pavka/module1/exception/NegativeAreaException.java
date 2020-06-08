package by.pavka.module1.exception;

public class NegativeAreaException extends Exception {
  private static final String MESSAGE = "Area can't have a negative value";

  public NegativeAreaException() {
    super(MESSAGE);
  }
}
