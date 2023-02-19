package com.TestVargant.TestScript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TestVargant.generic.BaseClass;
import com.TestVargant.generic.FileLib;
import com.TestVargant.pom.IMDB_Pushpa_TheRise_page;
import com.TestVargant.pom.IMDB_homepage;
import com.TestVargant.pom.Wiki_homepage;
import com.TestVargant.pom.wiki_Pushpa_TheRise_page;


public class get_Pushpa_Details extends BaseClass {
	String wiki_Release_date;
	String wiki_Coutry_origin;
	String IMDB_Release_date;
	String IMDB_Coutry_origin;
	
	SoftAssert s = new SoftAssert();
	FileLib f = new FileLib();
	@Test(priority = 1)
	public void get_Wiki_details() throws IOException, InterruptedException {
		
		Wiki_homepage wiki_Wiki_homePage_ref = new Wiki_homepage(driver);
		wiki_Pushpa_TheRise_page PushpaPage_ref = new wiki_Pushpa_TheRise_page(driver);
		
		
		driver.get(f.getPropertyData("Wiki_URL"));
		
		 wiki_Wiki_homePage_ref.getSearch_Text_box().sendKeys("Pushpa: The Rise");
		 wiki_Wiki_homePage_ref.getSearch_submit_button().click();
		 
		  wiki_Release_date = PushpaPage_ref.getRelease_date().getText();
		  wiki_Coutry_origin = PushpaPage_ref.getCountry_origin().getText();
		 
		Reporter.log(wiki_Release_date);
		Reporter.log(wiki_Coutry_origin);
	}
		
		@Test(priority = 2)
		public void get_IMDB_details() throws IOException, InterruptedException {
		
		driver.get(f.getPropertyData("IMDB_URL"));
		
		IMDB_homepage IMDB_home_ref = new IMDB_homepage(driver);
		IMDB_Pushpa_TheRise_page IMDB_Pushpa_ref = new IMDB_Pushpa_TheRise_page(driver);

		IMDB_home_ref.getSearch_Text_Box().sendKeys("Pushpa: The Rise");
		IMDB_home_ref.getSearch_Button().click();
		IMDB_home_ref.getExact_match().click();
		
		 IMDB_Release_date = IMDB_Pushpa_ref.getRelease_date().getText();
		 IMDB_Coutry_origin = IMDB_Pushpa_ref.getCountry_origin().getText();
		
		Reporter.log(IMDB_Release_date);
		Reporter.log(IMDB_Coutry_origin);
	
		}
		
		@Test(priority = 3)
		public void comapre_Details(){
		s.assertEquals(wiki_Coutry_origin, IMDB_Coutry_origin );
		s.assertEquals(wiki_Release_date, IMDB_Release_date );
		s.assertAll();
		}
}
	



