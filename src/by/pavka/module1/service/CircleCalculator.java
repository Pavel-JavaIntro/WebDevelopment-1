/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.pavka.module1.service;

import by.pavka.module1.exception.NegativeRadiusException;

public class CircleCalculator {

  public CircleCalculator() {}

  public double[] findLengthAndArea(double radius) throws NegativeRadiusException {
    if (radius < 0) {
      throw new NegativeRadiusException();
    }
    double length = findLength(radius);
    double area = findArea(radius);
    double[] result = {length, area};
    return result;
  }

  private double findArea(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

  private double findLength(double radius) {
    return 2 * Math.PI * radius;
  }
}
