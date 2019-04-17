package testpkg;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
AndroidDriver <AndroidElement> ad = Capabilities();
ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//ad.findElementByXPath("//android.widget.EditText[@text='ID do utilizador...']").sendKeys("100000M16962223");
ad.findElementByAndroidUIAutomator("text(\"ID do utilizador...\")").sendKeys("100000M16962223");
ad.findElementByXPath("//android.widget.EditText[@text='Palavra Passe...']").sendKeys("ashish@123");
ad.findElementByXPath("//android.widget.Button[@text='Iniciar Sessão']").click();
	}

}
