package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class ContactsPage extends BasePage{
	
	static WebDriver driver;
	public ContactsPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Contacts" , By.xpath("//a[text()='Contacts']"));
		addObject("New", By.xpath("//input[@title='New']"));
		addObject("Last Name", By.id("name_lastcon2"));
		addObject("Account Name", By.id("con4"));
		addObject("Save", By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		addObject("New View", By.xpath("//h2[@class='topName']"));
		addObject("Create New View", By.xpath("//a[text()='Create New View']"));
		addObject("View Name", By.id("fname"));
		addObject("View Unique Name", By.id("devname"));
		addObject("Save", By.xpath("(//input[@title='Save'])[1]"));
		addObject("New View", By.xpath("//select[@name='fcf']"));
		addObject("Recently Created", By.xpath("//select/option[@value='2']"));
		addObject("Recent Contacts", By.xpath("//h3[text()='Recent Contacts']"));
		addObject("View DD", By.xpath("//option[text()='My Contacts']"));
		addObject("Go", By.xpath("//input[@title='Go!']"));
		addObject("Contact Name", By.xpath("//a[text()='bhatt05']"));
		addObject("Contact Name Page", By.xpath("//h2[contains(text(),'bhatt05')]"));
		addObject("Save Btn", By.xpath("//input[@title='Save'][1]"));
		addObject("Error Msg", By.xpath("//div[@class='errorMsg'][1]"));
		addObject("Cancel", By.xpath("//input[@title='Cancel'][1]"));
		addObject("Contacts Home Page", By.xpath("//h2[@class='pageDescription']"));
		addObject("Save and New", By.xpath("//input[@title='Save & New'][2]"));
		addObject("Error Message", By.id("errorDiv_ep"));
	}			
}