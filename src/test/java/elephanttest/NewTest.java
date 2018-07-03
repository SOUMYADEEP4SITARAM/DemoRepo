package elephanttest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {    
	  System.out.println("kkk");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("india");
  }

  @AfterTest
  public void afterTest() {
  }

}
