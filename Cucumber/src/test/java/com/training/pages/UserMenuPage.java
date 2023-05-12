package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage{
	
	static WebDriver driver;
	public UserMenuPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("Username" , By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		addObject("Password" , By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		addObject("Login" , By.xpath("//input[@class='button r4 wide primary']"));
		addObject("Usermenu", By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		addObject("My profile", By.xpath("//a[@title='My Profile']"));
		addObject("Edit profile pen", By.xpath("//a[@class='contactInfoLaunch editLink']"));
		addObject("Edit Profile page", By.id("contactInfoTitle"));
		addObject("Frame", By.id("contactInfoContentId"));
		addObject("About tab", By.id("aboutTab"));
		addObject("Lastname", By.xpath("//input[@id='lastName']"));
		addObject("Save All", By.xpath("//input[@value='Save All']"));
		addObject("Post", By.xpath("//span[text()='Post']"));
		addObject("Post frame", By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
		addObject("Share and update", By.xpath("//body[contains(text(),'Share an update')]"));
		addObject("Share", By.xpath("//input[@id='publishersharebutton']"));
		addObject("File", By.xpath("//span[text()='File']"));
		addObject("Upload a file from computer", By.id("chatterUploadFileAction"));
		addObject("Choose file", By.xpath("//input[@id='chatterFile']"));
		addObject("Developer Console", By.xpath("//a[text()='Developer Console']"));
		addObject("UsermenuList", By.id("userNav"));
		
	}
	

}
