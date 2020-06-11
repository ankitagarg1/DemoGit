package testcases;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileBy;
import pageObjectFactory.homePage;
import pageObjectFactory.preferencesPage;

public class basics2ForPO extends base{
	

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		homePage hp=new homePage(driver);
		hp.click_link_preference();
		preferencesPage pp=new preferencesPage(driver);
		pp.click_link_PreferenceDependencies();
		pp.select_chckbox();
		pp.click_link_wifisettings();
		pp.sendValue_text_wifisettings();
		pp.click_btn_OK();
		
		
		
		
	
}

}
