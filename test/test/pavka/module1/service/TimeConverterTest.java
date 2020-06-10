package test.pavka.module1.service;

import by.pavka.module1.service.TimeConverter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeConverterTest {
  private TimeConverter timeConverter = new TimeConverter();

  @Test
  public void test1FindHoursMinutesSeconds() {
    int[] expected = {1, 1, 1};
    int[] actual = timeConverter.findHoursMinutesSeconds(3661);
    assertEquals(actual, expected);
  }

  @Test
  public void test2FindHoursMinutesSeconds() {
    int[] expected = {-1, -1, -1};
    int[] actual = timeConverter.findHoursMinutesSeconds(-3661);
    assertEquals(actual, expected);
  }
}
