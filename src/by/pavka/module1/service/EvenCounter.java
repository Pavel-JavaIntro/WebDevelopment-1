/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Составить программу, печатающую значение true, если указанное высказывание является истинным,
 * и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных
 */

package by.pavka.module1.service;

public class EvenCounter {

  public boolean haveAtLeastTwoEvens(int... args) {
    int counter = 0;

    for (int i = 0; i < args.length; i++) {
      if (args[i] % 2 == 0) {
        counter++;
        if (counter > 1) {
          return true;
        }
      }
    }
    return false;
  }
}
