import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        String PageTitle = driver.getTitle();
        System.out.println("Title of the page is: " + PageTitle);

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a")).click();

        System.out.println("Title is: "+driver.getTitle());

        driver.close();
    }
}
