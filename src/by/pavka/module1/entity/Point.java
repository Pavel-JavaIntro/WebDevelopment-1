package by.pavka.module1.entity;

public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceFromZero() {
    return Math.hypot(x, y);
  }

  @Override
  public String toString() {
    return String.format("Point: x = %f, y = %f", x, y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Point)) return false;
    Point point = (Point) o;
    return point.x == x && point.y == y;
  }

  @Override
  public int hashCode() {
    return (int) (31 * x + 71 * y);
  }
}
