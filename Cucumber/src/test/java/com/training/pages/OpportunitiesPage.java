package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class OpportunitiesPage extends BasePage{
	
	static WebDriver driver;
	public OpportunitiesPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Username" , By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		addObject("Password" , By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		addObject("Login" , By.xpath("//input[@class='button r4 wide primary']"));
		addObject("Opportunities", By.xpath("//a[@title='Opportunities Tab']"));
		addObject("Dropdown", By.id("fcf"));
		addObject("Opportunity Pipeline Link", By.xpath("//a[text()='Opportunity Pipeline']"));
		addObject("Opportunity Pipeline", By.xpath("//h1[text()='Opportunity Pipeline']"));
		addObject("Stuck Opportunities Link", By.xpath("//a[text()='Stuck Opportunities']"));
		addObject("Stuck Opportunities", By.xpath("//h1[text()='Stuck Opportunities']"));
		addObject("Interval", By.xpath("//option[@value='current']"));
		addObject("Include", By.xpath("//option[@value='all']"));
		addObject("Run Report", By.xpath("//input[@title='Run Report']"));
		addObject("Opportunity Report", By.xpath("//h1[text()='Opportunity Report']"));
	}
	

}
