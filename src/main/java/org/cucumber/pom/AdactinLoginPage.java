package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement userNameInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;
	
	@FindBy(id="login")
	private WebElement logInBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutBtn;

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getUserNameInput() {
		return userNameInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLogInBtn() {
		return logInBtn;
	}
	
	public AdactinLoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	

}
