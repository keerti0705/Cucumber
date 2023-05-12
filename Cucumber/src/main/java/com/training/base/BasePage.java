package com.training.base;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.DOMConfiguration;

public class BasePage {
	WebDriver driver;
	public HashMap<String,By> ObjectRepo = new HashMap<String, By>();
		
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addObject(String LogicalName, By by) {
		ObjectRepo.put(LogicalName, by);
		
	}
	
	private WebElement getEelment(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element; 
		
	}
	private List<WebElement> getElements(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		List<WebElement> element = driver.findElements(by);
		return element; 
		
	}
	public void enterintoTextbox(String LogicalName, String Value) {
		 WebElement element = getEelment(LogicalName);
		    waitforElement(element);
		    element.sendKeys(Value);
		}
	
	public void clickonButton(String LogicalName) {
		 WebElement element = getEelment(LogicalName);	
		 waitforElement(element);
		 element.click();
	}
	public void checkBox(String LogicalName) {
		 WebElement element = getEelment(LogicalName);	
		 waitforElement(element);
		 element.click();
	}
	public void switchToTab(String LogicalName) {
		WebElement element = getEelment(LogicalName);
		waitforElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		element.click();
	}
	public void logout(String LogicalName) {
		WebElement element = getEelment(LogicalName);	
		 waitforElement(element);
		 element.click();
	}
	public void link(String LogicalName) {
		WebElement element = getEelment(LogicalName);	
		waitforElement(element);
		element.click();
	}
	public void validateErrMsg(String LogicalName) {
		WebElement element = getEelment(LogicalName);
		String actual = element.getText();
		Assert.assertEquals(actual, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		System.out.println("Error message displayed correctly ");
	}
	public void validateErrorMsg(String LogicalName) {
		WebElement element = getEelment(LogicalName);
		String actual = element.getText();
		Assert.assertEquals(actual, "Error: Invalid Data.Review all error messages below to correct your data.");
		System.out.println("Error message displayed correctly ");
	}
	public void switchToFrame(String LogicalName, String frameName) {
		WebElement element = getEelment(LogicalName);
		waitforElement(element);
		Actions actionProfile = new Actions(driver);
		actionProfile.moveToElement(element);
		WebElement frame = getEelment(frameName);
		System.out.println("****"+frame);
		driver.switchTo().frame(frame);
	}
	public void outOfFrame() {
		driver.switchTo().defaultContent();
	}
	public void clickTab(String logicalName) throws InterruptedException {
		WebElement element = getEelment(logicalName);
		element.click();
		String homeWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String currentWindow;
		while(it.hasNext()) {
			currentWindow = it.next().toString();
			if(currentWindow.equals(homeWindow)) {
				wait(5000);
				WebElement closeWnd = driver.findElement(By.id("tryLexDialogX"));
				closeWnd.click();
			}
		}
		driver.switchTo().defaultContent();
	}
	public void clickTabSecondTime(String logicalName) throws InterruptedException {
		WebElement element = getEelment(logicalName);
		element.click();
	}
	public void closeWindow() {
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWnd = it.next();
		String currentWindow = it.next();
		//while(it.hasNext()) {
			//currentWindow = it.next().toString();
		//}
				driver.switchTo().window(currentWindow);
				System.out.println("Closing Developer Console Window");
				driver.close();
				driver.switchTo().window(parentWnd);
			
		}
	public void validateNameListed(String logicalName, String strName) {
		WebElement element = getEelment(logicalName);
		assertEquals(element.getText(), strName);
		System.out.println("View Name validated");
	}
	public void promptAccept() {
		driver.switchTo().alert().accept();
	}
	public void validateMergedAcc(String logicalName, String logicalName1) {
		WebElement element = getEelment(logicalName);
		assertEquals(element.getText(), logicalName1);
		System.out.println("Accounts are Merged");
	}
	public void validateDD(String logicalName) {
		System.out.println("in opp");
		WebElement element = getEelment(logicalName);
		Select original = new  Select(element);
		List<WebElement> originalListElements = original.getOptions();
		List<String> originalList = new ArrayList<String>();
		for (WebElement webElement : originalListElements) {
			originalList.add(webElement.getText());
		}
		List<String> targetList = new ArrayList<String>();
		targetList.add("All Opportunities");
		targetList.add("Closing Next Month");
		targetList.add("Closing This Month");
		targetList.add("My Opportunities");
		targetList.add("New Last Week");
		targetList.add("New This Week");
		targetList.add("Opportunity Pipeline");
		targetList.add("Private");
		targetList.add("Recently Viewed Opportunities");
		targetList.add("Won");
		
		Assert.assertEquals(originalList, targetList); 
		System.out.println("Values in the dropdown matches, hence validated");
	}
	public void validateLeadsDD(String logicalName) {
		WebElement element = getEelment(logicalName);
		Select original = new  Select(element);
		List<WebElement> originalListElements = original.getOptions();
		List<String> originalList = new ArrayList<String>();
		for (WebElement webElement : originalListElements) {
			originalList.add(webElement.getText());
		}
		List<String> targetList = new ArrayList<String>();
		targetList.add("All Open Leads");
		targetList.add("My Unread Leads");
		targetList.add("Recently Viewed Leads");
		targetList.add("Today's Leads");
		targetList.add("View - Custom 1");
		targetList.add("View - Custom 2");
		Assert.assertEquals(originalList, targetList); 
		System.out.println("Values in the dropdown matches, hence validated");
	}
	public void validateNewCreated(String logicalName, String value) {
		WebElement element = getEelment(logicalName);
		Select original = new  Select(element);
		String expected = original.getFirstSelectedOption().getText();
		System.out.println(original.getFirstSelectedOption().getText());
		System.out.println(value);
		assertEquals(value, expected);
	}
	public void validateList(String logicalName, List<String> expected) {
		List<WebElement> element = getElements(logicalName);
		System.out.println("list: "+element);
		for(WebElement elements: element) {
			element.add(elements);
		}
		Assert.assertEquals(element, expected);
		}

	
		
	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void wait(int time) throws InterruptedException {
		Thread.sleep(time);
		
	}
	
	

}