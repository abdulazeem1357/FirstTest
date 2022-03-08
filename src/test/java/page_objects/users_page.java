package page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class users_page {
    WebDriver driver;

    public users_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By SUCCESS_BANNER = By.id("flash_success");

    public String get_banner_text() {
        return driver.findElement(SUCCESS_BANNER).getText();
    }

}
