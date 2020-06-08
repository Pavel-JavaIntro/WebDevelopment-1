/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
 * числу).
 */

package by.pavka.module1.service;

public class PerfectionChecker {

  public boolean isPerfect(int number) {
    if (number < 1) {
      return false;
    }
    return number == sumOfDividers(number);
  }

  private int sumOfDividers(int number) {
    int sum = 0;

    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }

    return sum;
  }
}
