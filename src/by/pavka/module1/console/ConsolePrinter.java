package by.pavka.module1.console;

import by.pavka.module1.entity.Point;
import by.pavka.module1.service.MonthCalculator;

import java.util.Arrays;
import java.util.Map;

public class ConsolePrinter {

  public ConsolePrinter() {}

  public static void printLastDigitSquare(double initialNumber, int lastDigitSquare) {
    System.out.printf(
        "Square of the last significant digit of %f is %d%n", initialNumber, lastDigitSquare);
  }

  public static void printLastDigitSquare(String initialNumber, int lastDigitSquare) {
    System.out.printf(
            "Square of the last significant digit of %s is %d%n", initialNumber, lastDigitSquare);
  }

  public static void printNumberOfDays(MonthCalculator monthCalculator, int month, int days) {
    System.out.printf("Year %d, is leap = %b, number of days in month %d is %d%n",
            monthCalculator.getYear(), monthCalculator.isLeap(), month, days);
  }

  public static void printCircledArea(double exArea, double inArea) {
    System.out.printf("The outer square is %.2f, the inner square is %.2f, the ratio is %.2f",
            exArea, inArea, exArea / inArea);
  }

  public static void printEvenNumbersCriteria(boolean atLeastTwoEvens, int... args) {
    System.out.println("Among " + Arrays.toString(args) + " at least two even numbers = " + atLeastTwoEvens);
  }

  public static void printPerfection(int num, boolean isPerfect) {
    System.out.printf("This number %d is perfect = %b%n", num, isPerfect);
  }

  public static void printTime(int seconds, int[] result) {
    System.out.printf("%d seconds are equal to %d hours, %d minutes, %d seconds%n", seconds,
            result[0], result[1], result[2]);
  }

  public static void printPoints(Point p1, Point p2, Point closerPoint) {
    System.out.printf("Among %s and %s closer to zero is %s%n", p1, p2, closerPoint);
  }

  public static void printFunction(double x, double y) {
    System.out.printf("For x = %.3f y = %.3f", x, y);
  }

  public static void printLengthAndArea(double radius, double len, double area) {
    System.out.printf("Radius = %f, circle length = %f, and area = %f%n", radius, len, area);
  }

  public static void printTable(Map<Double, Double> table) {
    for (Map.Entry<Double, Double> entry : table.entrySet()) {
      System.out.printf("x = %.3f, y = %.3f%n", entry.getKey(), entry.getValue());
    }
  }
}
