package com.Myproject.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr340764");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("uvYmUmA");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.cssSelector(null));
		driver.findElement(By.xpath("//body/form[@name='frmLogin']/table//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("/html/body//ul[@class='menusubnav']//a[@href='Logout.php']")).click();

	}

}

