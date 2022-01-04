package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(id = "user_email")
	WebElement emailFieldSignUp;
	
	@FindBy(id = "user_password")
	WebElement passwordFieldSignUp;
	
	@FindBy(xpath = "//*[@name = 'commit']")
	WebElement signUpButton;
	
	@FindBy(xpath = "//h1[contains(text(), 'Welcome')]")
	WebElement header;
	
	public SignUpPage()	{
	PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		enter(emailFieldSignUp,email);
	}
	
	public void enterPassword(String password) {
		enter(passwordFieldSignUp, password);
	}
	
	public void clickSignUp() {
		click(signUpButton);
	}
	
	public String getHeaderText() {
		return header.getText();
	}

	
}
