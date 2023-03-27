import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"admin_options\"]"));
        System.out.println("First Copyright text: "+Element.getText());
        driver.close();
    }
}