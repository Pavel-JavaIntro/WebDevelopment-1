package test.pavka.module1.validator;

import by.pavka.module1.validator.NonNegativeAreaValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NonNegativeAreaValidatorTest {
  private NonNegativeAreaValidator validator = new NonNegativeAreaValidator();

  @Test
  public void test1IsAreaNegative() {
    double area = -1;
    assertTrue(validator.isAreaNegative(area));
  }

  @Test
  public void test2IsAreaNegative() {
    double area = 0.0;
    assertFalse(validator.isAreaNegative(area));
  }

  @Test
  public void test3IsAreaNegative() {
    double area = 10.0;
    assertFalse(validator.isAreaNegative(area));
  }

  @Test
  public void test4IsAreaNegative() {
    double area = Double.POSITIVE_INFINITY;
    assertFalse(validator.isAreaNegative(area));
  }
}
