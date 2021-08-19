package sai;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Assignment3 {
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  DesiredCapabilities cap=new DesiredCapabilities();
			
			//detail of device
			cap.setCapability("deviceName", "ravi phone");
			cap.setCapability("udid", "emulator-5554");
			
			//platformdetails
			cap.setCapability("platFormName", "Android");
			cap.setCapability("platFormVersion", "10.0(Q)");
			
			//automation engine
			cap.setCapability("automationName", "UiAutomator1");
			
			//webdriver details
			
			cap.setCapability("chromedriverExecutable", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
			cap.setCapability("browserName", "chrome");
			
			//serverinfo
			driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			System.out.println("Application started");
			
			
			driver.get("http://demo.guru99.com/");
			
	}
	
	AndroidDriver driver;
  @Test(priority=1)
  public void f() {
	  
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
	  WebElement radio = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
	  radio.click();
	  driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("ravikanth");
	  driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("eathakota");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ravikanthe54@gmail.com");
	  driver.findElement(By.xpath("/html/body/section/div/form/div/div[7]/textarea")).sendKeys("3250 forest hill avenue");
	  driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("5145869590");
	 // driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();
	  driver.findElementByXPath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input").sendKeys(Keys.ENTER);
	  driver.findElementByXPath("//*[@id=\"main\"]/div/div/ul/li/a").sendKeys(Keys.ENTER);
  }
  @Test(priority=2)
  public void d() {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"rental1\"]")).sendKeys("900");
	  driver.findElement(By.xpath("//*[@id=\"local_minutes\"]")).sendKeys("70");
	  driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]")).sendKeys("40");
	  driver.findElement(By.xpath("//*[@id=\"sms_pack\"]")).sendKeys("60");
	  driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]")).sendKeys("20");
	  driver.findElement(By.xpath("//*[@id=\"inter_charges\"]")).sendKeys("50");
	  driver.findElement(By.xpath("//*[@id=\"sms_charges\"]")).sendKeys("100");
	  driver.findElementByXPath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input").sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).sendKeys(Keys.ENTER);
	  
	  
  }
  @Test(priority=3)
  public void i() {
	  driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys("068146");
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).sendKeys(Keys.ENTER);
	  WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[1]"));
	  radio2.click();
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input")).sendKeys(Keys.ENTER);	  
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).sendKeys(Keys.ENTER);	
	  
	  
	  
  }
  @Test(priority=4)
  
  public void k() {
	  
	  driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys("068146");
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).sendKeys(Keys.ENTER);	
	  
	  
	  
  
  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
