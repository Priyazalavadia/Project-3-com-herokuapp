package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Get current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the email field element abd send the email
        WebElement emailField = driver.findElement(By.name("username"));
        //Type email to send email
        emailField.sendKeys("tomsmith");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Close the browser
       driver.close();
        // driver.quit();


    }
}

