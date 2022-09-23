package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.windows.PressesKeyCode;
import org.openqa.selenium.Keys;

public class SignUpPage extends BasePage{

    TestUtils utils = new TestUtils(); //for printing logs




    @AndroidFindBy (xpath="//android.widget.Button[@content-desc=\"Sign Up\"]")
    private MobileElement signUpButton;

//    @AndroidFindBy (xpath = "//android.widget.Button[@id=com.android.permissioncontroller:id/permission_allow_foreground_only_button]")
//    private MobileElement location;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"All fields are mandatory\"]")
    private MobileElement message;

    @AndroidFindBy (xpath = "//android.widget.EditText[@text=\"Enter your name\"]")
    private MobileElement fullName;

    @AndroidFindBy (accessibility = "+1")
    private MobileElement dropdown;

    @AndroidFindBy (xpath = "//android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
    private MobileElement entercode;


    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"+91 भारत\"]")
    private MobileElement selectCode;

    @AndroidFindBy (xpath = "//android.widget.EditText[2]")
    private MobileElement enterPhone;

    @AndroidFindBy (xpath = "//android.view.View/android.widget.ScrollView/android.widget.EditText[3]")
    private MobileElement enterPassword;

    @AndroidFindBy (xpath = "//android.view.View/android.widget.ScrollView/android.widget.EditText[4]")
    private MobileElement enterCpassword;

    @AndroidFindBy (xpath = "//android.view.View/android.widget.ScrollView/android.widget.CheckBox")
    private MobileElement checkbox;


    @AndroidFindBy (accessibility = "Verification")
    private MobileElement title;















    public void setSignUpButton() throws Exception {
        scrollToElement(signUpButton,"up").click();


    }

//    public void setLocation(){
//
//        click(location,"User click on While using the app in location permission pop-up");
//
//    }

    public String setMessage(){
        return getAttribute(message, "content-desc");
    }

    public void setName(String name) throws Exception {



        scrollToElement(fullName,"down").click();
        clear(fullName);
        enterInKeyboard(name);


    }


    public void setDropdown() throws Exception {
        scrollToElement(dropdown,"down").click();
    }

    public void setEnterCode(String code){
        sendKeys(entercode,code,"User enter country code in country code drop-down");
    }

    public void setSelectCode(){
        click(selectCode,"User select the country code from the list");

    }

    public void setEnterPhone(String phone) throws InterruptedException {
        //wait(3000);
        sendKeys(enterPhone, phone, "User enter phone number");
    }

    public void setEnterPassword(String password) throws InterruptedException {
        //wait(1000);

        sendKeys(enterPassword, password, "User enter password");
    }

    public void setEnterCpassword(String cpassword) throws InterruptedException {
        //wait(1000);

        sendKeys(enterCpassword,cpassword, "user enter confirm password");
    }

    public void setCheckbox(){
        click(checkbox,"User click on checkbox of terms and conditions");
    }
    public String titleCheck() {
        return getAttribute(title, "content-desc");
    }

}
