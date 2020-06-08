/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата
 */

package by.pavka.module1.service;

import by.pavka.module1.exception.StringConversionException;

public class DigitSquarer {

  public DigitSquarer() {}

  public int determineLastDigitSquare(double number) {
    int lastDigit = findLastDigit(number);
    return getSquare(lastDigit);
  }

  public int determineLastDigitSquare(String number) throws StringConversionException {
    int lastDigit = findLastDigit(number);
    return getSquare(lastDigit);
  }

  // This method returns the last SIGNIFICANT digit of a number
  private int findLastDigit(double number) {
    String stringPresentation = String.valueOf(number);
    int stringLength = stringPresentation.length();
    String lastFigure;

    if (number != (int) number) {
      lastFigure = stringPresentation.substring(stringLength - 1);
    } else {
      lastFigure = stringPresentation.substring(stringLength - 3, stringLength - 2);
    }

    return Integer.parseInt(lastFigure);
  }

  // The same as above but with a String as an argument. It overloads and then invokes the above
  // method
  private int findLastDigit(String number) throws StringConversionException {
    double num;
    try {
      num = Double.parseDouble(number);
    }
    catch (NumberFormatException e) {
      throw new StringConversionException(e);
    }
    return findLastDigit(num);
  }

  private int getSquare(int lastDigit) {
    switch (lastDigit) {
      case 0:
        return 0;
      case 1:
      case 9:
        // both 1 and 9 return 1
        return 1;
      case 2:
      case 8:
        // both 2 and 8 return 4
        return 4;
      case 3:
      case 7:
        // both 3 and 7 return 9
        return 9;
      case 4:
      case 6:
        // both 4 and 6 return 6
        return 6;
      case 5:
        return 5;
      default:
        return -1;
    }
  }
}
