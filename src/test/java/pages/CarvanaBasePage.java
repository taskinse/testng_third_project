package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class CarvanaBasePage {
    public CarvanaBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "div[class*='Logo']")
    public WebElement logoHeader;

    @FindBy(css = "div[class*='Navigationstyles__NavigationWrapper']")
    public List<WebElement> mainNavigationBar;

    @FindBy(css = "div[class*='SignInLink__Desktop']")
    public WebElement signInBox;

    @FindBy(id = "email")
    public WebElement emailInbox;

    @FindBy(id = "password")
    public WebElement passwordInbox;

    @FindBy(css = "button[class*='button_btn']")
    public WebElement continueAndSignInButton;

    @FindBy(id = "error-banner")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[contains(@class,'clLcvu')][1]")
    public WebElement searchCarsButton;

    @FindBy(css = "div[class*='HeaderFacetsstyles__MenuFlex']")
    public List<WebElement> filterOptions;

    @FindBy(css = "input[class*='react-autosuggest__input']")
    public WebElement searchInputBox;

    @FindBy(css = ".favorite-icon")
    public List<WebElement> favoriteIcon;

    @FindBy(css = ".vehicle-image")
    public List<WebElement> carImage;

    @FindBy(css = ".result-tile")
    public List<WebElement> resultTile;


}