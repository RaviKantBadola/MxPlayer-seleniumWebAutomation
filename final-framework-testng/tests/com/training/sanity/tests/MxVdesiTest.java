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
	public void Veiwall() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.verifyingveiwall();
	}
	
	
	@Test(enabled = false)
	public void clickNextButton() {
		
		mxVdesiPOM.clickNextButton();
	}
	@Test(enabled = false)
	public void verifyingNextButton() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.varifyNextButton();
	}
	@Test (enabled = false)
	public void clickonPreviosButton() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickPreviousButton();
		
	}
	@Test(enabled = false)
	public void verifyingPreviousButton() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.clickNextButton();
		mxVdesiPOM.verifyingPreviousButton();
		
	}
	@Test(enabled=false)
	public void verifyinghoverandpopup() {
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.verifyinghoverpopup();
	}
		
	
	@Test(enabled=false)
	public void Hoverandpopout() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopup();
	}
	@Test(enabled=false)
	public void Hoverandpopoutplaybutton() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverpopupplaybutton();
	}
	@Test(enabled=false)
	public void Hoverandpopoutaddtomylist() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopupAddtolist();
	}
	@Test(enabled=true)
	public void Hoverandpopompr() throws InterruptedException {
		
		mxVdesiPOM.clickMxVDesi();
		mxVdesiPOM.hoverandpopupAddmoreinfo();
	}
	
}
