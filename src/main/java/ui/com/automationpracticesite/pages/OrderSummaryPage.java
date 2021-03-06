package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {

    private final WebDriver driver;
    private final By confirmingOrderBtn = By.xpath("//span[text()='I confirm my order']");

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderConfirmationPage confirmOrder() {
        Actions.click(driver, confirmingOrderBtn);
        return new OrderConfirmationPage(driver);
    }
}
