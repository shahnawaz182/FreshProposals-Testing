package com.freshproposals.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextBox_Top_Properties2 extends Common_Methods {
	WebDriver driver;

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
	  public void url() throws InterruptedException {
		    Thread.sleep(1000);
		    driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
	    }
	  
	  @Test(enabled = false)
	  public void bold() throws InterruptedException, AWTException {
		    Thread.sleep(1000);
		    driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).sendKeys("I am BOLD");
		    Thread.sleep(2000);
		    
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_SHIFT);
//		    Thread.sleep(000);
		    
		    Actions action = new Actions(driver);
		    action.keyDown(Keys.SHIFT).keyDown(Keys.ARROW_LEFT).perform();
		    action.doubleClick(driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p"))).build().perform();
	    }
	  
	  @Test(priority = 3)
	  public void click_reflect_h1() throws InterruptedException {
		    Thread.sleep(1000);
		    driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Testing on Paragraph Style");
			Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Heading 1");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Heading 1")).click();
			String actual_heading1 = driver.findElement(By.linkText("Heading 1")).getAttribute("title");
		    String expected_heading1 = "Heading 1";
		    Assert.assertEquals(actual_heading1, expected_heading1);
		    
		  
	  	}
	  
	  @Test(priority = 4)
	  public void click_reflect_h2() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Heading 2");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Heading 2")).click();
		  String actual_heading2 = driver.findElement(By.linkText("Heading 2")).getAttribute("title");
		  String expected_heading2 = "Heading 2";
		  Assert.assertEquals(actual_heading2, expected_heading2);
		  
	
		   }
	  
	  @Test(priority = 5)
	  public void click_reflect_h3() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Heading 3");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Heading 3")).click();
		  String actual_heading3 = driver.findElement(By.linkText("Heading 3")).getAttribute("title");
		  String expected_heading3 = "Heading 3";
		  Assert.assertEquals(actual_heading3, expected_heading3);
		  
		
		    }
	  
	  @Test(priority = 6)
	  public void click_reflect_h4() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Heading 4");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Heading 4")).click();
		  String actual_heading4 = driver.findElement(By.linkText("Heading 4")).getAttribute("title");
		  String expected_heading4 = "Heading 4";
		  Assert.assertEquals(actual_heading4, expected_heading4);
		  
	
		   }
	  
	  @Test(priority = 7)
	  public void click_reflect_body() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Body");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Body")).click();
		  String actual_body = driver.findElement(By.linkText("Body")).getAttribute("title");
		  String expected_body = "Body";
		  Assert.assertEquals(actual_body, expected_body);
		  
		
		   }
	  
	  @Test(priority = 8)
	  public void click_reflect_quote() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nI am Quote");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'paragraphStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Quote")).click();
		  String actual_quote = driver.findElement(By.linkText("Quote")).getAttribute("title");
		  String expected_quote = "Quote";
		  Assert.assertEquals(actual_quote, expected_quote);
		  
	
		   }
	  
	  @Test(priority = 9)
	  public void Save_paragraph_style() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 10)
	  public void delete_all() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 11)
	  public void click_reflect_default() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
     	  Thread.sleep(1000);
    	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Testing on Line Height");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'lineHeight')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Default")).click();
		  String actual_default = driver.findElement(By.linkText("Default")).getAttribute("title");
		  String expected_default = "Default";
		  Assert.assertEquals(actual_default, expected_default);
	   
		  String actual_line_height = driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).getCssValue("line-height");
		  System.out.println("default "+actual_line_height);
		  
	  } 
	  
	  @Test(priority = 12)
	  public void click_reflect_single() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'lineHeight')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Single")).click();
		  String actual_single = driver.findElement(By.linkText("Single")).getAttribute("title");
		  String expected_single = "Single";
		  Assert.assertEquals(actual_single, expected_single);
		  
		  String actual_line_height = driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).getCssValue("line-height");
		  System.out.println("single "+actual_line_height);
	  }
	  
	  @Test(priority = 13)
	  public void click_reflect_1point15() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'lineHeight')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("1.15")).click();
		  String actual_digit1 = driver.findElement(By.linkText("1.15")).getAttribute("title");
		  String expected_digit1 = "1.15";
		  Assert.assertEquals(actual_digit1, expected_digit1);
		  
		  String actual_line_height = driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).getCssValue("line-height");
		  System.out.println("1.15 "+actual_line_height);
	  }
	  
	  @Test(priority = 14)
	  public void click_reflect_1point5() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'lineHeight')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("1.5")).click();
		  String actual_digit2 = driver.findElement(By.linkText("1.5")).getAttribute("title");
		  String expected_digit2 = "1.5";
		  Assert.assertEquals(actual_digit2, expected_digit2);
		  
		  String actual_line_height = driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).getCssValue("line-height");
		  System.out.println("1.5 "+actual_line_height);
		  
	  }
	  
	  @Test(priority = 15)
	  public void click_reflect_double() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'lineHeight')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Double")).click();
		  String actual_double = driver.findElement(By.linkText("Double")).getAttribute("title");
		  String expected_double = "Double";
		  Assert.assertEquals(actual_double, expected_double);
		  
		  String actual_line_height = driver.findElement(By.xpath("//div[@class='fr-element fr-view']//p")).getCssValue("line-height");
		  System.out.println("double "+actual_line_height);
	  }
	  
	  @Test(priority = 16)
	  public void Save_line_height() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 17)
	  public void delete_all_2() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 18)
	  public void align_left() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
     	  Thread.sleep(1000);
    	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Testing on Align");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'align')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@title='Align Left']")).click();
		  //System.out.println(driver.findElement(By.xpath("//a[@title='Align Left']")).getCssValue("text-align"));
	  }
		
	  @Test(priority = 19)
	  public void align_center() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'align')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@title='Align Center']")).click();
	  }
	  
	  @Test(priority = 20)
	  public void align_right() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'align')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@title='Align Right']")).click();
	  }
	  
	  @Test(priority = 21)
	  public void align_justify() throws InterruptedException {  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("\nLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'align')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@title='Align Justify']")).click();
		  
	  }
	  
	  @Test(priority = 22)
	  public void Save_align() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 23)
	  public void delete_all_3() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 24)
      public void orderList_default() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@id='dropdown-menu-formatOLOptions-1']//a[@class='fr-command'][contains(text(),'Default')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  String actual_default = driver.findElement(By.xpath("//div[@id='dropdown-menu-formatOLOptions-1']//a[@class='fr-command'][contains(text(),'Default')]")).getAttribute("title");
		  String expected_default = "Default";
		  Assert.assertEquals(actual_default, expected_default);
		  
	  }
	  
	  @Test(priority = 25)
	  public void Save_ol1() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 26)
	  public void delete_all_4() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 27)
	  public void orderlist_lower_alpha() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Lower Alpha')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
			  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
			  		+ "a type specimen book.");
		  String actual_loweralpha = driver.findElement(By.xpath("//a[contains(text(),'Lower Alpha')]")).getAttribute("title");
		  String expected_loweralpha = "Lower Alpha";
		  Assert.assertEquals(actual_loweralpha, expected_loweralpha);
	  }
	  
	  @Test(priority = 28)
	  public void Save_ol2() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 29)
	  public void delete_all_5() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 30)
	  public void orderlist_lower_greek() throws InterruptedException, AWTException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[contains(text(),'Lower Greek')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_lowergreek = driver.findElement(By.xpath("//a[contains(text(),'Lower Greek')]")).getAttribute("title");
	  String expected_lowergreek = "Lower Greek";
	  Assert.assertEquals(actual_lowergreek, expected_lowergreek);
	  }
	  
	  @Test(priority = 31)
	  public void Save_ol3() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 32)
	  public void delete_all_6() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 33)
	  public void orderlist_lower_roman() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Lower Roman')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_lowerroman = driver.findElement(By.xpath("//a[contains(text(),'Lower Roman')]")).getAttribute("title");
	  String expected_lowerroman = "Lower Roman";
	  Assert.assertEquals(actual_lowerroman, expected_lowerroman);
	  }
	  
	  @Test(priority = 34)
	  public void Save_ol4() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 35)
	  public void delete_all_7() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	
	  @Test(priority = 36)
	  public void orderlist_upper_alpha() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Upper Alpha')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_upperalpha = driver.findElement(By.xpath("//a[contains(text(),'Upper Alpha')]")).getAttribute("title");
	  String expected_upperalpha = "Upper Alpha";
	  Assert.assertEquals(actual_upperalpha, expected_upperalpha);
	  }
	  
	  @Test(priority = 37)
	  public void Save_ol5() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 38)
	  public void delete_all_8() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	
	  
	  @Test(priority = 39)
	  public void orderlist_upper_roman() throws InterruptedException, AWTException {
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatOLOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Upper Roman')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_upperroman = driver.findElement(By.xpath("//a[contains(text(),'Upper Roman')]")).getAttribute("title");
	  String expected_upperroman = "Upper Roman";
	  Assert.assertEquals(actual_upperroman, expected_upperroman);
	  }
	  
	  @Test(priority = 40)
	  public void Save_ol6() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 41)
	  public void delete_all_9() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 42)
	  public void unorderlist_default() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatULOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@id='dropdown-menu-formatULOptions-1']//a[@class='fr-command'][contains(text(),'Default')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_default = driver.findElement(By.xpath("//div[@id='dropdown-menu-formatULOptions-1']//a[@class='fr-command'][contains(text(),'Default')]")).getAttribute("title");
	  String expected_default = "Default";
	  Assert.assertEquals(actual_default, expected_default);
	  }
	  
	  @Test(priority = 43)
	  public void Save_ul1() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 44)
	  public void delete_all_10() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 45)
	  public void unorderlist_circle() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatULOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Circle')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_circle = driver.findElement(By.xpath("//a[contains(text(),'Circle')]")).getAttribute("title");
	  String expected_circle = "Circle";
	  Assert.assertEquals(actual_circle, expected_circle);
	  }
	  
	  @Test(priority = 46)
	  public void Save_ul2() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 47)
	  public void delete_all_11() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 48)
	  public void unorderlist_disc() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatULOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Disc')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_disc = driver.findElement(By.xpath("//a[contains(text(),'Disc')]")).getAttribute("title");
	  String expected_disc = "Disc";
	  Assert.assertEquals(actual_disc, expected_disc);
	  }
	  
	  @Test(priority = 49)
	  public void Save_ul3() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 50)
	  public void delete_all_12() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 51)
	  public void unorderlist_square() throws InterruptedException, AWTException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'formatULOptions')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Square')]")).click();
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
		  		+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
		  		+ "a type specimen book.");
	  String actual_square = driver.findElement(By.xpath("//a[contains(text(),'Square')]")).getAttribute("title");
	  String expected_square = "Square";
	  Assert.assertEquals(actual_square, expected_square);
	  }
	  
	  @Test(priority = 52)
	  public void Save_ul4() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 53)
	  public void delete_all_13() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 54)
	  public void insert_link() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'insertLink')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.name("href")).sendKeys("www.google.com");
