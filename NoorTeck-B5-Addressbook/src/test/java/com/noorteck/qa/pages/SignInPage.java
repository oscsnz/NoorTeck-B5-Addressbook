package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{

	@FindBy(id = "session_email")
	WebElement emailFieldSignIn;
	
	@FindBy(id = "session_password")
	WebElement passwordFieldSignUp;
	
	@FindBy(xpath = "//*[@name = 'commit']")
	WebElement signInButton;
	
	@FindBy(xpath ="//*[contains(text(), 'Addresses')]")
	WebElement addressesLink;
	
	@FindBy(xpath = "//*[contains(text(),'New')]")
	WebElement addNewAddress;
	
	@FindBy(id = "address_first_name")
	WebElement firstName;
	
	@FindBy(id = "address_last_name")
		WebElement lastName;
	
	@FindBy(id = "address_street_address")
	WebElement address1;
	
	@FindBy(id = "address_city")
	WebElement cityTextBox;
	
	@FindBy(id = "address_state")
	WebElement selectState;
	
	@FindBy(id = "address_zip_code")
	WebElement zipCode;
	
	@FindBy(id = "address_country_us")
	WebElement countryRadio;
	
	@FindBy(id = "address_age")
	WebElement age;
	
	@FindBy(id = "address_phone")
	WebElement phone;
	
	@FindBy(id = "address_interest_dance")
	WebElement dancingInterestRadio;
	
	@FindBy(id = "address_note")
	WebElement note;
	
	@FindBy(xpath = "//*[@value = 'Create Address']")
	WebElement createAddressButton;
	
	@FindBy(xpath = "//*[contains(text(),'List')]")
	WebElement listLink;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[1]")
	WebElement firstNameInTable;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]" )
	WebElement lastNameInTable;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[3]")
	WebElement cityInTable;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[4]")
	WebElement stateInTable;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		enter(emailFieldSignIn, email);
	}
	
	public void enterPassword(String password) {
		enter(passwordFieldSignUp, password);
		}
	
	public void clickSignIn() {
		click(signInButton);
	}
	
	public void clickAddresses() {
		click(addressesLink);
	}
	
	public void clickNewAddress()	{
		click(addNewAddress);
	}
	
	public void enterFirstName(String fname) {
		enter(firstName, fname);
	}
	
	public void enterLastName(String lname) {
		enter(lastName,lname);
	}
	
	public void enterAddress1(String addr1) {
		enter(address1,addr1);
	}
	
	public void enterCity(String city) {
		enter(cityTextBox,city);
	}
	
	public void state(String methodName, String value) {
		selectFromDropdown(selectState, methodName,value);
	}
	
	public void enterZip(String txt) {
		enter(zipCode,txt);
	}
	public void country() {
		click(countryRadio);
	}
	
	public void enterAge(String text) {
		enter(age, text);
	}
	
	public void enterPhone(String ph) {
		enter(phone,ph);
	}
	
	public void selectInterest() {
		click(dancingInterestRadio);
	}
	
	public void enterNote(String txt) {
		enter(note,txt);
	}
	
	public void clickCreateAddress() {
		click(createAddressButton);
	}
	
	public void clickListLink() {
		click(listLink);
	}
	
	public String fNameTableResult() {
		return firstNameInTable.getText();
	}
	
	public String lNameTableResult() {
		return lastNameInTable.getText();
	}
	
	public String cityTableResult() {
		return cityInTable.getText();
	}
	
	public String stateTableResult() {
		return stateInTable.getText();
	}
}
	

