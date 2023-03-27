import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");

        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);
        String expectedTitle = "SuiteCRM";
        if(actualTitle.equals(expectedTitle)){
            driver.close();
            }
        else{
            System.out.println("Title is not matching");
        }
    }
}
