package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LaptopPage extends BaseTest {
    public LaptopPage() {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//a[contains(text(), '82YM005HYA')]")
    @FindBy(css = "img[alt='Lenovo Yoga 7 14ARP8 (82YM005HYA) 2u1 laptop 14\" 2.8K OLED touch AMD Ryzen 7 7735U 16GB 1TB SSD Radeon 680M Win11 Pro sivi']")
    WebElement laptop;

    @FindBy(css = "div[class='product-name'] h1")
    WebElement productName;

    @FindBy(css = "span[class=' strikethrough  old-online-price']")
    WebElement oldPrice;

    @FindBy(css = "span[class='price new-online-price']")
    WebElement newPrice;

    @FindBy(xpath = "//a[contains(text(), 'Ocene')]")
    WebElement oceneTab;

    @FindBy(css = "div[class='rating-number ']")
    WebElement ratingNumber;

    @FindBy(id = "product-addtocart-button")
    WebElement addToBasketButton;

    public void laptopClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(laptop));
        laptop.click();
    }

    public boolean productNameIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(productName));
        return productName.isDisplayed();
    }

    public String productNameGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(productName));
        return productName.getText();
    }

    public boolean oldPriceIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(oldPrice));
        return oldPrice.isDisplayed();
    }

    public String oldPriceGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(oldPrice));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return arguments[0].childNodes[0].nodeValue.trim();";
        String priceValue = (String) js.executeScript(script, oldPrice);
        return priceValue;
    }

    public boolean newPriceIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(newPrice));
        return newPrice.isDisplayed();
    }

    public String newPriceGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(newPrice));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return arguments[0].childNodes[0].nodeValue.trim();";
        String priceValue = (String) js.executeScript(script, newPrice);
        return priceValue;
    }

    public void ocenaTabClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(oceneTab));
        oceneTab.click();
    }

    public boolean ratingNumberisDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(ratingNumber));
        return ratingNumber.isDisplayed();
    }
    public String ratingNumberGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(ratingNumber));
        return ratingNumber.getText();
    }

    public void addToBasketButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(addToBasketButton));
        addToBasketButton.click();
    }

}
