package test.pavka.module1.service;

import by.pavka.module1.entity.Point;
import by.pavka.module1.service.Meter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class MeterTest {
  private Meter meter = new Meter();

  @Test
  public void test1FindCloserToZero() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1.0, 1.0);
    Point expected = new Point(1, 1.0);
    assertEquals(meter.findCloserToZero(p1, p2), expected);
  }

  @Test
  public void test2FindCloserToZero() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1.0, 1.0);
    Point expected = p1;
    assertEquals(meter.findCloserToZero(p1, p2), expected);
  }

  @Test
  public void test3FindCloserToZero() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1.0, 1.0);
    Point expected = p2;
    assertEquals(meter.findCloserToZero(p1, p2), expected);
  }

  @Test
  public void test4FindCloserToZero() {
    Point p1 = new Point(2, 1);
    Point p2 = new Point(1.0, 1.0);
    Point expected = p2;
    assertEquals(meter.findCloserToZero(p1, p2), expected);
  }

  @Test
  public void test5FindCloserToZero() {
    Point p1 = new Point(2, 1);
    Point p2 = new Point(1.0, 1.0);
    Point expected = p1;
    assertNotEquals(meter.findCloserToZero(p1, p2), expected);
  }
}
