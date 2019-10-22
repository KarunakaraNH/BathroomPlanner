package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    public WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "(//picture[@class='card__image']/img)[21]")
    WebElement RandomProduct;

    @FindBy(xpath = "(//div[@class='filter__info'])[1]")
    WebElement ViewBy;

    @FindBy(xpath = "//label[contains(text(),'Gallery')]")
    WebElement Gallery;

    @FindBy(xpath = "//div[3]//div[1]//a[1]")
    WebElement RandomGallery;


    public CombinationPage ClickOnRandomProduct()
    {
        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.visibilityOf(this.RandomProduct));
        RandomProduct.click();
        CombinationPage cp =  PageFactory.initElements(this.driver, CombinationPage.class);
        return cp;
    }


}

