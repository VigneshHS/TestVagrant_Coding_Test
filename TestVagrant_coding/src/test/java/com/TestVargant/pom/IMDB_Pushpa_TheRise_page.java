package com.TestVargant.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestVargant.generic.BaseClass;

public class IMDB_Pushpa_TheRise_page {

	@FindBy(xpath = "//a[text()= \"Release date\"]/..//div")
	private WebElement Release_date;
	
	@FindBy(xpath = "//button[text()= \"Country of origin\"]/..//div")
	private WebElement Country_origin;
	
	public IMDB_Pushpa_TheRise_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRelease_date() {
		return Release_date;
	}

	public WebElement getCountry_origin() {
		return Country_origin;
	}
	
}
