package test.pavka.module1.service;

import by.pavka.module1.exception.NegativeRadiusException;
import by.pavka.module1.service.CircleCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CircleCalculatorTest {
  private CircleCalculator circleCalculator = new CircleCalculator();

  @Test
  public void testFindLengthAndArea() throws NegativeRadiusException {
    double radius = 2;
    double[] expected = {Math.PI * 4, Math.PI * 4};
    assertEquals(circleCalculator.findLengthAndArea(radius), expected);
  }

  @Test (expectedExceptions = NegativeRadiusException.class)
  public void testFindLengthAndAreaException() throws NegativeRadiusException {
    double radius = -3;
    circleCalculator.findLengthAndArea(radius);
  }
}
