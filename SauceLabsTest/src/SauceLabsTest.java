import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static final String USERNAME = "gabi1990";

	public static final String ACCESS_KEY = "a1bf8cb8-cd47-4c44-b70f-f99e12fc1970";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "85.0");
		browserOptions.setCapability("sauce:options", sauceOptions);

		WebDriver driver = new RemoteWebDriver(new URL(URL), sauceOptions);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

	}

}