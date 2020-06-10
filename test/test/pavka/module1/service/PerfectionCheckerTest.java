package test.pavka.module1.service;

import by.pavka.module1.service.PerfectionChecker;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PerfectionCheckerTest {
  private PerfectionChecker perfectionChecker = new PerfectionChecker();

  @Test
  public void test1IsPerfect() {
    int number = 6;
    boolean perfect = perfectionChecker.isPerfect(number);
    assertTrue(perfect);
  }

  @Test
  public void test2IsPerfect() {
    int number = 7;
    boolean perfect = perfectionChecker.isPerfect(number);
    assertFalse(perfect);
  }
}
