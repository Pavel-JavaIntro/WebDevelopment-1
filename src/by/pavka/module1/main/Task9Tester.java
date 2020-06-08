/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.exception.NegativeRadiusException;
import by.pavka.module1.service.CircleCalculator;

public class Task9Tester {
  public static void main(String[] args) {
    CircleCalculator circleCalculator = new CircleCalculator();
    double radius = 5.5;
    double[] lengthAndArea;
    try {
      lengthAndArea = circleCalculator.findLengthAndArea(radius);
      ConsolePrinter.printLengthAndArea(radius, lengthAndArea[0], lengthAndArea[1]);
    } catch (NegativeRadiusException e) {
      e.printStackTrace();
    }

    radius = -1;
    try {
      lengthAndArea = circleCalculator.findLengthAndArea(radius);
      ConsolePrinter.printLengthAndArea(radius, lengthAndArea[0], lengthAndArea[1]);
    } catch (NegativeRadiusException e) {
      e.printStackTrace();
    }
  }
}
