package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Skip the introduction\"]")
            private MobileElement clickOnSkipTheIntroduction;




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


    public void setClickOnSkipTheIntroduction() {
        click(clickOnSkipTheIntroduction, "click on skip the introduction");

    }





}

