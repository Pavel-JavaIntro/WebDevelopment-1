/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.exception.GregDateFormatException;
import by.pavka.module1.service.MonthCalculator;

public class Task2Tester {
  public static void main(String[] args) {
    MonthCalculator monthCalculator = null;
    try {
      monthCalculator = new MonthCalculator(1350);
      int monthNumber = 1;
      int days = monthCalculator.findDays(monthNumber);
      ConsolePrinter.printNumberOfDays(monthCalculator, monthNumber, days);
    } catch (GregDateFormatException e) {
      e.printStackTrace();
    }

    try {
      monthCalculator = new MonthCalculator(1750);
      int monthNumber = 1;
      int days = monthCalculator.findDays(monthNumber);
      ConsolePrinter.printNumberOfDays(monthCalculator, monthNumber, days);
    } catch (GregDateFormatException e) {
      e.printStackTrace();
    }

    try {
      monthCalculator = new MonthCalculator(2000);
      int monthNumber = 1;
      int days = monthCalculator.findDays(monthNumber);
      ConsolePrinter.printNumberOfDays(monthCalculator, monthNumber, days);
    } catch (GregDateFormatException e) {
      e.printStackTrace();
    }
  }
}
