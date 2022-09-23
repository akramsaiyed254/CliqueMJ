package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import javax.xml.xpath.XPath;

public class EnablePushNotificationsPage extends BasePage {

    TestUtils utils = new TestUtils(); // for printing logs

    @AndroidFindBy(xpath = "//android.widget.ImageView[1]")
    private MobileElement logoImage;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Skip the introduction\"]")
    private  MobileElement skipTheIntroduction;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"One more\n" +
            "thing..\"]")
    private MobileElement pushNotificationTitle;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"To get discreet notifications\n" +
            "for deals, products and more,\n" +
            "Enable Push Notifications.\"]")
    private MobileElement description;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Enable Push Notifications\"]")
    private MobileElement button1;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"l'll do this later\"]")
    private MobileElement button2;


    public Boolean logoCheck() throws InterruptedException {
        Thread.sleep(3000);
        waitForVisibility(logoImage);

        return find(logoImage, 3);
    }

    public void skipTheIntroduction() {

        click(skipTheIntroduction, "click on skip the introduction button");

    }

    public String pushNotificaionTitleCheck() {
        waitForVisibility(pushNotificationTitle);

        return getAttribute(pushNotificationTitle, "content-desc");
    }

    public  String descriptionCheck() {
        return getAttribute(description, "content-desc");

    }
    public String button1Check() {
        return getAttribute(button1, "content-desc");
    }

    public String button2Check() {
        return getAttribute(button2, "content-desc");
    }

    public void clickButton1() {
        click(button1, "click on Enable Push Notifications button");
    }
    public void clickButton2() {
        waitForVisibility(button2);
        click(button2, "click on I'll do this later button");
    }

}
