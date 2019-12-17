package com.testng.tests;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testng.base.BasePage;
import com.testng.pages.GoogleMainPage;
import com.testng.util.Constants;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(com.testng.listeners.ExtentReportListener.class)




public class GoogleMainPageTest {
	
	Logger log=Logger.getLogger("GoogleMainPageTest");
	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	GoogleMainPage googleMainPage;
	
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		log.info("browser is launching");
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		googleMainPage= new GoogleMainPage(driver);
		log.info("Setup config");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test(description="Google main page title")
	@Description("Google main page title...")
	@Severity(SeverityLevel.CRITICAL)
	public void getTitle(){
		String title = googleMainPage.getHomePageTitle();
		System.out.println("Page title is: "+ title);
		log.info("Getting title Google");
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
		log.info("Assert title...");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
