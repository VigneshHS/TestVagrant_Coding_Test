package com.TestVargant.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestVargant.generic.BaseClass;

public class Wiki_homepage {

	@FindBy(id = "searchInput")
	private WebElement Search_Text_box;
	
	@FindBy(xpath = "//button[@type= \"submit\"]")
	private WebElement Search_submit_button;
	
	public Wiki_homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch_Text_box() {
		return Search_Text_box;
	}

	public WebElement getSearch_submit_button() {
		return Search_submit_button;
	}
	
}
