package Testng;

import org.testng.annotations.Test;

import Util.Datasupplier;

public class Dataprov {
  @Test(dataProviderClass=Datasupplier.class,dataProvider = "Student")
  public void employeedetails(int id , String name) {
	  System.out.print("employeename:"+name+ "|");
	  System.out.println("employeeid:"+id);
  }

  /*@DataProvider
  public Object[][] Employee() {
    return new Object[][] {
      new Object[] { 2501, "Dilip" },
      new Object[] { 2502, "Raju" },
    };
  }*/
}
