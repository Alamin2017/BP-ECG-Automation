package envSetup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClassPhoneWatch {
    public static AndroidDriver watch_driver;
    public static AndroidDriver mobile_driver;
    @BeforeSuite
    public void setup_phone() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S22 Ultra");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.UDID, "R3CRB0HZ16");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        mobile_driver = new AndroidDriver(url, cap);
        mobile_driver.installApp("C:\\Users\\amin.al\\Desktop\\certificate\\Fake_Country_App_BP_ECG_IHRN_1.2.1.005.apk");
        Thread.sleep(2000);
        System.out.println("Phone App is installed");
        Thread.sleep(2000);
    }
    @BeforeSuite
    public void setup_watch() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap2 = new DesiredCapabilities();
        cap2.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap2.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-R900");
        cap2.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap2.setCapability(MobileCapabilityType.UDID,"R3AR404VX6D");
        URL url2 = new URL("http://127.0.0.1:4724/wd/hub");
        watch_driver = new AndroidDriver(url2, cap2);
        watch_driver.installApp("C:\\Users\\amin.al\\Desktop\\certificate\\SHealthMonitor_Wear_Emulator_1.2.1.004.apk");
        Thread.sleep(2000);
        System.out.println("Watch App is installed");
        Thread.sleep(2000);
    }
    @AfterSuite
    public void uninstall_app() throws InterruptedException, IOException {
        Thread.sleep(5000);
        mobile_driver.removeApp("com.samsung.android.shealthmonitor");
        watch_driver.removeApp("com.samsung.android.shealthmonitor");
        System.out.println("App is uninstalled after test");
        Thread.sleep(2000);
    }


}
