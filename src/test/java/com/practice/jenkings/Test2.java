package com.practice.jenkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public static void test1() {
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("https://jupiter.cloud.planittesting.com/#/");
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();


		driver.findElement(By.id("forename")).sendKeys("Rishabh");
		driver.findElement(By.id("email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("message")).sendKeys("hello");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		String actual=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual,"Thanks Rishabh, we appreciate your feedback.");
		driver.quit();


	}}
