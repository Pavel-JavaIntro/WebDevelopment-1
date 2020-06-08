/*
 * author Pavel Kassitchev
 * This class solves the task described below
 *
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту
 */

package by.pavka.module1.service;

public class TimeConverter {

  public static final int MINS_IN_HOUR = 60;
  public static final int SECS_IN_MIN = 60;

  public int[] findHoursMinutesSeconds(int secs) {
    int hours = secs / (SECS_IN_MIN * MINS_IN_HOUR);
    secs %= (SECS_IN_MIN * MINS_IN_HOUR);
    int minutes = secs / SECS_IN_MIN;
    secs %= SECS_IN_MIN;
    int[] result = {hours, minutes, secs};
    return result;
  }
}
