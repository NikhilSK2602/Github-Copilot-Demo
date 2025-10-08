package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By signInButton = By.id("nav-link-accountList");
    private By emailField = By.id("ap_email");
    private By continueButton = By.id("continue");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(continueButton).click();
    }
}
