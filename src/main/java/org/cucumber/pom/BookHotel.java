package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
public WebDriver driver;

@FindBy(id="room_num_dis")
private WebElement noOfRooms;

@FindBy(id="total_days_dis")
private WebElement totDaysInBookHotelPage;

@FindBy(id="price_night_dis")
private WebElement pricePerNightInBookHotelPage;

@FindBy(id="total_price_dis")
private WebElement totPriceInBookHotePage;

public WebElement getValidHotelNameInBookHotelPage() {
	return validHotelNameInBookHotelPage;
}

public WebElement getValidLocationInBookHotePage() {
	return validLocationInBookHotePage;
}

public WebElement getValidRoomTypeInBookHotelPage() {
	return validRoomTypeInBookHotelPage;
}

@FindBy(id="gst_dis")
private WebElement gstPrice;

@FindBy(id="final_price_dis")
private WebElement finalPrice;

@FindBy(id="hotel_name_dis")
private WebElement validHotelNameInBookHotelPage;

@FindBy(id="location_dis")
private WebElement validLocationInBookHotePage;

@FindBy(id="room_type_dis")
private WebElement validRoomTypeInBookHotelPage;


public WebElement getFinalPrice() {
	return finalPrice;
}

@FindBy(id="first_name")
private WebElement firstName;

@FindBy(id="last_name")
private WebElement lastName;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement ccNo;

@FindBy(id="cc_type")
private WebElement cardType;

@FindBy(id="cc_exp_month")
private WebElement cardMonth;

@FindBy(id="cc_exp_year")
private WebElement cardYear;

@FindBy(id="cc_cvv")
private WebElement ccvNumber;

@FindBy(id="book_now")
private WebElement clickBookNow;

public WebElement getGstPrice() {
	return gstPrice;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCcNo() {
	return ccNo;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getCardMonth() {
	return cardMonth;
}

public WebElement getCardYear() {
	return cardYear;
}

public WebElement getCcvNumber() {
	return ccvNumber;
}

public WebElement getClickBookNow() {
	return clickBookNow;
}

public WebElement getNoOfRooms() {
	return noOfRooms;
}





	public WebElement getTotDaysInBookHotelPage() {
	return totDaysInBookHotelPage;
}

	public WebElement getPricePerNightInBookHotelPage() {
	return pricePerNightInBookHotelPage;
}

public WebElement getTotPriceInBookHotePage() {
	return totPriceInBookHotePage;
}

	public BookHotel(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
