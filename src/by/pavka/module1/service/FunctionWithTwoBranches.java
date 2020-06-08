/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Вычислить значение функции:
 */

package by.pavka.module1.service;

public class FunctionWithTwoBranches {

  public double claculateFunction(double x) {
    if (x < 3) {
      return reverseCube(x);
    }
    return square(x);
  }

  private double square(double x) {
    return 3 * x - Math.pow(x, 2) + 9;
  }

  private double reverseCube(double x) {
    return 1.0 / (Math.pow(x, 3) - 6);
  }
}
