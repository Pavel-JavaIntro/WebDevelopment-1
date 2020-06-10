package test.pavka.module1.service;

import by.pavka.module1.exception.StringConversionException;
import by.pavka.module1.service.DigitSquarer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class DigitSquarerTest {
  private DigitSquarer digitSquarer = new DigitSquarer();

  @Test
  public void test1DetermineLastDigitSquare() {
    int number = 3;
    double expected = 9;
    double actual = digitSquarer.determineLastDigitSquare(number);
    assertEquals(actual, expected);
  }

  @Test
  public void test2DetermineLastDigitSquare() {
    double number = -3.000;
    double expected = 9;
    double actual = digitSquarer.determineLastDigitSquare(number);
    assertEquals(actual, expected);
  }

  @Test
  public void test3DetermineLastDigitSquare() {
    double number = -3.050;
    double expected = 5.0;
    double actual = digitSquarer.determineLastDigitSquare(number);
    assertEquals(actual, expected);
  }

  @Test
  public void test4DetermineLastDigitSquare() {
    double number = 3.07;
    double expected = 9.00;
    double actual = digitSquarer.determineLastDigitSquare(number);
    assertEquals(actual, expected);
  }

  @Test
  public void test5DetermineLastDigitSquare() {
    String number = "3.07";
    double expected = 9.00;
    double actual = 0;
    try {
      actual = digitSquarer.determineLastDigitSquare(number);
    } catch (StringConversionException e) {
      fail();
    }
    assertEquals(actual, expected);
  }

  @Test
  public void test6DetermineLastDigitSquare() {
    String number = "-3.0740";
    double expected = 6.00;
    double actual = 0;
    try {
      actual = digitSquarer.determineLastDigitSquare(number);
    } catch (StringConversionException e) {
      fail();
    }
    assertEquals(actual, expected);
  }

  @Test(expectedExceptions = StringConversionException.class)
  public void test7DetermineLastDigitSquare() throws StringConversionException {
    String number = "bad string";
    digitSquarer.determineLastDigitSquare(number);
  }
}
