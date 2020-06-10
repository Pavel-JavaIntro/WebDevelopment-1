package test.pavka.module1.service;

import by.pavka.module1.service.FunctionWithTwoBranches;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionWithTwoBranchesTest {
  private FunctionWithTwoBranches function = new FunctionWithTwoBranches();

  @Test
  public void test1CalculateFunction() {
    double x = 2;
    double expected = 0.5;
    double actual = function.claculateFunction(x);
    assertEquals(actual, expected);
  }

  @Test
  public void test2CalculateFunction() {
    double x = 4.0;
    double expected = 5;
    double actual = function.claculateFunction(x);
    assertEquals(actual, expected);
  }

  @Test
  public void test3CalculateFunction() {
    double x = Math.pow(6, 1/3.0);
    double expected = Double.POSITIVE_INFINITY;
    double actual = function.claculateFunction(x);
    assertEquals(actual, expected);
  }
}
