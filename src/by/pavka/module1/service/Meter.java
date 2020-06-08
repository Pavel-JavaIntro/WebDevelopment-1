/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек
 * находится ближе к началу координат. x y.
 */

package by.pavka.module1.service;

import by.pavka.module1.entity.Point;

public class Meter {

  public Point findCloserToZero(Point p1, Point p2) {
    if (p1.distanceFromZero() < p2.distanceFromZero()) {
      return p1;
    }
    return p2;
  }
}
