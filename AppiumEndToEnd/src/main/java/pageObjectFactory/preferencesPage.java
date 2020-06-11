package pageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class preferencesPage {


	public preferencesPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	WebElement link_PreferenceDependencies;
	
	@FindBy(id="android:id/checkbox")
	WebElement chckbox_wifi;
	
	@FindBy(xpath="//android.widget.TextView[@text='WiFi settings']")
	WebElement link_wifisettings;
	

	@FindBy(id="android:id/edit")
	WebElement text_wifisettings;
	
	@FindBy(id="android:id/button1")
	WebElement btn_OK;
	

	public void click_link_PreferenceDependencies() {
		link_PreferenceDependencies.click();
	}
	public void select_chckbox() {
		chckbox_wifi.click();
	}
	
	public void click_link_wifisettings() {
		link_wifisettings.click();
	}
	
	public void sendValue_text_wifisettings() {
		text_wifisettings.sendKeys("Ankita");
	}
	
	public void click_btn_OK() {
		btn_OK.click();
	}
	
}
