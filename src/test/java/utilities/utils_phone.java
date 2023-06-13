package utilities;
import envSetup.BaseClassPhoneWatch;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import java.io.IOException;
import java.time.Duration;
public class utils_phone extends BaseClassPhoneWatch {

    public static void swipe_down_phone() {
        AndroidTouchAction touchAction = new AndroidTouchAction((PerformsTouchActions) mobile_driver);
        Dimension dimension = mobile_driver.manage().window().getSize();
        int start_x = (int) (dimension.width) / 2;
        int start_y = (int) (dimension.height * 8) / 9;
        int end_x = (int) (dimension.width) / 2;
        int end_y = (int) (dimension.height) / 9;
        touchAction.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
    }
    public static void swipe_up_phone() {
        AndroidTouchAction touchAction = new AndroidTouchAction((PerformsTouchActions) mobile_driver);
        Dimension dimension = mobile_driver.manage().window().getSize();
        int start_x = (int) (dimension.width) / 2;
        int start_y = (int) (dimension.height * 2) / 9;
        int end_x = (int) (dimension.width) / 2;
        int end_y = (int) (dimension.height * 8) / 9;
        touchAction.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
    }
    public static void swipe_down_watch() {
        AndroidTouchAction touchAction = new AndroidTouchAction((PerformsTouchActions) watch_driver);
        Dimension dimension = watch_driver.manage().window().getSize();
        int start_x = (int) (dimension.width) / 2;
        int start_y = (int) (dimension.height * 8) / 9;
        int end_x = (int) (dimension.width) / 2;
        int end_y = (int) (dimension.height) / 9;
        touchAction.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
    }
    public static void swipe_up_watch() {
        AndroidTouchAction touchAction = new AndroidTouchAction((PerformsTouchActions) watch_driver);
        Dimension dimension = watch_driver.manage().window().getSize();
        int start_x = (int) (dimension.width) / 2;
        int start_y = (int) (dimension.height * 2) / 9;
        int end_x = (int) (dimension.width) / 2;
        int end_y = (int) (dimension.height * 8) / 9;
        touchAction.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
    }
    public static void HOME_Key() throws IOException, InterruptedException {
        String cmd = "adb shell input keyevent 3";
        Runtime.getRuntime().exec(cmd);
        Thread.sleep(3000);
    }
    public static void App_Switch_Key() throws IOException, InterruptedException {
        String cmd = "adb shell input keyevent 187";
        Runtime.getRuntime().exec(cmd);
        Thread.sleep(3000);
    }

}