//		  String actual_link = driver.findElement(By.name("href")).getText();
//		  String expected_link = "www.google.com";
//		  Assert.assertEquals(actual_link, expected_link);
//		  Thread.sleep(1000);
		  driver.findElement(By.name("text")).sendKeys("Google");
//		  System.out.println(driver.findElement(By.name("text")).getText());
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[contains(text(),'Insert')]")).click();
	  }
	  
	  @Test(priority = 55)
	  public void Save_link() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(enabled = false)
	  public void linkStyle() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(text(),'Google')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'linkStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Green")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'linkStyle')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Thick")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[starts-with(@id,'linkEdit')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.name("text")).clear();
		  driver.findElement(By.name("text")).sendKeys("Google Update");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	  }
	  
	  @Test(enabled = false)
	  public void Save_link_update() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  @Test(priority = 58)
	  public void delete_all_14() throws InterruptedException {
		  driver.findElement(By.id("froalapage1-fpText121920191125020")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
	  }
	  
	  @Test(priority = 59)
	  public void Save_final() throws InterruptedException {
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		  Thread.sleep(3000);
		  driver.get("http://beta1.freshproposals.com/home/proposals/editProposal;proposalId=1758;editor=true");
		  
	 }
	  
	  
	  
	  @AfterClass
	  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	}
	  }
