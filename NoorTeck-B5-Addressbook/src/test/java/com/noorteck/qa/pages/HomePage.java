package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath= "//*[contains(text(), 'Home')]")
	WebElement homeLink;
	@FindBy(xpath= "//*[contains(text(), 'Addresses')]")
	WebElement addressesLink;
	
	@FindBy(xpath= "//*[contains(text(), 'Sign')]")
	WebElement signInLink;
	
	@FindBy(xpath = "//*[contains(text(), 'Welcome')])")
	WebElement HeaderOne;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}


