package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class OtpPage extends BasePage{

    TestUtils utils = new TestUtils(); // for logs

    @AndroidFindBy (xpath = "//android.widget.EditText[1]")
    private MobileElement otpDigit1;

    @AndroidFindBy (xpath = "//android.widget.EditText[2]")
    private MobileElement otpDigit2;

    @AndroidFindBy (xpath = "//android.widget.EditText[3]")
    private MobileElement otpDigit3;

    @AndroidFindBy (xpath = "//android.widget.EditText[4]")
    private MobileElement otpDigit4;

















    public void digit1Check(String digit1) {

        sendKeys(otpDigit1, digit1,"User enter first digit");
    }
    public void digit2Check(String digit2) {

        sendKeys(otpDigit2, digit2,"User Second first digit");
    }
    public void digit3Check(String digit3) {

        sendKeys(otpDigit3, digit3,"User Third first digit");
    }
    public void digit4Check(String digit4) {

        enterInKeyboard(digit4);




        //sendKeys(otpDigit4, digit4,"User Fourth first digit");

    }





}
