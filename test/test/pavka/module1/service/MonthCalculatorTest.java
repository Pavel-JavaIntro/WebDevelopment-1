package test.pavka.module1.service;

import by.pavka.module1.exception.GregDateFormatException;
import by.pavka.module1.service.MonthCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
  public void test3FindDays() throws GregDateFormatException {
    MonthCalculator monthCalculator = new MonthCalculator(1600);
    int expected = 29;
    assertEquals(monthCalculator.findDays(1), expected);
  }

  @Test
  public void test4FindDays() throws GregDateFormatException {
    MonthCalculator monthCalculator = new MonthCalculator(1700);
    int expected = 28;
    assertEquals(monthCalculator.findDays(1), expected);
  }
}
