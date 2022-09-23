package com.qa.stepdef;

import com.qa.pages.DashboardPage;
import com.qa.pages.EnablePushNotificationsPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Dashboardstepdef {

    @Then("^Dashboard should be displayed with \"([^\"]*)\" when user sign up$")
    public void dashboardShouldBeDisplayedWithWhenUserSignUp(String title) {

        Assert.assertEquals(new DashboardPage().titleCheck(),title);
    }

}
