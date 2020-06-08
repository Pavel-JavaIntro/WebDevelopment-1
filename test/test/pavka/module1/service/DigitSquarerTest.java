package test.pavka.module1.service;

import by.pavka.module1.exception.StringConversionException;
import by.pavka.module1.service.DigitSquarer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DigitSquarerTest {
  private DigitSquarer digitSquarer = new DigitSquarer();

  @Test
  public void test1DetermineLastDigitSquare() {
    int number = 3;
    double expected = 9;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test
  public void test2DetermineLastDigitSquare() {
    double number = -3.000;
    double expected = 9;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test
  public void test3DetermineLastDigitSquare() {
    double number = -3.050;
    double expected = 5.0;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test
  public void test4DetermineLastDigitSquare() {
    double number = 3.07;
    double expected = 9.00;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test
  public void test5DetermineLastDigitSquare() throws StringConversionException {
    String number = "3.07";
    double expected = 9.00;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test
  public void test6DetermineLastDigitSquare() throws StringConversionException {
    String number = "-3.0740";
    double expected = 6.00;
    assertEquals(digitSquarer.determineLastDigitSquare(number), expected);
  }

  @Test (expectedExceptions = StringConversionException.class)
  public void test7DetermineLastDigitSquare() throws StringConversionException {
    String number = "bad string";
    digitSquarer.determineLastDigitSquare(number);
  }
}
