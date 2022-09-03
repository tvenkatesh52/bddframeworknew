package com.qa.ajio.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ajio.base.TestBase;


public class HomePage extends TestBase {
	
private Logger log=Logger.getLogger(HomePage.class);
	
	//createa a constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/header/div[2]/a/img")
	private WebElement ajioLogo;
	
	@FindBy(css="span.login-form.login-modal")
	private WebElement ajioSigninLink;
	
	@FindBy(xpath = "//a[contains(.,'Visit AJIOLUXE')]")
	private WebElement ajioLuxeLink;
	
	@FindBy(xpath = "//label[contains(.,'Enter Mobile Number / Email*')]")
	private WebElement continueButton;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement emailEditBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement startButton;
	
	public void verifyAjioLogo() { 
		log.info("verify the ajio logo");
		ajioLogo.isDisplayed();	
	}

	public void verifyAjioSigninLink() { 
		log.info("verify the ajio logo");
		ajioSigninLink.isDisplayed();	
	}

	public void verifyAjioLuxe() { 
		log.info("verify the ajio logo");
		ajioLuxeLink.isDisplayed();	
	}
	public LoginPage retrunPage() {
		ajioSigninLink.click();
		emailEditBox.sendKeys("6281726564");
		continueButton.click();
		startButton.click();
		
		return new LoginPage();
	}
	
    
}
