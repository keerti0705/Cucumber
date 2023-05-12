package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	public LoginPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Username" , By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		addObject("Password" , By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		addObject("Username1", By.xpath("//input[@class='input wide mb12 mt8 username']"));
		addObject("Remeber me", By.id("rememberUn"));
		addObject("Login" , By.xpath("//input[@class='button r4 wide primary']"));
		addObject("Usermenu", By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		addObject("Forgot Password", By.id("forgot_password_link"));
		addObject("Continue", By.xpath("//input[@value='Continue']"));
		addObject("Message", By.id("error"));
	}
}
