/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.pavka.module1.service;

import by.pavka.module1.exception.NegativeAreaException;
import by.pavka.module1.validator.NonNegativeAreaValidator;

public class SquareCircleConverter {
  private NonNegativeAreaValidator nonNegativeAreaValidator;

  public SquareCircleConverter() {
    nonNegativeAreaValidator = new NonNegativeAreaValidator();
  }

  public double getEncircleArea(double exCircleArea) throws NegativeAreaException {
    if(nonNegativeAreaValidator.isAreaNegative(exCircleArea)) {
      throw new NegativeAreaException();
    }
    double exCircleSide = Math.sqrt(exCircleArea);
    double encircleSide = exCircleSide / Math.sqrt(2);

    return Math.pow(encircleSide, 2);
  }
}
