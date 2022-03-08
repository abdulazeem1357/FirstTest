package step_definations;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.ThreadLocalRandom;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.signup_page;
import page_objects.users_page;

public class blog_signup_fill_steps {

    WebDriver driver = new FirefoxDriver();
    signup_page signupPage;
    users_page usersPage;
    int int_random = ThreadLocalRandom.current().nextInt();
    String username = "azeembaloch"+int_random;
    String email = "azeembaloch"+int_random+"@test.com";
    String password = "secretpassword";
    String expected_banner_text = "Welcome to the alpha blog azeembaloch"+int_random;

    @Given("User opens signup form")
    public void userOpensSignupForm() {
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        driver.get("https://selenium-blog.herokuapp.com/signup");
        signupPage = new signup_page(driver);
    }

    @When("User enter name")
    public void userEnterName() {
        signupPage.enter_username(username);
    }

    @And("User enter email")
    public void userEnterEmail() {
        signupPage.enter_email(email);
    }

    @And("User enter password")
    public void userEnterPassword() {
        signupPage.enter_password(password);
    }

    @And("User submit the form")
    public void userSubmitTheForm() {
        signupPage.submit_form();
    }

    @Then("It confirms user can sign up to the blog successfully")
    public void itConfirmsUserCanSignUpToTheBlogSuccessfully() {
        usersPage = new users_page(driver);
        String banner_text = usersPage.get_banner_text();
        assertEquals(banner_text, expected_banner_text);
    }

    @And("Close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }
}
