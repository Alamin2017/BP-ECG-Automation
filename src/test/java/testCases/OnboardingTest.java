package testCases;

import envSetup.BaseClassPhoneWatch;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.utils_phone;

public class OnboardingTest extends BaseClassPhoneWatch {

    @Test(priority = 1)
    public void tc_001() throws InterruptedException {
        Thread.sleep(2000);
        mobile_driver.activateApp("com.samsung.android.shealthmonitor");
        Thread.sleep(2000);
        mobile_driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"KR\"]")).click();
        Thread.sleep(2000);
        mobile_driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"KR\"]")).click();
        Thread.sleep(2000);
        System.out.println("Phone App Installation is done in Mobile");
        Thread.sleep(2000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title")).isDisplayed();
        System.out.println("Title is verified in phone app");
    }

    @Test(priority = 2)
    public void tc_002() throws InterruptedException {
        String elementText="Samsung Health Monitor";
        Thread.sleep(2000);
        watch_driver.activateApp("com.samsung.android.shealthmonitor");
        Thread.sleep(2000);
        utils_phone.swipe_down_watch();
        Thread.sleep(2000);
        utils_phone.swipe_up_watch();
        Thread.sleep(2000);

//        watch_driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100)"));
//        Thread.sleep(2000);
//        watch_driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100)"));
//        watch_driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void tc_003() throws InterruptedException {
        Thread.sleep(2000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_bottom_button")).click();
        Thread.sleep(2000);
        mobile_driver.findElement(By.xpath("//Switch[@content-desc=\"Off, All permissions\"]/android.widget.Switch")).click();
        Thread.sleep(2000);
        mobile_driver.findElement(By.id("com.sec.android.app.shealth:id/permission_popup_positive_button")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void tc_004() throws InterruptedException {
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/mEditTextFirstName")).sendKeys("Al");
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/mEditTextLastName")).sendKeys("Amin");
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/mEditBirthDay")).click();
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/positive_button")).click();
        Thread.sleep(1000);
        mobile_driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Male, Radio button, Not selected\"]")).click();
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/positive_button")).click();
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.samsung.android.shealthmonitor:id/mFinishButton")).click();
        Thread.sleep(1000);
        mobile_driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(1000);
    }


}
