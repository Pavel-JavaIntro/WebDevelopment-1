
/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.service.EvenCounter;

public class Task4Tester {
  public static void main(String[] args) {
    EvenCounter evenCounter = new EvenCounter();
    int[] numbers = {5, 7, 0, 2};
    boolean atLeastTwoEvens = evenCounter.haveAtLeastTwoEvens(numbers);
    ConsolePrinter.printEvenNumbersCriteria(atLeastTwoEvens, numbers);
  }
}
