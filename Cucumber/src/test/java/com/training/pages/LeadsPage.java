package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LeadsPage extends BasePage{
	
	static WebDriver driver;
	public LeadsPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Leads" , By.xpath("//a[@title='Leads Tab']"));
		addObject("Dropdown", By.id("fcf"));
		addObject("MyUnreadLeads", By.xpath("//option[text()='My Unread Leads']"));
		addObject("My Unread Leads", By.xpath("//option[text()='My Unread Leads']"));
		addObject("Usermenu", By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		addObject("Username" , By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		addObject("Password" , By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		addObject("Login" , By.xpath("//input[@class='button r4 wide primary']"));
		addObject("New", By.xpath("//input[@title='New']"));
		addObject("LastName", By.id("name_lastlea2"));
		addObject("CmpyName", By.id("lea3"));
		addObject("Save", By.xpath("//input[@title='Save']"));
		addObject("New Leads", By.xpath("//h2[@class='topName']"));
	}
}