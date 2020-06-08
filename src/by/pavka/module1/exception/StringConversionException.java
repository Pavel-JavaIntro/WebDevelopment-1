package by.pavka.module1.exception;

public class StringConversionException extends Exception {
  private static final String MESSAGE = "This string can't be converted to a number";

  public StringConversionException() {
    super(MESSAGE);
  }

  public StringConversionException(Throwable cause) {
    super(MESSAGE, cause);
  }
}
