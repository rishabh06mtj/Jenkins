package com.practice.jenkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args)
{
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//p[text()='Departure From New Delhi']/following-sibling::div/descendant::div[text()='Before ']/b/parent::div[text()=' AM']
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-28/02/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
String text= driver.findElement(By.xpath("//p[text()='Departure From New Delhi']/following-sibling::div/descendant::div[text()='Before ']/b/parent::div[text()=' AM']")).getText();
	System.out.println(text);
// String text=driver.findElement(By.xpath("//p[text()='Adrika Cotton Sarees']/parent::span/div//h5")).getText();
		//Actions a=new Actions(driver);
		//a.moveToElement().p
	   // System.out.println(text);
//	    String  text="?223 onwards";
//	  String te=text.split(" ")[0].replace('?',' ');
//	  System.out.println(te);
	   
		
		

	}

}
