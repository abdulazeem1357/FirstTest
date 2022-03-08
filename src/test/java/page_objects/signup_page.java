package page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class signup_page {
    WebDriver driver;

    public signup_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By USERNAME_FIELD = By.id("user_username");
    By EMAIL_FIELD = By.id("user_email");
    By PASSWORD_FIELD = By.id("user_password");
    By SUBMIT_BUTTON = By.id("submit");

    public void enter_username(String username) {
        driver.findElement(USERNAME_FIELD).sendKeys(username);
    }

    public void enter_email(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    public void enter_password(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void submit_form() {
        driver.findElement(SUBMIT_BUTTON).click();
    }

}
