/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек
 * находится ближе к началу координат. x y.
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.entity.Point;
import by.pavka.module1.service.Meter;

public class Task7Tester {
  public static void main(String[] args) {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(3,3);
    Point closerPoint = (new Meter()).findCloserToZero(p1, p2);
    ConsolePrinter.printPoints(p1, p2, closerPoint);
  }
}
