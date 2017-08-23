package com.saasframework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class LoginTest {
	public WebDriver driver;
	public LoginPage instanceLoginPage;
	public String baseUrl = "https://saasframework.net/Account/Login?ReturnUrl=%2Fgha";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		instanceLoginPage = new LoginPage(driver);
		driver.get(baseUrl);
	}
	
	@Test
	public void login() {
		instanceLoginPage.setEmail("sf1@mailinator.com");
		instanceLoginPage.setPassword("123123");
		instanceLoginPage.pressSubmitButton();
	}
	
	/* Verify
	 * @After
	public void verifyPageIsExpected() {
		
	}*/
}