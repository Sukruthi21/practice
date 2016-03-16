package Assignmnt02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Clickingtest {
	WebDriver driver = new FirefoxDriver();
//	public Clickingtest() {
//		// TODO Auto-generated constructor stub
//		 WebDriver driver = new FirefoxDriver();
//	}
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  //driver.get("http://us.yatra.com/offer/us/detail/special-fare-on-jet-airways?gclid=CNGz8ISExMsCFYY2gQodWEADPA");
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
//	  driver = new FirefoxDriver();
		driver.get("http://us.yatra.com/offer/us/detail/special-fare-on-jet-airways?gclid=CNGz8ISExMsCFYY2gQodWEADPA");
		 driver.findElement(By.xpath(".//*[@id='menu_hotels']/a")).click();
  }

  @AfterClass
  public void afterClass() {
  }


}
