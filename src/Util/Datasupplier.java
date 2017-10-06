package Util;

import org.testng.annotations.DataProvider;

public class Datasupplier {
  
  @DataProvider
  public Object[][] Employee() {
    return new Object[][] {
      new Object[] { 2531, "Dilip" },
      new Object[] { 2532, "Sandeep" },
    };
  }
  
  @DataProvider
  public Object[][] Student() {
    return new Object[][] {
      new Object[] { 2531, "Dilip" },
      new Object[] { 2532, "Sandeep" },
    };
  }
}

