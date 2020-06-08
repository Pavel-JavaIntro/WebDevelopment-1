/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным
 * (сумма делителей равна самому числу).
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.service.PerfectionChecker;

public class Task5Tester {
  public static void main(String[] args) {
    PerfectionChecker perfectionChecker = new PerfectionChecker();
    int number = 6;
    boolean isPerfect = perfectionChecker.isPerfect(number);
    ConsolePrinter.printPerfection(number, isPerfect);
  }
}
