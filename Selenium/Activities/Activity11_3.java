import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String PageTitle = driver.getTitle();
        System.out.println("Title of the page is: " + PageTitle);

        System.out.println("Page title is: " + driver.getTitle());
        driver.findElement(By.cssSelector("button#prompt")).click();

        Alert promptAlert = driver.switchTo().alert();

        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);

        promptAlert.sendKeys("Awesome!");

        promptAlert.accept();

        driver.close();
    }
}