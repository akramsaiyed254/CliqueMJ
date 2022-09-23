package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.omg.CORBA.PRIVATE_MEMBER;

public class DashboardPage extends BasePage{
    TestUtils utils = new TestUtils(); //logs

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"CashBack Balance\"]")
    private MobileElement title;









    public String titleCheck(){

        return getAttribute(title,"content=desc");
    }

}
