package com.TuroXpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TuroBase.Turo_Base_Class;

public class Turo_Elements extends Turo_Base_Class {
	
	public Turo_Elements() {
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy (xpath = "//*[@class='seo-pages-1fyw1rw-AvatarBurgerContainer esvnhvd1']")
		private WebElement DropDown;

		public WebElement getDropDown() {
			return DropDown;
		}
		
		@FindBy (xpath = "//*[@href='/us/en/login']")
		private WebElement ClickLogIn;
		
		public WebElement getClickLogIn() {
			return ClickLogIn;
		}
		
		@FindBy (id = "email")
		private WebElement Email;
		
		public WebElement getEmail() {
			return Email;
		}
		
		@FindBy (id = "password")
		private WebElement Password;
		
		public WebElement getPassword() {
			return Password;
		}
		
		@FindBy (xpath = "//*[@class = 'submitButton emailLoginForm-button']")
		private WebElement LogInButton;
		
		public WebElement getLogInButton() {
			return LogInButton;
		}

		

		

	

	
		
			
		
	
		
		
	}


