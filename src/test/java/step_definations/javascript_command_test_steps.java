package step_definations;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class javascript_command_test_steps {
    WebDriver driver;

    @Given("User launches chrome browser")
    public void userLaunchesChromeBrowser() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
    }

    @And("User navigates to {string}")
    public void userNavigatesTo(String arg0) {
        driver.get("https://formy-project.herokuapp.com/modal");
    }

    @When("User click Open Modal button")
    public void userClickOpenModalButton() {
        driver.findElement(By.id("modal-button")).click();
    }

    @And("User clicks close Close button on Modal")
    public void userClicksCloseCloseButtonOnModal() {
        WebElement closeModal = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeModal);
    }

    @Then("Modal should close")
    public void modalShouldClose() {
        String header = driver.findElement(By.cssSelector("h1")).getText();
        assertEquals("Modal", header);
    }

    @And("User shut the browser")
    public void userShutTheBrowser() {
        driver.quit();
    }
}
