package com.TuroStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TuroBase.Turo_Base_Class;
import com.TuroXpath.Turo_Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Turo_StepDef_Class extends Turo_Base_Class{
	
	Turo_Elements pf = PageFactory.initElements(driver, Turo_Elements.class);
	
	@Given("User open the Brower")
	public void user_open_the_brower() {
		Turo_Base_Class.setup();


	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {


	}

	@Given("User Hover over the dropdown")
	public void user_hover_over_the_dropdown() {
		
		Actions hover = new Actions(driver);
		hover.moveToElement(pf.getDropDown()).build().perform();
		//hover.moveToElement(pf.getDropDown().click()).build().perform();
		


	}

	@Given("User clicks on LogIn button")
	public void user_clicks_on_log_in_button() {
		pf.getClickLogIn().click();


	}

	@Given("User enters valid Email address")
	public void user_enters_valid_email_address() {
		pf.getEmail().sendKeys("shahran.jyhan99@gmail.com");


	}

	@Given("User enters valid Password")
	public void user_enters_valid_password() {
		pf.getPassword().sendKeys("Jyhan@1234");


	}

	@Then("User clicks on the LogIn button again")
	public void user_clicks_on_the_log_in_button_again() {
		pf.getLogInButton().click();


	}

	@Then("User Should see Log out button")
	public void user_should_see_log_out_button() {
		String actual = driver.findElement(By.xpath("//*[@href='/logout']")).getText();
		Assert.assertTrue(actual.contains("Log out"));


	}

}
