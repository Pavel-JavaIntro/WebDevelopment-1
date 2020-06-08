/*
 * author Pavel Kassitchev
 * This class tests a solution for the task described below
 *
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту
 */

package by.pavka.module1.main;

import by.pavka.module1.console.ConsolePrinter;
import by.pavka.module1.service.TimeConverter;

public class Task6Tester {
  public static void main(String[] args) {
    TimeConverter timeConverter = new TimeConverter();
    int seconds = 3661;
    int[] result = timeConverter.findHoursMinutesSeconds(seconds);
    ConsolePrinter.printTime(seconds, result);
  }
}
