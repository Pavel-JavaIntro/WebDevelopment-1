/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 *  значения функции
 */

package by.pavka.module1.service;

import java.util.Map;
import java.util.TreeMap;

public class TableFunction {

  public Map<Double, Double> functionToTable(double step, double start, double end) {
    Map<Double, Double> result = new TreeMap<>();
    double cursor = start;
    while (cursor < end) {
      result.put(cursor, Math.tan(cursor));
      cursor += step;
    }
    result.put(end, Math.tan(end));
    return result;
  }
}
