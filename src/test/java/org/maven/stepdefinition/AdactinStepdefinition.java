package org.maven.stepdefinition;

import org.apache.commons.collections4.map.Flat3Map;
import org.cucumber.pom.PageObjectManager;
import org.junit.Assert;
import org.maven.baseclass.BaseClass;
import org.maven.runner.AdactinTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.IFactoryAnnotation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepdefinition extends BaseClass{
	public static WebDriver driver=AdactinTestRunner.driver;
public static PageObjectManager pm=new PageObjectManager(driver);	
public static String hotelNameInput;
public static String chechInInput;
public static String checkOutInput;
public static String noOfRoomsInput;
public static String roomTypeDD;


	
	@Given("^User should launch the browser and navigate to Adactin application$")
	public void user_should_launch_the_browser_and_navigate_to_Adactin_application() throws Throwable        {
	    getUrl("http://adactin.com/HotelAppBuild2/");
	    
	}

	@When("^User enter the userName in the loginpage$")
	public void user_enter_the_userName_in_the_loginpage()  {
	    inputValuestoElement(pm.getLp().getUserNameInput(), "RevathyRavi");
	    
	}

	@When("^User enter the password in the loginpage$")
	public void user_enter_the_password_in_the_loginpage()  {
	    inputValuestoElement(pm.getLp().getPasswordInput(), "password");
	    
	}

	@When("^User click on login button in the login page$")
	public void user_click_on_login_button_in_the_login_page()  {
	    elementClick(pm.getLp().getLogInBtn());
	    
	}

	@When("^User click on logout button$")
	public void user_click_on_logout_button()  {
		elementClick(pm.getLp().getLogOutBtn());
	}
	@When("^User select the location in the home page using drop down$")
	public void user_select_the_location_in_the_home_page_using_drop_down()  {
		elementClick(pm.getHp().getUserLocation());
		selectValuesfromDD(pm.getHp().getUserLocation(), "index", "1");
	    
	    
	}

	@When("^User select the hotel in the home page using drop down$")
	public void user_select_the_hotel_in_the_home_page_using_drop_down()  {
		elementClick(pm.getHp().getUserSelectHotel());
	    selectValuesfromDD(pm.getHp().getUserSelectHotel(), "index", "1");
	    
	}

	@When("^User Select the room type in the home page using drop down$")
	public void user_Select_the_room_type_in_the_home_page_using_drop_down()  {
	    selectValuesfromDD(pm.getHp().getUserRoomType(), "index", "1");
	    
	}

	@When("^User select the no of rooms type in the home page using drop down$")
	public void user_select_the_no_of_rooms_type_in_the_home_page_using_drop_down()  {
	    selectValuesfromDD(pm.getHp().getNoOfRooms(), "index", "1");
	    
	}

@When("^User select the Hotel Creek using drop down in the home page$")
public void user_select_the_Hotel_Creek_using_drop_down_in_the_home_page()  {
	selectValuesfromDD(pm.getHp().getUserSelectHotel(), "index", "1");
	 hotelNameInput = getElementTextAttribute(pm.getHp().getUserSelectHotel());
	System.out.println(hotelNameInput);
	
}


	@When("^User enter the check in date in the homepage$")
	public void user_enter_the_check_in_date_in_the_homepage()  {
	    inputValuestoElement(pm.getHp().getCheckInDate(), "21/03/2019");
	    
	}

	@When("^User enter the check out date in the homepage$")
	public void user_enter_the_check_out_date_in_the_homepage()  {
	    inputValuestoElement(pm.getHp().getCheckOutDate(), "19/03/2019");
	    
	}

	@When("^User select the adults room in the home page$")
	public void user_select_the_adults_room_in_the_home_page()  {
	    selectValuesfromDD(pm.getHp().getAdultRoom(), "index", "1");
	    
	}

	@When("^User select the children room in the homepage$")
	public void user_select_the_children_room_in_the_homepage()  {
	    selectValuesfromDD(pm.getHp().getChildRoom(), "index", "1");
	    
	}

	@When("^User click on search button$")
	public void user_click_on_search_button()  {
	    elementClick(pm.getHp().getSearchBtn());
	    
	}

	@Then("^User validate the error message$")
	public void user_validate_the_error_message()  {
	    String errorvalidation = getElementText(pm.getHp().getErrorValidation());
	    Assert.assertEquals("Check-In Date shall be before than Check-Out Date", errorvalidation);
	}
	
	@When("^User enter the past check in date in the homepage$")
	public void user_enter_the_past_check_in_date_in_the_homepage()  {
		inputValuestoElement(pm.getHp().getCheckInDate(), "12/03/2019");
		
	}

	@When("^User enter the past check out date in the homepage$")
	public void user_enter_the_past_check_out_date_in_the_homepage()  {
		inputValuestoElement(pm.getHp().getCheckOutDate(), "10/03/2019");
	}
	@When("^User wait for '(.*)' seconds$")
	public void user_wait_for_seconds(int arg1) throws InterruptedException   {
	    Thread.sleep(arg1*1000);
	    
	}

	@When("^User enter the today check in date in the homepage$")
	public void user_enter_the_today_check_in_date_in_the_homepage()  {
	    inputValuestoElement(pm.getHp().getCheckInDate(), "14/03/2019");
	    
	}

	@When("^User enter the tomorow check out date in the homepage$")
	public void user_enter_the_tomorow_check_out_date_in_the_homepage()  {
	    inputValuestoElement(pm.getHp().getCheckOutDate(), "15/03/2019");
	    
	}
	@When("^User select no children room in the homepage$")
	public void user_select_no_children_room_in_the_homepage()  {
		elementClick(pm.getHp().getChildRoom());
		selectValuesfromDD(pm.getHp().getChildRoom(), "index", "0");
	}

	@Then("^User validate the hotel name  validation$")
	public void user_validate_the_hotel_name_validation()  {
		String hotelNameValidation = getElementTextAttribute(pm.getHlp().getHotelName());
		Assert.assertEquals(hotelNameInput, hotelNameValidation);
		System.out.println(hotelNameValidation);
		
	}
	
	@When("^User enter the crt today check in date in the homepage$")
	public void user_enter_the_crt_today_check_in_date_in_the_homepage()  {
		inputValuestoElement(pm.getHp().getCheckInDate(), "14/03/2019");
		chechInInput = getElementTextAttribute(pm.getHp().getCheckInDate());
		System.out.println(chechInInput);
	}

	@When("^User enter the crt tomorow check out date in the homepage$")
	public void user_enter_the_crt_tomorow_check_out_date_in_the_homepage()  {
		inputValuestoElement(pm.getHp().getCheckOutDate(), "15/03/2019");
		checkOutInput = getElementTextAttribute(pm.getHp().getCheckOutDate());
		System.out.println(checkOutInput);
	}

	@Then("^User validate the check in date validation$")
	public void user_validate_the_check_in_date_validation()  {
		String checkInValidation = getElementTextAttribute(pm.getHlp().getCheckInDateValidation());
		Assert.assertEquals(chechInInput, checkInValidation);
		System.out.println(checkInValidation);
		
	}

	@Then("^User Validate the check out date validation$")
	public void user_Validate_the_check_out_date_validation()  {
		String checkOutValidation = getElementTextAttribute(pm.getHlp().getCheckOutDateValidation());
		Assert.assertEquals(checkOutInput, checkOutValidation);
		System.out.println(checkOutValidation);
}
	@When("^User select the no of rooms type in the home page using drop down '(\\d+)'$")
	public void user_select_the_no_of_rooms_type_in_the_home_page_using_drop_down(String arg1)  {
		elementClick(pm.getHp().getNoOfRooms());
		selectValuesfromDD(pm.getHp().getNoOfRooms(), "index", arg1);
		
	}
	
	
	  @Then("^User verify the no of rooms that reflected according to the no of rooms selected '(\\d+)'$") 
	  public void user_verify_the_no_of_rooms_that_reflected_according_to_the_no_of_rooms_selected (String arg1) { 
	  String noOfRoomsValidation = getElementTextAttribute(pm.getHlp().getNoOfRoomsValidation()); 
	  if (noOfRoomsValidation.contains(arg1)) {
	 System.out.println("No Of Rooms are same");
	  }else {
	 System.out.println("No of Rooms are not same"); 
	  }
	
	}
	@When("^User Select the deluxe room type in the home page using drop down$")
	public void user_Select_the_deluxe_room_type_in_the_home_page_using_drop_down()  {
		elementClick(pm.getHp().getUserRoomType());
		selectValuesfromDD(pm.getHp().getUserRoomType(), "index", "3");
		 roomTypeDD = getElementTextAttribute(pm.getHp().getUserRoomType());
		System.out.println(roomTypeDD);
	}

	@Then("^User verify the deluxe that reflected according to the room type in the hotel page$")
	public void user_verify_the_deluxe_that_reflected_according_to_the_room_type_in_the_hotel_page()  {
		String roomTypeValidation = getElementTextAttribute(pm.getHlp().getRoomTypeValidation());
		Assert.assertEquals(roomTypeDD, roomTypeValidation);
		System.out.println(roomTypeValidation);
		
	}

	@When("^User select the (\\d+) no of rooms  in the home page using drop down$")
	public void user_select_the_no_of_rooms_in_the_home_page_using_drop_down(int arg1)  {
	    elementClick(pm.getHp().getNoOfRooms());
	    selectValuesfromDD(pm.getHp().getNoOfRooms(),"index","2" );
	    
	}

	@When("^User click the radio button in the hotel page$")
	public void user_click_the_radio_button_in_the_hotel_page()  {
	    elementClick(pm.getHlp().getSelectRadioBtn());
	    
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button()  {
		elementClick(pm.getHlp().getContinueBtn());
	    
	    
	}
	@Then("^User Verify that totalprice excluding GST '(\\d+)'$")
	public void user_Verify_that_totalprice_excluding_GST(String arg1) throws Throwable {
		
			String pricePerNight = getElementTextAttribute(pm.getBhp().getPricePerNightInBookHotelPage());
			String prcePerNight = pricePerNight.substring(5).trim();
			String totDays = getElementTextAttribute(pm.getBhp().getTotDaysInBookHotelPage());
			String sepTotDays = totDays.substring(0,1).trim();
			String totPrice = getElementTextAttribute(pm.getBhp().getTotPriceInBookHotePage());
			int totalPrice = Integer.parseInt(arg1)*Integer.parseInt(prcePerNight)*Integer.parseInt(sepTotDays);
			String tp = String.valueOf(totalPrice);
			if (totPrice.contains(tp)) {
				System.out.println("Total price are same");
			}else {
				System.out.println("Total price are not same");
			}	
		
	}

	
    @When("^User enter the first name$")
	public void user_enter_the_first_name()  {
	    inputValuestoElement(pm.getBhp().getFirstName(), "Revathy");
	    
	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name()  {
	    inputValuestoElement(pm.getBhp().getLastName(), "Ravi");
	    
	}

	@When("^User enter the billing address$")
	public void user_enter_the_billing_address()  {
	    inputValuestoElement(pm.getBhp().getAddress(), "No:12,BellyArea,AnnaNagar,Chennai-600001");
	    
	}

	@When("^User enter the credit card number$")
	public void user_enter_the_credit_card_number()  {
	    inputValuestoElement(pm.getBhp().getCcNo(), "7894561235489789");
	    
	}

	@When("^User select the credit card type using drop down$")
	public void user_select_the_credit_card_type_using_drop_down()  {
	    elementClick(pm.getBhp().getCardType());
	    selectValuesfromDD(pm.getBhp().getCardType(), "index", "1");
	    
	    
	}

	@When("^User select the credit card expiry month$")
	public void user_select_the_credit_card_expiry_month()  {
	    elementClick(pm.getBhp().getCardMonth());
	    selectValuesfromDD(pm.getBhp().getCardMonth(), "index", "1");
	    
	}

	@When("^User select the credit card expiry year$")
	public void user_select_the_credit_card_expiry_year()  {
	    elementClick(pm.getBhp().getCardYear());
	    selectValuesfromDD(pm.getBhp().getCardYear(), "index", "12");
	    
	}

	@When("^User enter the ccv number$")
	public void user_enter_the_ccv_number()  {
	    inputValuestoElement(pm.getBhp().getCcvNumber(), "234");
	    
	}

	@When("^User click on book now button$")
	public void user_click_on_book_now_button()  {
	    elementClick(pm.getBhp().getClickBookNow());
	    
	}


@When("^User click on book confirmation page logout button$")
public void user_click_on_book_confirmation_page_logout_button()  {
	elementClick(pm.getBcp().getConfrmPageLogOut());
	
}

@Then("^Verify that total-price is being calculated including GST '(\\d+)'$")
public void verify_that_total_price_is_being_calculated_including_GST(String arg1)  {
	String pricePerNight = getElementTextAttribute(pm.getBhp().getPricePerNightInBookHotelPage());
	String prcePerNight = pricePerNight.substring(5).trim();
	String totDays = getElementTextAttribute(pm.getBhp().getTotDaysInBookHotelPage());
	String sepTotDays = totDays.substring(0,1).trim();
	String totPrice = getElementTextAttribute(pm.getBhp().getTotPriceInBookHotePage());


}
@When("^User select the location in the home page using drop down '\"([^\"]*)\"'$")
public void user_select_the_location_in_the_home_page_using_drop_down(String arg1) throws Throwable {
	elementClick(pm.getHp().getUserLocation());
	selectValuesfromDD(pm.getHp().getUserLocation(), "visibletext", arg1);
	
}

@When("^User select the Hotel using drop down in the home page '\"([^\"]*)\"'$")
public void user_select_the_Hotel_using_drop_down_in_the_home_page(String arg1) throws Throwable {
	elementClick(pm.getHp().getUserSelectHotel());
	selectValuesfromDD(pm.getHp().getUserSelectHotel(), "visibletext", arg1);
}

@When("^User Select the room type in the home page using drop down '\"([^\"]*)\"'$")
public void user_Select_the_room_type_in_the_home_page_using_drop_down(String arg1) throws Throwable {
	elementClick(pm.getHp().getUserRoomType());
	selectValuesfromDD(pm.getHp().getUserRoomType(), "visibletext", arg1);
}

@Then("^User Verify that total data are same in booking confirmation page '(\\d+)' 'AUD \\$ (\\d+)' '(\\d+)' '\"([^\"]*)\"' '\"([^\"]*)\"' '\"([^\"]*)\"'$")
public void user_Verify_that_total_data_are_same_in_booking_confirmation_page_AUD_$(int arg1, int arg2, int arg3, String arg4, String arg5, String arg6) throws Throwable {

String locationtxtbookhotelpage = getElementTextAttribute(pm.getBhp().getValidLocationInBookHotePage());
Assert.assertEquals(arg4, locationtxtbookhotelpage);
System.out.println("LOCATION ARE SAME");

String noofroomsbookhotelpage = getElementTextAttribute(pm.getBhp().getNoOfRooms());
String noofroomvalidation = noofroomsbookhotelpage.substring(0,1);
if (noofroomvalidation.contains(String.valueOf(arg3))) {
	System.out.println("NO OF ROOMS ARE SAME");
}
else {
	System.out.println("NO OF ROOMS ARE NOT SAME");
}


String totdaysvalidation = getElementTextAttribute(pm.getBhp().getTotDaysInBookHotelPage());
String totdayactual = totdaysvalidation.substring(0,1);
if (totdayactual.contains(String.valueOf(arg1))) {
	System.out.println(" NO OF DAYS ARE SAME");
}
else {
	System.out.println("NO OF DAYS ARE NOT SAME");
}

String prcepernight = getElementTextAttribute(pm.getBhp().getPricePerNightInBookHotelPage());
String prcepernightactual = prcepernight.substring(5).trim();
if (prcepernightactual.contains(String.valueOf(arg2))) {
	System.out.println("PRICE PER NIGHT ARE SAME");
}
else {
	System.out.println("PRICE PER NIGHT ARE NOT SAME");
}


String roomtypeactual = getElementTextAttribute(pm.getBhp().getValidRoomTypeInBookHotelPage());
Assert.assertEquals(arg6, roomtypeactual);
System.out.println("ROOM TYPE ARE SAME");

String hotelname = getElementTextAttribute(pm.getBhp().getValidHotelNameInBookHotelPage());
Assert.assertEquals(arg5, hotelname);
System.out.println("HOTEL NAME ARE SAME");
}


@Then("^User verify that total-price is being calculated as final price'(\\d+)'$")
public void user_verify_that_total_price_is_being_calculated_as_final_price(float arg1) throws Throwable {
String finalpriceinbookhotelpage = getElementTextAttribute(pm.getBhp().getFinalPrice());
String finalprcesubstring = finalpriceinbookhotelpage.substring(5).trim();
String totprice = getElementTextAttribute(pm.getBhp().getTotPriceInBookHotePage());
String totpricesubstrng = totprice.substring(5).trim();
float floattotprice = Float.parseFloat(totpricesubstrng);
float gst =floattotprice/10;

String pricePerNight = getElementTextAttribute(pm.getBhp().getPricePerNightInBookHotelPage());
String prcePerNight = pricePerNight.substring(5).trim();
float floatprcepernight = Float.parseFloat(prcePerNight);
String totDays = getElementTextAttribute(pm.getBhp().getTotDaysInBookHotelPage());
String sepTotDays = totDays.substring(0,1).trim();
float floattotdays = Float.parseFloat(sepTotDays);
String totPrice = getElementTextAttribute(pm.getBhp().getTotPriceInBookHotePage());

float totprce1=arg1*floatprcepernight*floattotdays;
 float tp=totprce1+gst;
String valueOf = String.valueOf(tp);
if (finalprcesubstring.contains(valueOf)) {
	System.out.println("FINAL PRICE ARE SAME");
}else {
	System.out.println("FINAL PRICE ARE NOT SAME");
}

	
}
@When("^User enter the crt today check in date in the homepage '\"([^\"]*)\"'$")
public void user_enter_the_crt_today_check_in_date_in_the_homepage(String arg1) throws Throwable {
	inputValuestoElement(pm.getHp().getCheckInDate(), arg1);
	}

@When("^User enter the crt tomorow check out date in the homepage '\"([^\"]*)\"'$")
public void user_enter_the_crt_tomorow_check_out_date_in_the_homepage(String arg1) throws Throwable {
	inputValuestoElement(pm.getHp().getCheckOutDate(), arg1);
}

@When("^User select the adults room in the home page '(\\d+)'$")
public void user_select_the_adults_room_in_the_home_page(String arg1) throws Throwable {
	elementClick(pm.getHp().getAdultRoom());
	selectValuesfromDD(pm.getHp().getAdultRoom(), "index", arg1);
}


@Then("^User Verify that total data are same in booking confirmation page '(\\d+)' '\"([^\"]*)\"' '\"([^\"]*)\"' '\"([^\"]*)\"' '\"([^\"]*)\"' '(\\d+)' '\"([^\"]*)\"'$")
public void user_Verify_that_total_data_are_same_in_booking_confirmation_page(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {

	String hntextinconfrmpage = getElementTextAttribute(pm.getBcp().getHotelnameinconfirmpage());
    Assert.assertEquals(arg2, hntextinconfrmpage);
    System.out.println("HOTEL NAME ARE SAME");
    
    String rttextinconfrmpage = getElementTextAttribute(pm.getBcp().getRoomtypeinconfrmpage());
    Assert.assertEquals(arg3, rttextinconfrmpage);
    System.out.println("ROOM TYPE ARE SAME");
    
    String totroominconfrmpage = getElementTextAttribute(pm.getBcp().getTotroomincfrmpage());
    if (totroominconfrmpage.contains(String.valueOf(arg1))) {
        System.out.println("NO OF ROOMS ARE SAME");
        }else {
            System.out.println("NO OF ROOMS ARE NOT SAME");

		}
    
    String checkindateconfrmpage = getElementTextAttribute(pm.getBcp().getCheckindateinconfrmpage());
    Assert.assertEquals(arg4, checkindateconfrmpage);
    System.out.println("CHECK IN DATE ARE SAME");
    
    String checkoutdateinconfrmpage = getElementTextAttribute(pm.getBcp().getCheckoutdateconfrmpage());
    Assert.assertEquals(arg5, checkoutdateinconfrmpage);
    System.out.println("Check out date are same");
    
    String adultinconfrmpage = getElementTextAttribute(pm.getBcp().getAdultinconfrmpage());
    if (adultinconfrmpage.contains(String.valueOf(arg6))) {
        System.out.println("Adult are same");

	}else {
	    System.out.println("Adult are not same ");

	}
    
    
    String childroominconfrmpage = getElementTextAttribute(pm.getBcp().getChildinconfrmpage());
    String cr = childroominconfrmpage.substring(0);
if (arg7.contains((cr))) {
	System.out.println("Children Room are same");
}else {
	System.out.println("Children Room are not same");
}
}

@Then("^User confirm the order no is generated or not$")
public void user_confirm_the_order_no_is_generated_or_not() throws Throwable {
	String orderno = getElementTextAttribute(pm.getBcp().getOrdernoinconfrmpage());
	if (orderno!=null) {
		System.out.println("ORDER NO IS GENERATED");
	}else {
		System.out.println("ORDER NO IS NOT GENERATOR");
	}
	
}












}





	
	
	


