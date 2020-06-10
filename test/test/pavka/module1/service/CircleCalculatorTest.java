package test.pavka.module1.service;

import by.pavka.module1.exception.NegativeRadiusException;
import by.pavka.module1.service.CircleCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class CircleCalculatorTest {
  private CircleCalculator circleCalculator = new CircleCalculator();

@Test
  public void testFindLengthAndArea() {
    double radius = 2;
    double[] expected = {Math.PI * 4, Math.PI * 4};
    double[] actual = null;
    try {
      actual = circleCalculator.findLengthAndArea(radius);
    } catch (NegativeRadiusException e) {
      fail();
    }
    assertEquals(actual, expected);
  }

  @Test (expectedExceptions = NegativeRadiusException.class)
  public void testFindLengthAndAreaException() throws NegativeRadiusException {
    double radius = -3;
    circleCalculator.findLengthAndArea(radius);
  }
}
