package test.pavka.module1.validator;

import by.pavka.module1.validator.CalendarValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CalendarValidatorTest {
  private CalendarValidator calendarValidator = new CalendarValidator();

  @Test
  public void test1IsValidYear() {
    int year = 2020;
    boolean valid = calendarValidator.isValidYear(year);
    assertTrue(valid);
  }

  @Test
  public void test2IsValidYear() {
    int year = 1451;
    boolean valid = calendarValidator.isValidYear(year);
    assertFalse(valid);
  }

  @Test
  public void test1IsValidMonth() {
    int month = 0;
    boolean valid = calendarValidator.isValidMonth(month);
    assertTrue(valid);
  }

  @Test
  public void test2IsValidMonth() {
    int month = 12;
    boolean valid = calendarValidator.isValidMonth(month);
    assertFalse(valid);
  }

  @Test
  public void test3IsValidMonth() {
    int month = -2;
    boolean valid = calendarValidator.isValidMonth(month);
    assertFalse(valid);
  }
}
