package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHomePage {
	public WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement userLocation;
	
	@FindBy(id="hotels")
	private WebElement userSelectHotel;
	
	@FindBy(id="room_type")
	private WebElement userRoomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBtn;
	
	@FindBy(id="checkin_span")
	private WebElement errorValidation;

	

	public WebElement getUserLocation() {
		return userLocation;
	}

	public WebElement getUserSelectHotel() {
		return userSelectHotel;
	}

	public WebElement getUserRoomType() {
		return userRoomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getErrorValidation() {
		return errorValidation;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	public AdactinHomePage(WebDriver hdriver) {
		this.driver=hdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	

}
