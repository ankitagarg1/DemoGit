package testcases;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;



public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		//apk app info
		//each page in app has an activity
		//home page is the default or main activity
		AndroidDriver<AndroidElement> driver;
		File f=new File("src");
		File fs=new File(f,"original.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AnkitaEM");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"10");
//		if(device.equals("Emulator")) {
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AnkitaEM");
//		}
//		else if(device.equals("real")){
//			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
//		}
		
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		
	}
 
}
