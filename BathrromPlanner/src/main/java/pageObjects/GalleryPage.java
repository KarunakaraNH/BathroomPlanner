package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GalleryPage {

    public WebDriver driver;

    public GalleryPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")
    WebElement Edit;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    WebElement store;




}
