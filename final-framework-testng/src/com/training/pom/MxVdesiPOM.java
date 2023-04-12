package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MxVdesiPOM {
	private WebDriver driver; 
	
	public MxVdesiPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='ht_title '])[4]")
	private WebElement MxVDesi; 
	@FindBy(xpath="//h2[@class='h1-heading cs__header-title']")
	private WebElement Viewall;
	@FindBy(xpath = "(//div[@class='next-btn hc__nav-btn'])[1]")
	private WebElement validateNextButton;
	
	@FindBy(xpath = "(//div[@class='next-btn hc__nav-btn'])[1]")
	private WebElement verifyingNextButton;
	
	@FindBy(xpath="(//div[@class='prev-btn hc__nav-btn'])[1]")
	private WebElement PreviousButton; 
	@FindBy(xpath="(//div[@class='prev-btn hc__nav-btn'])[1]")
	private WebElement verifyingPreviousButton; 
	@FindBy(xpath="(//img[contains(@class,'original-image')])[16]")
	private WebElement Hoverandpopup;
	@FindBy(xpath="(//img[contains(@class,'original-image')])[16]")
	private WebElement verifyinghoverpopup;
	
	public void clickMxVDesi() {
		
		this.MxVDesi.click();
		
	}
	
	public void verifyingveiwall() {
		Actions ac=new Actions(this.driver);
		
		ac.moveToElement(this.Viewall).build().perform();
	}
	public void clickNextButton() {
		this.validateNextButton.click();
	}
	
	public void varifyNextButton() {
		this.verifyingNextButton.isDisplayed();
	}
	
	public void clickPreviousButton() {
		this.PreviousButton.click();
	}
	public void verifyingPreviousButton() {
		this.verifyingPreviousButton.isDisplayed();
	}
	public void verifyinghoverpopup() {
		
	}
public void verifyinghover(){
		
		Actions ac=new Actions(this.driver);
		
		ac.moveToElement(this.verifyinghoverpopup).build().perform();
		this.verifyinghoverpopup.isDisplayed();
		}

	public void hoverandpopup() throws InterruptedException {
		
		Actions ac=new Actions(this.driver);
	
		ac.moveToElement(this.Hoverandpopup).build().perform();
		
	}
	
	public void hoverpopupplaybutton() {
		Actions ac=new Actions(this.driver);
		
		ac.moveToElement(this.Hoverandpopup).build().perform();
		this.driver.findElement(By.xpath("(//button[contains(text(),'Play')])[1]")).click();
	}
	public void hoverandpopupAddtolist() {
		Actions ac=new Actions(this.driver);
		
		ac.moveToElement(this.Hoverandpopup).build().perform();
		this.driver.findElement(By.xpath("//div[@class='add-to-mylist hc-atwl']")).click();
	}
	public void hoverandpopupAddmoreinfo() {
		Actions ac=new Actions(this.driver);
		
		ac.moveToElement(this.Hoverandpopup).build().perform();
		this.driver.findElement(By.xpath("(//a[@class='hc-info-icon '])[1]")).click();
	}
	
}
	
