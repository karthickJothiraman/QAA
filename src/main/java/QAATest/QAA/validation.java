package QAATest.QAA;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class validation 

 {
	public WebDriver driver;
	
	By QAA = By.xpath("//nav[@id='site-navigation']//img[@class='header-image']");
	
	
	public validation(WebDriver driver) 
	{
	// TODO Auto-generated constructor stub
	this.driver = driver;
    }
	
	
	public WebElement geQAA()
	{
		 return driver.findElement(QAA);
	}
	
    
 }