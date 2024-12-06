package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevices{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("appium:deviceName","emulator-5554");
        config.setCapability("appium:platformVersion","13.0");
        config.setCapability("appium:appPackage","org.linphone");
        config.setCapability("appium:appActivity","org.linphone.activities.main.MainActivity");
        config.setCapability("platformName","Android");
        config.setCapability("appium:automationName","uiautomator2");
        config.setCapability("appium:autoGrantPermissions","true");
        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),config);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
