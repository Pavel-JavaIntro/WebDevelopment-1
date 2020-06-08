
/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй -
 * соответствующие значения функции
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.service.TableFunction;

import java.util.Map;

public class Task10Tester {
  public static void main(String[] args) {
    Map<Double, Double> table = (new TableFunction()).functionToTable(0.1, 0.1, 3.4);
    ConsolePrinter.printTable(table);
  }
}
