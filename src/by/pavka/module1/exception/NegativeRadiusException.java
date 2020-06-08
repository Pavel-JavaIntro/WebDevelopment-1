package by.pavka.module1.exception;

public class NegativeRadiusException extends Exception {
  private static final String MESSAGE = "Radius can't have a negative value";

  public NegativeRadiusException() {
    super(MESSAGE);
  }
}
