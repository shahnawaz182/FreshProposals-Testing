package com.freshproposals.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseThis_Checkversions extends Common_Methods {
	WebDriver driver;
	String fname = "SEL";
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	
  @BeforeClass
  public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://beta1.freshproposals.com");
	}
  
  @Test(dataProvider = "User1" , priority = 0)
  
  public void login(String unm, String pwd) {
	    driver.findElement(By.id("textbox_0")).sendKeys(unm);
		driver.findElement(By.id("textbox_1")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
  
  @Test(priority = 1)
  public void UseThisProp() throws InterruptedException, AWTException {
	  Thread.sleep(5000);
	  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1693;editor=true#section6445");
	  Thread.sleep(2000);
	  driver.findElement(By.className("sectionlist-name")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Check Versions')]")).click();
	  Thread.sleep(2000);
	  Robot robot = new Robot();
	  Thread.sleep(2000);
    // Scroll Down using Robot class
      robot.keyPress(KeyEvent.VK_PAGE_DOWN);
      robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(2000);
	  //check version
	  driver.findElement(By.xpath("//li[2]//div[3]//img[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Push')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	  //content library
      Thread.sleep(2000);
      driver.findElement(By.linkText("CONTENT LIBRARY")).click();
      //open 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@src='../../assets/edit-temp.png']")).click();
      //back
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	   
  }
  
  @Test(priority = 2)
  public void UseThisTemp() throws InterruptedException, AWTException {
	  driver.get("http://beta1.freshproposals.com/home/templates/editTemplate/1243#section6446");
	  Thread.sleep(2000);
	  driver.findElement(By.className("sectionlist-name")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Check Versions')]")).click();
	  Thread.sleep(2000);
	  Robot robot = new Robot();
	  Thread.sleep(2000);
    // Scroll Down using Robot class
      robot.keyPress(KeyEvent.VK_PAGE_DOWN);
      robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(2000);
	  //check version
	  driver.findElement(By.xpath("//li[2]//div[3]//img[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Push')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	  //content library
      Thread.sleep(2000);
      driver.findElement(By.linkText("CONTENT LIBRARY")).click();
      //open 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@src='../../assets/edit-temp.png']")).click();
      //back
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	   
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
  Thread.sleep(3000);
  driver.close();
}
  
}
