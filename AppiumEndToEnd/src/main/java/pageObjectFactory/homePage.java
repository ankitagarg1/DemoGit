package pageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class homePage {
	public homePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Preference']")
	WebElement link_preference;
	
	@FindBy(xpath="//android.widget.TextView[@text='Text']")
	WebElement link_text;
	
	public void click_link_preference() {
		link_preference.click();
	}
		
	
	


}
