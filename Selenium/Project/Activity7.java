import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sales')])[1]")).click();
        driver.findElement(By.xpath("((//a[contains(text(),'Sales')])[1])//parent::span[1]/ul/li/a[contains(text(),'Leads')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Leads')]")));
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/span/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")));
        String phoneNum = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")).getText();
        System.out.println("Phone Number is: " + phoneNum);
        driver.close();
    }
}