package test.pavka.module1.service;

import by.pavka.module1.service.TableFunction;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

public class TableFunctionTest {
  private TableFunction table = new TableFunction();

  @Test
  public void testFunctionToTable() {
    Map<Double, Double> results = table.functionToTable(0.1, 0, 1);
    Double expected = Math.tan(0.2);
    assertEquals(results.get(0.2), expected);
  }
}
