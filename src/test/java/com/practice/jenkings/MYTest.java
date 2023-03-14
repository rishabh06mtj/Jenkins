package com.practice.jenkings;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MYTest {
	////
	@Test(enabled=false)
	public void test() throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele= (WebElement)js.executeScript("return document.querySelector('body > downloads-manager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
		ele.sendKeys("Rishabh");
		//		WebElement ele1= (WebElement)js.executeScript("return document.querySelector('body > downloads-manager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#clearSearch').shadowRoot.querySelector('#icon > iron-icon')");
		//		ele1.click();
		//js.executeScript("return document.querySelector('body > downloads-manager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput').value=arguments[0]","kkkk");
	}



	@Test
	public void js()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		driver.findElement(By.cssSelector("downloads-manager"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("return document.");



	}
}
