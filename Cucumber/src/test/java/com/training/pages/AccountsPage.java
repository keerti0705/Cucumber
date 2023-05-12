package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountsPage extends BasePage{
	
	static WebDriver driver;
	public AccountsPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Username" , By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		addObject("Password" , By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		addObject("Login" , By.xpath("//input[@class='button r4 wide primary']"));
		addObject("Accounts", By.xpath("//a[@title='Accounts Tab']"));
		addObject("New", By.xpath("//input[contains(@value,'New')]"));
		addObject("Account Name", By.id("acc2"));
		addObject("Technology partner", By.xpath("//option[@value='Technology Partner']"));
		addObject("High", By.xpath("//select/option[text()='High']"));
		addObject("Save", By.xpath("//input[@title='Save']"));
		addObject("Usermenu", By.id("userNavLabel"));
		addObject("Create New View", By.xpath("//a[normalize-space()='Create New View']"));
		addObject("View Name", By.id("fname"));
		addObject("View Unique Name", By.id("devname"));
		addObject("View Save", By.xpath("//input[contains(@value,'Save')]"));
		addObject("Selected View", By.xpath("//select/option[@selected='selected']"));
		addObject("View", By.xpath("//select[@name='fcf']/option[@selected='selected']"));
		addObject("Edit", By.xpath("//a[text()='Edit']"));
		addObject("Account Name", By.xpath("//select[@id='fcol1']/option[text()='Account Name']"));
		addObject("C", By.xpath("//select[@id='fop1']/option[@value='c']"));
		addObject("Value", By.id("fval1"));
		addObject("Save", By.xpath("(//input[@title='Save'])[2]"));
		addObject("Merge Accounts", By.xpath("//a[text()='Merge Accounts']"));
		addObject("Accounts Search", By.id("srch"));
		addObject("Find Accounts", By.xpath("//input[@value='Find Accounts']"));
		addObject("Next", By.xpath("//input[@title='Next' and @name='goNext']"));
		addObject("Merge", By.xpath("(//input[@title='Merge'])[2]"));
		addObject("Merged account", By.xpath("//tr[contains(@class,'dataRow even first highlight')]"));
		addObject("Accounts with last activity>30 days", By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		addObject("Dropdown", By.id("ext-gen148"));
		addObject("Create date", By.xpath("//div[text()='Created Date']"));
		addObject("Calendar - From", By.id("ext-gen152"));
		addObject("Today", By.id("ext-gen281"));
		addObject("Calendar - To", By.id("ext-gen154"));
		addObject("Today To", By.id("ext-gen296"));
		addObject("Save", By.id("ext-gen49"));
		addObject("Report name", By.id("saveReportDlg_reportNameField"));
		addObject("Report unique name", By.id("saveReportDlg_DeveloperName"));
		addObject("Save and Run", By.xpath("//button[text()='Save and Run Report']"));
	}
	

}
