/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.exception.StringConversionException;
import by.pavka.module1.service.DigitSquarer;

public class Task1Tester {

  public static void main(String[] args) {

    double number = 1.030;
    DigitSquarer digitSquarer = new DigitSquarer();
    int lastDigitSquare = digitSquarer.determineLastDigitSquare(number);

    ConsolePrinter.printLastDigitSquare(number, lastDigitSquare);

    int anotherNumber = 50;
    int anotherLastDigitSquare = digitSquarer.determineLastDigitSquare(anotherNumber);

    ConsolePrinter.printLastDigitSquare(anotherNumber, anotherLastDigitSquare);

    String badStringNumber = "a54.0";
    try {
      int moreLastDigitSquare = digitSquarer.determineLastDigitSquare(badStringNumber);
      ConsolePrinter.printLastDigitSquare(badStringNumber, moreLastDigitSquare);
    } catch (StringConversionException e) {
      e.printStackTrace();
    }

    String goodStringNumber = "54.0";
    try {
      int moreLastDigitSquare = digitSquarer.determineLastDigitSquare(goodStringNumber);
      ConsolePrinter.printLastDigitSquare(goodStringNumber, moreLastDigitSquare);
    } catch (StringConversionException e) {
      e.printStackTrace();
    }
  }
}
