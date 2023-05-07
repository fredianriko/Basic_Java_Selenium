// package TestLogin;


// import org.openqa.selenium.WebDriver;

public class LoginPositive {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riko\\Desktop\\OPALS\\SeleniumJava\\TestLogin\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        driver.quit();
    }
}

