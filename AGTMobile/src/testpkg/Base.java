package testpkg;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		File f  = new  File("src");
		File fs = new File(f,"com.companyname.Agtmovel.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emerson");
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//cap.setCapability(MobileCapabilityType.APP, "com.android.chrome");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.companyname.Agtmovel");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "md54dd1cfedfb555b4836d33d61a4f88928.SplashActivity");
		cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_DURATION, 20000);
		AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return ad;
	}

}
