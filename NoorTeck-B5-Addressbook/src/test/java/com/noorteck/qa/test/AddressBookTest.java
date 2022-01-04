package com.noorteck.qa.test;


import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;



public class AddressBookTest extends ObjInitialize {

	
	public static void main(String[] args) {
		
		String url = "http://a.testaddressbook.com/sign_up";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		
		testCaseOne();
		
				
		CommonUI.openBrowser("chrome");
		CommonUI.navigate("http://a.testaddressbook.com/sign_in");
		testCaseTwo();
		
		
		
		CommonUI.quitBrowser();
	}
	
	@Test
	public static void testCaseOne() {
		
		SoftAssert softAssert = new SoftAssert();
		signUpPage.enterEmail("afjadnio@gmail.com");
		signUpPage.enterPassword("puraTH");
		signUpPage.clickSignUp();
		
		String expTitle = "Welcome to Address Book";
		String actTitle = signUpPage.getHeaderText();
		softAssert.assertEquals(expTitle,actTitle);
		
		
		softAssert.assertAll();
	}
	@Test
	public static void testCaseTwo() {
		
		
		SoftAssert softAssert = new SoftAssert();
		
		signInPage.enterEmail("Cena.john123@gmail.com");
		signInPage.enterPassword("John12345");
		signInPage.clickSignIn();
		
		signInPage.clickAddresses();
	
		signInPage.clickNewAddress();
		signInPage.enterFirstName("John");
		signInPage.enterLastName("Cena");
		signInPage.enterAddress1("Everywhere");
		signInPage.enterCity("The world");
		signInPage.state("text", "New York");
		signInPage.enterZip("10001");
		signInPage.country();
		signInPage.enterAge("22");
		signInPage.enterPhone("123-2334-3434");
		signInPage.selectInterest();
		signInPage.enterNote("Automation is Fun");
		signInPage.clickCreateAddress();
		signInPage.clickListLink();
		String expFName = "John";
		String expLName = "Cena";
		String expCity = "The world";
		String expState = "NY";
		softAssert.assertEquals(expFName, signInPage.fNameTableResult());
		softAssert.assertEquals(expLName, signInPage.lNameTableResult());
		softAssert.assertEquals(expCity, signInPage.cityTableResult());
		softAssert.assertEquals(expState, signInPage.stateTableResult());
		
		
		softAssert.assertAll();
		
		
	}
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

