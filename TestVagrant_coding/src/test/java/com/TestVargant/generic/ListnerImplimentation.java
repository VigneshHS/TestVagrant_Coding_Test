package com.TestVargant.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplimentation extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		String res = result.getTestName();
		TakesScreenshot t = (TakesScreenshot)driver;
		File screen_shot = t.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./ScreenShots/"+res+".png");
		try {
			FileUtils.copyFile(screen_shot, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	}

	
}
