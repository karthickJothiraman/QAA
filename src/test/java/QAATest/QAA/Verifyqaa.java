package QAATest.QAA;

import java.awt.Image;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resource.Base;



public class Verifyqaa 
 {
	public class home_search extends Base
	{
		@Test
		public void getsize() throws IOException
		{
			driver = initializeDriver();
			driver.get("https://www.qaagility.com");
			driver.manage().window().maximize();
			
			validation v = new validation(driver);
			v.geQAA().click();
			
			int ImageWidth = Image.getsize().getWidth();
		    {
		    System.out.println("Image width Is "+ImageWidth+" pixels");
		    }
		    
		    int ImageHeight = Image.getSize().getHeight(); 
		    {
		    System.out.println("Image height Is "+ImageHeight+" pixels");
		    
		    if(driver.findElement(By.xpath("//i[@class='fab fa-twitter']")).isDisplayed()) 
		    {
		    	driver.findElement(By.xpath("//i[@class='fab fa-twitter']")).click();
		    }
		    
		    
		    
		    
		    
		    }
		}
			
			

}
	}
}