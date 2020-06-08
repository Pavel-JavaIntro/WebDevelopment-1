package by.pavka.module1.validator;

import java.time.Month;

public class CalendarValidator {
  private static final int GREGORIAN_CALENDAR_BEGINNING = 1582;

  public boolean isValidYear(int year) {
    return year >= GREGORIAN_CALENDAR_BEGINNING;
  }

  public boolean isValidMonth(int month) {
    return (month < Month.values().length && month >= 0);
  }
}
