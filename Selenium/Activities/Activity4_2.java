import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");

        String PageTitle = driver.getTitle();
        System.out.println("Title of the page is: "+PageTitle);

        WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));

        Firstname.sendKeys("Kiran");
        Lastname.sendKeys("venkat");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kiran@test.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9493116755");

        driver.findElement(By.xpath("//textarea")).sendKeys("Sample");

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

    }
}
