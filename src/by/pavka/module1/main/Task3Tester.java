/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.exception.NegativeAreaException;
import by.pavka.module1.service.SquareCircleConverter;

public class Task3Tester {
  public static void main(String[] args) {
    SquareCircleConverter squareCircleConverter = new SquareCircleConverter();
    double exArea = 24.3;

    try {
      double inArea = squareCircleConverter.getEncircleArea(exArea);
      ConsolePrinter.printCircledArea(exArea, inArea);
    } catch (NegativeAreaException e) {
      e.printStackTrace();
    }
  }
}
