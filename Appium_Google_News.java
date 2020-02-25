import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		

	AndroidDriver<AndroidElement>  driver;
	// This file should be inside a file named src
	 File appDir = new File("src");
     File app = new File(appDir, "com.google.android.apps.magazines_v5.19.0.20011707-2020011707_Android-4.4.apk");
     
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabœilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	    return driver;
	}
	
	
