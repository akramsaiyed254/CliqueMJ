package com.qa.stepdef;

import com.qa.pages.EnablePushNotificationsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PushNotistepdef {
    @Given("^User has redirected to One More Thing page with title \"([^\"]*)\"$")
    public void userHasRedirectedToOneMoreThingPageWithTitle(String title) {
        Assert.assertEquals(new EnablePushNotificationsPage().pushNotificaionTitleCheck(),title);
    }

    @And("^There should be bell image$")
    public void thereShouldBeBellNotificationImage() throws InterruptedException {
        Assert.assertTrue(new EnablePushNotificationsPage().logoCheck());
    }

    @And("^There should be enable push notifications page description \"([^\"]*)\"$")
    public void thereShouldBeEnablePushNotificationsPageDescription(String description) {
        Assert.assertEquals(new EnablePushNotificationsPage().descriptionCheck(),description);
    }

    @And("^There should be Enable Push Notifications button \"([^\"]*)\"$")
    public void thereShouldBeEnablePushNotificationsButton(String button1) {
        Assert.assertEquals(new EnablePushNotificationsPage().button1Check(),button1);
    }

    @And("^There should be i'll do this later button \"([^\"]*)\"$")
    public void thereShouldBeILlDoThisLaterButton(String button2) {
        Assert.assertEquals(new EnablePushNotificationsPage().button2Check(),button2);
    }

    @Then("^Click on enable push notifications$")
    public void clickOnEnablePushNotifications() {
        new EnablePushNotificationsPage().clickButton1();
    }

    @Then("Click on l'll do this later button")
    public void clickOnLLlDoThisLaterButton() {
        new EnablePushNotificationsPage().clickButton2();
    }



}
