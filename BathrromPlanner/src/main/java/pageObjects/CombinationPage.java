package pageObjects;

import Resource.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CombinationPage extends BaseClass {


    public CombinationPage(WebDriver driver) {
        this.driver=driver;
       // PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#header > div > div > div.buttons--left > a.circular-button.js-home > svg")
    public WebElement Homelink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement Openlink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[3]/button[1]")
    public WebElement Savelink;

    @FindBy(xpath = "//a[contains(text(),'Wash-stands')]")
    public WebElement washstands;

    @FindBy(xpath = "//div[contains(text(),'Series')]")
    public WebElement Series;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement size;

    @FindBy(xpath = "//a[contains(text(),'Wash-basins')]")
    public WebElement washbasins;

    @FindBy(xpath = "//a[contains(text(),'Cabinets and storage')]")
    public WebElement Cabinets_and_storage;

    @FindBy(xpath = "//a[contains(text(),'Taps')]")
    public WebElement taps;

    @FindBy(xpath = "//a[contains(text(),'Mirrors')]")
    public WebElement Mirrors;

    @FindBy(xpath = "//a[contains(text(),'Lighting')]")
    public WebElement Lighting;

    @FindBy(xpath = "//a[contains(text(),'Walls')]")
    public WebElement walls;

    @FindBy(xpath = "//a[contains(text(),'Floors')]")
    public WebElement Floors;

    @FindBy(xpath = "//a[@class='button button--text button--large js-print-pdf']")
    public WebElement print;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/footer[1]/div[3]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[2]")
    public WebElement Email;

    public void save()
    {
        Savelink.click();
    }

    public void  print()
    {
        print.click();
    }

}
