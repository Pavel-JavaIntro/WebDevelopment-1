package test.pavka.module1.service;

import by.pavka.module1.exception.NegativeAreaException;
import by.pavka.module1.service.SquareCircleConverter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class SquareCircleConverterTest {
  private SquareCircleConverter squareCircleConverter = new SquareCircleConverter();

  @Test
  public void test1GetEncircleArea() {
    double exArea = 4;
    double expected = 2.0;
    double actual = 0;
    try {
      actual = squareCircleConverter.getEncircleArea(exArea);
    } catch (NegativeAreaException e) {
      fail();
    }
    assertEquals(actual, expected, 0.0001);
  }

  @Test (expectedExceptions = NegativeAreaException.class)
  public void test2GetEncircleArea() throws NegativeAreaException {
    double exArea = -1;
    squareCircleConverter.getEncircleArea(exArea);
  }
}
