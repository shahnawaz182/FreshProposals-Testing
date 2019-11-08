package com.freshproposals.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Send_Proposal_Temp extends Common_Methods{
	WebDriver driver;
	String fname = "SEL";
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	
  @BeforeTest
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
  public void createTemplate() throws InterruptedException {
		driver.findElement(By.linkText("TEMPLATES")).click();
		Thread.sleep(3000);
		//template name
		driver.findElement(By.linkText("Create your Template")).click();
		driver.findElement(By.name("name")).sendKeys(fname+" CLTempSend "+timestamp);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @Test(priority = 2)
  public void contentLibrary() throws InterruptedException {
	  Thread.sleep(3000);
		//content library
	    driver.findElement(By.xpath("//div[@class='col-lg-2 p-0 fixed-sidebar']//button[@class='btn add-sect-btn']")).click();
		//use this
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@src='../../../assets/use-this.svg']")).click();
		//close content library
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='../../../assets/cancel.svg']")).click();
  }
  
  @Test(priority = 3)
  public void generateProposal() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(), 'Generate Proposal' )]")).click();
		driver.findElement(By.name("name")).sendKeys(fname+" TempPropSend "+timestamp);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
  
  @Test(priority = 4)
  public void client() throws InterruptedException  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"headingSelectClient\"]/h2/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"collapseSelectClient\"]/div/div/app-clients/div[2]/div/div/div/div[2]/label/span")).click();
  }
  
  @Test(priority = 5)
  public void scrollWindow() throws InterruptedException  {
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1000)");
  }
  
  @Test(priority = 6)
  public void calender() throws InterruptedException  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//img[@src='../../../assets/calendar.svg']")).click();
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/app-edit-proposal/div[1]/div/div/div/div[1]/div[5]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[6]/div[1]/div")).click();
	  driver.findElement(By.linkText("Next")).click();
  }
  
  @Test(priority = 7)
  public void sendEmail() throws InterruptedException {
	  //next
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
      driver.findElement(By.xpath("//div[@class='card']//input")).sendKeys("Selenium Subject");
	  driver.findElement(By.xpath("//div[@class='fr-box fr-basic fr-top']//div[@class='fr-element fr-view']"))
	  .sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
				+ " when an unknown printer took a galley of type and scrambled it to make a type specimen book."
				+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
	  Thread.sleep(2000);
	  //send btn
	  driver.findElement(By.linkText("Send")).click();
	 
  }
  
  @AfterTest
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
  
  
}