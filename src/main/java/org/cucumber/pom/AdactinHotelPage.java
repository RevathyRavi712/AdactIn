package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelPage {
	public WebDriver driver;
	
	@FindBy(id="hotel_name_0")
	private WebElement hotelName;
	
	@FindBy(id="location_0")
	private WebElement locationinhotelpage;
	
	public WebElement getLocationinhotelpage() {
		return locationinhotelpage;
	}
	@FindBy(id="arr_date_0")
	private WebElement checkInDateValidation;
	
	@FindBy(id="dep_date_0")
	private WebElement checkOutDateValidation;
	
	@FindBy(id="rooms_0")
	private WebElement noOfRoomsValidation;
	
	@FindBy(id="room_type_0")
	private WebElement roomTypeValidation;
	
	@FindBy(id="no_days_0")
	private WebElement totDays;
	
	@FindBy(id="price_night_0")
	private WebElement pricePerNight;
	
	@FindBy(id="radiobutton_0")
	private WebElement selectRadioBtn;
	
	public WebElement getTotDays() {
		return totDays;
	}
	public WebElement getPricePerNight() {
		return pricePerNight;
	}
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	
	
	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getRoomTypeValidation() {
		return roomTypeValidation;
	}
	public WebElement getNoOfRoomsValidation() {
		return noOfRoomsValidation;
	}
	public WebElement getCheckInDateValidation() {
		return checkInDateValidation;
	}
	public WebElement getCheckOutDateValidation() {
		return checkOutDateValidation;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public AdactinHotelPage(WebDriver hoteldriver) {
		this.driver=hoteldriver;
		PageFactory.initElements(driver, this);
		
	}

}
