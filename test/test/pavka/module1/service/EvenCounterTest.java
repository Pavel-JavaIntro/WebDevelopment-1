package test.pavka.module1.service;

import by.pavka.module1.service.EvenCounter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenCounterTest {
  private EvenCounter evenCounter = new EvenCounter();

  @Test
  public void test1HaveAtLeastTwoEvens() {
    boolean actual = evenCounter.haveAtLeastTwoEvens(2, 4, 5);
    assertTrue(actual);
  }

  @Test
  public void test2HaveAtLeastTwoEvens() {
    boolean actual = evenCounter.haveAtLeastTwoEvens(2, 5, 7, 9, 1);
    assertFalse(actual);
  }
}
