package test.pavka.module1.entity;

import by.pavka.module1.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointTest {
  private Point point = new Point(-3, 4);

  @Test
  public void testDistanceFromZero() {
    double distance = point.distanceFromZero();
    double expected = 5.0;
    assertEquals(distance, expected);
  }
}
