import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginPositive {
    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        System.setProperty("webdriver.chrome.driver", "C:/Users/CTAS039/Desktop/JAVA_Selenium");
        ChromeDriver driver = new ChromeDriver(); 

        // Maximize the window and navigate to the login page
        // driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/login");

        // Enter the username and password and submit the form
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();

        // Wait for the login to complete and then close the browser
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.quit();
    }
}

