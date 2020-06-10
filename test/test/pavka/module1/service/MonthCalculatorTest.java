package test.pavka.module1.service;

import by.pavka.module1.exception.GregDateFormatException;
import by.pavka.module1.service.MonthCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class MonthCalculatorTest {

  @Test(expectedExceptions = GregDateFormatException.class,
          expectedExceptionsMessageRegExp = "This year is out of Gregorian Calendar range")
  public void test1FindDays() throws GregDateFormatException {
    MonthCalculator monthCalculator = new MonthCalculator(-1000);
  }

  @Test(expectedExceptions = GregDateFormatException.class,
          expectedExceptionsMessageRegExp = "Such a month number doesn't exist")
  public void test2FindDays() throws GregDateFormatException {
    MonthCalculator monthCalculator = new MonthCalculator(1600);
    monthCalculator.findDays(-13);
  }

  @Test
  public void test3FindDays() {
    MonthCalculator monthCalculator = null;
    int expected = 29;
    int actual = 0;
    try {
      monthCalculator = new MonthCalculator(1600);
      actual = monthCalculator.findDays(1);
    } catch (GregDateFormatException e) {
      fail();
    }
    assertEquals(actual, expected);
  }

  @Test
  public void test4FindDays() {
    MonthCalculator monthCalculator = null;
    int expected = 28;
    int actual = 0;
    try {
      monthCalculator = new MonthCalculator(1700);
      actual = monthCalculator.findDays(1);
    } catch (GregDateFormatException e) {
      fail();
    }
    assertEquals(actual, expected);
  }
}
