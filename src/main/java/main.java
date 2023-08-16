import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class main {
    public static void main(String[] args) throws InterruptedException {
//        // неявное ожидание
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // явное ожидание
//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("12345"))));
//
//        driver.get("https://google.com");
//
//        WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Найти\"]"));
//
//        input.click();

        // регистрация
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost:8080/registration");

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("natasha@mail.ru");

        Thread.sleep(1000);

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("natasha");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("49094909332299b");

        Thread.sleep(1000);

        WebElement confirmationPassword = driver.findElement(By.id("confirmationPassword"));
        confirmationPassword.sendKeys("49094909332299b");

        Thread.sleep(1000);

        WebElement input = driver.findElement(By.id("clicks"));
        input.click();

        // авторизация
        By locatorAuthorization = By.xpath("//h1[text()='Авторизация']");
        ExpectedCondition<WebElement> expectedCondition =
                ExpectedConditions.presenceOfElementLocated(locatorAuthorization);

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(expectedCondition);

        Thread.sleep(1000);

        WebElement email2 = driver.findElement(By.id("email"));
        email2.sendKeys("natasha@mail.ru");

        Thread.sleep(1000);

        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("49094909332299b");

        Thread.sleep(1000);

        WebElement input2 = driver.findElement(By.id("clicks"));
        input2.click();
    }
}
