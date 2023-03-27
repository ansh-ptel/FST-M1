import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user_name']"));
        WebElement Password = driver.findElement(By.xpath("//input[@id='username_password']"));

        userName.sendKeys("admin");
        Password.sendKeys("pa$$w0rd");

        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"));
        WebElement homePage = driver.findElement(By.xpath("//a[contains(text(),'Activities')]"));
        System.out.println("Activities menu item exists: "+homePage.isDisplayed());
        driver.close();
    }
}
