package com.saasframework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
		
	public By emailField = By.id("Email");
	public By passwordField = By.id("Password");
	public By submitButton = By.xpath("//*[@id=\"container\"]/div[2]/div/div[1]/form/button");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void setEmail(String emailValue) {
		driver.findElement(emailField).sendKeys(emailValue);
	}
	
	public void setPassword(String passwordValue) {
		driver.findElement(passwordField).sendKeys(passwordValue);
	}
	
	public void pressSubmitButton() {
		driver.findElement(submitButton).click();
	}	
	
	public void login(String emailValue, String passwordValue) {
		this.setEmail(emailValue);
		this.setPassword(passwordValue);
		this.pressSubmitButton();
	}
}
