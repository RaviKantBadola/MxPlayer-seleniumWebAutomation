package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.MxVdesiPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MxVdesiTest {

	private WebDriver driver;
	private String baseUrl;
	private MxVdesiPOM mxVdesiPOM;
	
	private static Properties properties;
	

	

	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	
		mxVdesiPOM = new MxVdesiPOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		
		 
		// open the browser 
		driver.get(baseUrl);
		
		
	}
	
	@Test(enabled=true)
	public void TC_144() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.verifyingveiwall();
	}

	@Test(enabled = false)
	public void TC_146() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.varifyNextButton();
	}
	
	@Test(enabled = false)
	public void TC_147() {
		
		mxVdesiPOM.clickNextButton();
	}
	
	@Test(enabled = false)
	public void TC_148() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickNextButton();
		mxVdesiPOM.verifyingPreviousButton();
		
	}
	@Test (enabled = false)
	public void TC_149() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickPreviousButton();
		
	}
	
	@Test(enabled=false)
	public void TC_150() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.verifyinghoverpopup();
	}
		
	
	@Test(enabled=false)
	public void TC_151() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopup();
	}
	@Test(enabled=false)
	public void TC_153() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverpopupplaybutton();
	}
	@Test(enabled=false)
	public void TC_155() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopupAddtolist();
	}
	@Test(enabled=true)
	public void TC_157() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopupAddmoreinfo();
	}
	
}
