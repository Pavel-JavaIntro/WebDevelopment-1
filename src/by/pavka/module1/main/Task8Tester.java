
/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Вычислить значение функции
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.service.FunctionWithTwoBranches;

public class Task8Tester {
  public static void main(String[] args){
    FunctionWithTwoBranches function = new FunctionWithTwoBranches();
    double x = 3;
    double y = function.claculateFunction(x);
    ConsolePrinter.printFunction(x, y);
  }

}
