package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TermsPage extends BasePage{

    TestUtils utils = new TestUtils();  //for printing log

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Are you\n" +
            "21 or older?\"]")
    private MobileElement title;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CliqueMJ requires that you meet the legal\n" +
            "age requirements of your area to view\n" +
            "cannabis information\"]")
    private MobileElement description1;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Terms of Use \"]")

    private MobileElement link1;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Terms & Conditions\"]")
    private MobileElement title2;

    @AndroidFindBy (xpath = "//android.widget.Button[1]")
    private MobileElement backbutton1;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Privacy Policy.\"]")
    private MobileElement link2;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Privacy Policy.\"]")
    private MobileElement title3;

    @AndroidFindBy (xpath = "//android.widget.Button[1]")
    private MobileElement backbutton2;

    @AndroidFindBy (xpath =  "//android.widget.Button[@content-desc=\"I Agree\"]")
    private MobileElement iAgreeButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Sign Up\"]")
    private MobileElement title4;




    public String titleCheck(){

        return getAttribute(title,"content-desc");
    }

    public String description1Check(){
        return getAttribute(description1,"content-desc");

    }
    public void link1Check(){

        click(link1,"User click on Terms of Use");

    }

    public String title2Check(){

        waitForVisibility(title2);
        return getAttribute(title2,"content-desc");
    }
    public void backButton1Check(){
        click(backbutton1,"click on back button of terms and conditions page");
    }

    public void link2Check(){
        click(link2,"User click on Privacy policy");

    }
    public String title3Check() {

        return getAttribute(title3, "content-desc");

    }
    public void backButton2Check(){
        click(backbutton2,"User click on back button of Privacy policy page");
    }

    public void iAgreeButtonCheck(){
        click(iAgreeButton,"User click on I Agree button");

    }
    public String title4Check(){
        waitForVisibility(title4);
        return getAttribute(title4,"content-desc");

    }

    }



















