package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	public WebDriver driver;
	
	
	@FindBy(id="hotel_name")
	private WebElement hotelnameinconfirmpage;
	
	@FindBy(id="location")
	private WebElement locationinconfrmpage;
	
	@FindBy(id="room_type")
	private WebElement roomtypeinconfrmpage;
	
	@FindBy(id="total_rooms")
	private WebElement totroomincfrmpage;
	
	@FindBy(id="arrival_date")
	private WebElement checkindateinconfrmpage;
	
	@FindBy(id="departure_text")
	private WebElement checkoutdateconfrmpage;
	
	@FindBy(id="order_no")
	private WebElement ordernoinconfrmpage;
	
	
	public WebElement getOrdernoinconfrmpage() {
		return ordernoinconfrmpage;
	}
	public WebElement getHotelnameinconfirmpage() {
		return hotelnameinconfirmpage;
	}
	public WebElement getLocationinconfrmpage() {
		return locationinconfrmpage;
	}
	public WebElement getRoomtypeinconfrmpage() {
		return roomtypeinconfrmpage;
	}
	public WebElement getTotroomincfrmpage() {
		return totroomincfrmpage;
	}
	public WebElement getCheckindateinconfrmpage() {
		return checkindateinconfrmpage;
	}
	public WebElement getCheckoutdateconfrmpage() {
		return checkoutdateconfrmpage;
	}
	public WebElement getAdultinconfrmpage() {
		return adultinconfrmpage;
	}
	public WebElement getChildinconfrmpage() {
		return childinconfrmpage;
	}
	@FindBy(id="adults_room")
	private WebElement adultinconfrmpage;
	
	@FindBy(id="children_room")
	private WebElement childinconfrmpage;
	
	@FindBy(id="logout")
	private WebElement confrmPageLogOut;

	public WebElement getConfrmPageLogOut() {
		return confrmPageLogOut;
	}
	public BookingConfirmation(WebDriver bcdriver) {
		this.driver=bcdriver;
		PageFactory.initElements(driver, this);
	}

}
