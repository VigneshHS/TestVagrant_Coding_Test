package com.TestVargant.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.TestVargant.generic.BaseClass;

public class IMDB_homepage{

	@FindBy(xpath = "//input[@name = \"q\"]")
	private WebElement search_Text_Box;
	
	@FindBy(id = "suggestion-search-button")
	private WebElement search_Button;
	
	@FindBy(xpath = "(//a[text()=\"Pushpa: The Rise - Part 1\"])[1]")
	private WebElement Exact_match;
	
	public IMDB_homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch_Text_Box() {
		return search_Text_Box;
	}


	public WebElement getSearch_Button() {
		return search_Button;
	}

	public WebElement getExact_match() {
		return Exact_match;
	}
}

