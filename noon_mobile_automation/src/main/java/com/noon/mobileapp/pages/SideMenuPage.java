package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SideMenuPage extends BasePage {

	public SideMenuPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;

    @FindBy(xpath=NConstants.MENU_HOME)
    public AndroidElement navigationMenuHome;

    @FindBy(xpath=NConstants.SHOP_BY_CATEGORY)
    public WebElement shopByCategory;

    @FindBy(xpath=NConstants.TODAYS_DEALS)
    public WebElement todaysDeals;

    @FindBy(xpath=NConstants.MY_ACCOUNT)
    public AndroidElement myAccount;

    @FindBy(xpath=NConstants.MY_ORDERS_MENU)
    public AndroidElement myOrdersMenu;

    @FindBy(xpath=NConstants.MY_ORDERS)
    public AndroidElement myOrders;

    @FindBy(xpath=NConstants.RETURN_EXCHANGE)
    public AndroidElement returnExchange;

    @FindBy(xpath=NConstants.INVITE_FRIENDS)
    public WebElement inviteFriends;

    @FindBy(xpath=NConstants.CUSTOMER_SERVICE)
    public WebElement customerService;

    @FindBy(xpath=NConstants.CHAT)
    public WebElement chat;

    @FindBy(xpath=NConstants.ABOUT)
    public WebElement about;

    @FindBy(xpath=NConstants.CATEGORIES_LABEL)
    public WebElement categoriesLabel;

    @FindBy(xpath=NConstants.TOOLBAR_LOGO)
    public WebElement toolbarLogo;

    @FindBy(xpath=NConstants.TODAYS_DEALS_LABEL)
    public WebElement todaysDealsLabel;

    @FindBy(xpath=NConstants.SEE_ALL)
    public WebElement seeAllLink;




    @FindBy(xpath=NConstants.SIGN_IN_LINK)
	public AndroidElement signinLink;
	
	@FindBy(xpath=NConstants.SIGN_IN_TAB)
	public AndroidElement signinTab;
	
	@FindBy(xpath=NConstants.SIGNIN_WITH)
	public AndroidElement signinWith;
	
	@FindBy(xpath=NConstants.SIGNIN_DETAILS)
	public AndroidElement  signinDetails;
	
	@FindBy(xpath=NConstants.GOOGLE_BUTTON)
	public AndroidElement googleButton;
	
	@FindBy(xpath=NConstants.GOOGLE_SIGNIN)
	public AndroidElement googleSingin;
	
	@FindBy(xpath=NConstants.SIGNIN_EMAIL)
	public AndroidElement signinEmail;
	
	@FindBy(className=NConstants.MOBILE_NUMBER_LINK)
	public AndroidElement mobileNumberLink;
	
	@FindBy(xpath=NConstants.EMAIL_LINK)
	public AndroidElement emailLink;
	
	@FindBy(xpath=NConstants.PASSWORD_TAB)
	public AndroidElement passwordTab;
	
	@FindBy(xpath=NConstants.SIGNIN_PASSWORD)
	public AndroidElement signinPassword;
	
	@FindBy(xpath=NConstants.SIGNIN_BUTTON)
	public AndroidElement signinButton;
    
    @FindBy(xpath=NConstants.ADDRESS_BOOK)
    public AndroidElement addressBook;
    
    @FindBy(xpath=NConstants.WALLET)
    public AndroidElement wallet;
    
    @FindBy(xpath=NConstants.MY_PROFILE)
    public WebElement myProfile;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_IMAGE)
    public WebElement myProfileUserImage;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_NAME)
    public WebElement myProfileUserName;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_EMAIL)
    public WebElement MyprofileUserEmail;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_PASSWORD)
    public WebElement myProfileUserPassword;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD)
    public WebElement myProfileUserFragmentPassword;

    @FindBy(xpath=NConstants.MY_PROFILE_USER_SIGNOUT)
    public WebElement myProfileUserSignout;



    
	public void menuTest(String userName, String userPassword) throws InterruptedException {
		
		test.log(LogStatus.INFO, "Launch Android Application - ");
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
		navigationMenuImage.click();
		
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_LINK), "Could not find sign in link");
		signinLink.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_TAB), "Could not find sign in tab");
		signinTab.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.EMAIL_LINK)));
		emailLink.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_EMAIL)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find email address field");
		signinEmail.sendKeys(userName);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_PASSWORD)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find password field");
		signinPassword.sendKeys(userPassword);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_BUTTON)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
		signinButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MENU_HOME)));
        Assert.assertTrue(isElementPresent(NConstants.MENU_HOME), "Could not find Home button");
        navigationMenuHome.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find Nav Image Menu button");
        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SHOP_BY_CATEGORY)));
        Assert.assertTrue(isElementPresent(NConstants.SHOP_BY_CATEGORY), "Could not find Shop by Catehory button");
//        shopByCategory.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TODAYS_DEALS)));
        Assert.assertTrue(isElementPresent(NConstants.TODAYS_DEALS), "Could not find Today's Deals button");
//        todaysDeals.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS_MENU)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ORDERS_MENU), "Could not find My Orders button");
//        myOrdersMenu.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account button");
//        myAccount.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.RETURN_EXCHANGE)));
        Assert.assertTrue(isElementPresent(NConstants.RETURN_EXCHANGE), "Could not find Retutns button");
//        returnExchange.click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.INVITE_FRIENDS)));
       Assert.assertTrue(isElementPresent(NConstants.INVITE_FRIENDS), "Could not find Invite Friends button");
//        inviteFriends.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CUSTOMER_SERVICE)));
        Assert.assertTrue(isElementPresent(NConstants.CUSTOMER_SERVICE), "Could not find Customer Service button");
//        customerService.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHAT)));
        Assert.assertTrue(isElementPresent(NConstants.CHAT), "Could not find Chat in button");
//        chat.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ABOUT)));
        Assert.assertTrue(isElementPresent(NConstants.ABOUT), "Could not find About button");
//        about.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SHOP_BY_CATEGORY)));
        shopByCategory.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CATEGORIES_LABEL)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        toolbarLogo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TODAYS_DEALS)));
        Assert.assertTrue(isElementPresent(NConstants.TODAYS_DEALS), "Could not find Today's Deals button");
        todaysDeals.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TODAYS_DEALS_LABEL)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        toolbarLogo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS_MENU)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ORDERS), "Could not find My Orders button");
        myOrdersMenu.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS)));
        toolbarLogo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find Sign in button");
        myAccount.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS)));
        toolbarLogo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.RETURN_EXCHANGE)));
        Assert.assertTrue(isElementPresent(NConstants.RETURN_EXCHANGE), "Could not find Sign in button");
        returnExchange.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.RETURN_ITEMS)));
        toolbarLogo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));

                                /*
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.INVITE_FRIENDS)));
        Assert.assertTrue(isElementPresent(NConstants.INVITE_FRIENDS), "Could not find Sign in button");
//        inviteFriends.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CUSTOMER_SERVICE)));
        Assert.assertTrue(isElementPresent(NConstants.CUSTOMER_SERVICE), "Could not find Sign in button");
//        customerService.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHAT)));
        Assert.assertTrue(isElementPresent(NConstants.CHAT), "Could not find Sign in button");
//        chat.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ABOUT)));
        Assert.assertTrue(isElementPresent(NConstants.ABOUT), "Could not find Sign in button");
//        about.click();

*/





    }

	
}
