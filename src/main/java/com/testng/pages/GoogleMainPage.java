package com.testng.pages;

import org.openqa.selenium.WebDriver;

import com.testng.base.BasePage;
import com.testng.util.Constants;
import com.testng.util.ElementUtil;

public class GoogleMainPage extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	
	public GoogleMainPage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.HOME_PAGE_TITLE);
		
	}

}
