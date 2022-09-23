package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.cucumber.java.en_lol.AN;
import org.openqa.selenium.By;

public class IntroPage extends BasePage {

    TestUtils utils = new TestUtils();  //for printing log

    @AndroidFindBy(xpath="//android.widget.ImageView[1]")
    private MobileElement splashLogo;

    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"Welcome!\"]" )
    private MobileElement welcomeText;

    @AndroidFindBy(xpath="//android.widget.ImageView[1]")
    private MobileElement welcomeLogo;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome aboard!\n" +
            "We're so happy you're here!\n" +
            "Click the button below to get started\"]")
    private MobileElement Desc;

    @AndroidFindBy(xpath= "//android.widget.Button[@content-desc=\"Get Started\"]")
    private MobileElement getStartedButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start Now\"]")
    private  MobileElement startNowButton;


    //COMMON FOR ALL INTRO PAGES
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[1]")
    private MobileElement logoImage;



    GlobalParams params = new GlobalParams();



    public Boolean splashCheck() throws InterruptedException {
        waitForVisibility(welcomeLogo);

        return find(splashLogo, 2);
    }


    public String welcomeCheck() throws InterruptedException {
        waitForVisibility(welcomeText);
        return getAttribute(welcomeText, "content-desc");
    }
    public Boolean logoCheck() throws InterruptedException {
        Thread.sleep(3000);

        return find(welcomeLogo, 3);

    }



    public void clickGetStarted() {
        click(getStartedButton,"click on get started button");
   }



    public void clickContinueButton() throws InterruptedException {
        //Thread.sleep(5000);
        click(continueButton, "click on continue button");
    }

    public void setStartNowButton() throws InterruptedException {
        //Thread.sleep(5000);
        click(startNowButton,"click on Start Now button");
    }

    //common for all introduction pages
    public void setLogoCheck(){
        find(logoImage,3);
    }

    public String setTitleCheck(String title){
        String xpath;
        if(params.getPlatformName().equals("Android")) {
            xpath ="//android.view.View[@content-desc=\""+title+"\"]";
        }
        else
        {
            xpath="";
        }
        waitForVisibility(By.xpath(xpath));
        return getAttribute(By.xpath(xpath),"content-desc");
    }
}

