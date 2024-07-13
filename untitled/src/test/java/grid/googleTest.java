package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class googleTest {
    @Test
    public void googleTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.BROWSER_NAME,"firefox");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.34:4444"),caps);
        driver.get("https://www.google.co.in/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

}
