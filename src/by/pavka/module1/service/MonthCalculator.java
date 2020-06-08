/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определяет все високосные года
 */

package by.pavka.module1.service;

import by.pavka.module1.entity.Month;
import by.pavka.module1.exception.GregDateFormatException;
import by.pavka.module1.validator.CalendarValidator;

public class MonthCalculator {
  private static final int LEAP_CYCLE = 4;
  private static final int CENTURY = 100;
  private static final int FOUR_CENTURIES = 400;

  private static final String WRONG_YEAR = "This year is out of Gregorian Calendar range";
  private static final String WRONG_MONTH = "Such a month number doesn't exist";

  private CalendarValidator calendarValidator = new CalendarValidator();
  private int year;
  private boolean leap;

  public MonthCalculator(int year) throws GregDateFormatException {
    if (!calendarValidator.isValidYear(year)) {
      throw new GregDateFormatException(WRONG_YEAR);
    }

    this.year = year;
    checkLeapYear();
  }

  public int getYear() {
    return year;
  }

  public boolean isLeap() {
    return leap;
  }

  public int findDays(int monthNumber) throws GregDateFormatException {
    if (!calendarValidator.isValidMonth(monthNumber)) {
      throw new GregDateFormatException(WRONG_MONTH);
    }

    Month month = Month.values()[monthNumber];
    int days = month.getDays();

    if (leap && (month == Month.FEB)) {
      days++;
    }
    return days;
  }

  private void checkLeapYear() {
    if (year % LEAP_CYCLE == 0) {
      if (year % CENTURY != 0) {
        leap = true;
        return;
      }
      if (year % FOUR_CENTURIES == 0) {
        leap = true;
      }
    }
  }
}
