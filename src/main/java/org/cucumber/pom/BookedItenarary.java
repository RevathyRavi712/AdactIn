package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenarary {
	
	public WebDriver driver;
	
	
	@FindBy(linkText="Booked Itinerary")
	private WebElement bookitinerarylink;
	
	@FindBy(id="order_id_text")
	private WebElement orderidinbookitenararypage;
	
	@FindBy(id="search_hotel_id")
	private WebElement gobtninbookitenararypage;

	public WebElement getBookitinerarylink() {
		return bookitinerarylink;
	}

	public WebElement getOrderidinbookitenararypage() {
		return orderidinbookitenararypage;
	}

	public WebElement getGobtninbookitenararypage() {
		return gobtninbookitenararypage;
	}
	
	
	
	public BookedItenarary(WebDriver bipdriver) {
		this.driver=bipdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
