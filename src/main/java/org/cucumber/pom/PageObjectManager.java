package org.cucumber.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private AdactinLoginPage lp;
	private AdactinHomePage hp;
	private AdactinHotelPage hlp;
	private BookHotel bhp;
	private BookingConfirmation bcp;
	private BookedItenarary bip;

	public BookedItenarary getBip() {
		
		if (bip==null) {
			bip=new BookedItenarary(driver);
			
		}
		return bip;
	}

	public BookingConfirmation getBcp() {
		if (bcp==null) {
			bcp=new BookingConfirmation(driver);
		}
		return bcp;
	}

	public BookHotel getBhp() {
		if (bhp==null) {
			bhp=new BookHotel(driver);
			
		}
		return bhp;
	}

	public AdactinLoginPage getLp() {
		
		if (lp==null) {
			lp=new AdactinLoginPage(driver);
			
		}
		return lp;
	}
	
	public AdactinHotelPage getHlp() {
		
		if (hlp==null) {
			hlp=new AdactinHotelPage(driver);
			
		}
		return hlp;
	}

	public AdactinHomePage getHp() {
		
		if (hp==null) {
			hp=new AdactinHomePage(driver);
			
		}
		return hp;
	}

	public PageObjectManager(WebDriver pdriver) {
		this.driver=pdriver;
	}
	

}
