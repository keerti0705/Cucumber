package com.training.steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;
import com.training.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Steps extends BaseTest{
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	//LoginPage page;
	
	String strName;
	String str;

	@Before
	public void setup() throws Exception{
		launchapplication();
	}
	
	
	@Given("User is on {string}")
	public void user_is_on(String Page) {
		page = pageFactory.initialize(Page);
		//page = new LoginPage(driver);
	}

	@When("User enter into Textbox {string} {string}")
	public void user_enter_into_textbox(String logicalName, String Value) {
		page.enterintoTextbox(logicalName, Value);
	    
	}
	@Then("User enters into Textbox {string}")
	public void user_enters_into_textbox(String logicalName) {
		strName = RandomStringUtils.randomAlphanumeric(4);
		page.enterintoTextbox(logicalName, strName);
	    
	}
	@Then("User enters into TextBox {string}")
	public void user_enters_into_textBox(String logicalName) {
		str = RandomStringUtils.randomAlphanumeric(4);
		page.enterintoTextbox(logicalName, str);
	    
	}
	@And("click on Button {string}")
	public void click_on_button(String logicalName) {
	    page.clickonButton(logicalName);
	}
	
	@Then("User clicks on checkbox {string}")
	public void user_clicks_on_checkbox(String logicalName) {
	    page.checkBox(logicalName);
	}

	@Then("User clicks on dropdown {string}")
	public void user_clicks_on_dropdown(String logicalName) {
	    page.switchToTab(logicalName);
	}

	@Then("Selects {string}")
	public void selects(String logicalName) {
	    page.logout(logicalName);
	}
	@Then("User clicks link {string}")
	public void user_clicks_link(String logicalName) {
	    page.link(logicalName);
	}
	@Then("Validate error message {string}")
	public void validate_error_message(String logicalName) {
	    page.validateErrMsg(logicalName);
	}
	@Then("Validate error message {string} {string}")
	public void validateErrMessage(String logicalName) {
	    page.validateErrMsg(logicalName);
	}
	@Then("Switch to {string}")
	public void switch_to(String logicalName) {
	    page.switchToTab(logicalName);
	}
	@Then("User waits {int}")
	public void user_waits(Integer int1) throws InterruptedException {
		page.wait(int1);
	}

	@Then("Switch to frame {string}")
	public void switch_to_frame(String logicalName) {
	    page.switchToFrame(logicalName, logicalName);
	}
	@Then("User is out of frame")
	public void user_is_out_of_frame() {
	    page.outOfFrame();
	}
	@Then("User clicks tab {string}")
	public void user_clicks_tab(String logicalName) throws InterruptedException {
	    page.clickTab(logicalName);
	}
	@Then("User clicks tab for second time {string}")
	public void user_clicks_tab_for_second_time(String logicalName) throws InterruptedException {
	    page.clickTabSecondTime(logicalName);
	}
	@Then("User closes window")
	public void user_closes_window() {
	    page.closeWindow();
	}
	@Then("Validate name listed {string}")
	public void validate_name_listed(String logicalName) {
	    page.validateNameListed(logicalName, strName);
	}
	@Then("User is prompted with alert")
	public void user_is_prompted_with_alert() {
	    page.promptAccept();
	}
	@Then("Validate merged account {string} and {string}")
	public void validate_merged_account(String logicalName, String logicalName1) {
	    page.validateNameListed(logicalName, logicalName1);
	}
	@Then("Validate {string} of {string}")
	public void validate(String logicalName, String strPage) {
		System.out.println(logicalName);
		System.out.println(strPage);
//		if(page.equals(strPage)) {
//			System.out.println("in if");
//			page.validateDD(logicalName);
//			}
//	    else {
//	    	System.out.println("in else");
//			page.validateLeadsDD(logicalName);
//	    }
		while(page.equals(strPage)) {
			System.out.println("in while");
			page.validateDD(logicalName);
			page.validateLeadsDD(logicalName);
			
		}
	}
	@Then("Validate name listed {string} and {string}")
	public void validate_name_listed_and(String logicalName, String value) {
	    page.validateNameListed(logicalName, value);
	}
	@Then("Validate new view {string}")
	public void validate_new_view(String logicalName) {
	    page.validateNewCreated(logicalName, strName);
	}
	@Then("Validate dropdown list {string}")
	public void validate_dropdown_list(String logicalName, DataTable dataTable) {
	    List<String> list = dataTable.asList();
	    System.out.println(list.size());
	    List<String> expected = new ArrayList<String>();
	    for(int i=0; i<list.size(); i++) {
	    	expected.add(list.get(i));
	    }
	    System.out.println("expected size:  "+expected.size()+"logicalName: "+logicalName);
	    page.validateList(logicalName, expected);
	}

	
	@After
	public void teardown(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		
		driver.close();
		driver=null;
	}
	
}