package com.qa.stepdef;

import com.qa.pages.IntroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

public class Introductionstepdef {




    @And("^there should be Shop Featured Brands image$")
    public void thereShouldBeShopFeaturedBrandsImage() throws InterruptedException {
        Assert.assertTrue(new IntroPage().logoCheck());
    }

    @Then("^there should be page description \"([^\"]*)\"$")
    public void thereShouldBePageDescription(String description) {
       Assert.assertEquals(new IntroPage().setTitleCheck(description), description);
        //Assert.assertEquals("Snap your receipts and turn them into cash!","Snap your receipts and turn them into cash!");

    }



    @Then("^User is redirected to Scan you receipt page with title \"([^\"]*)\"$")
    public void userIsRedirectedToScanYouReceiptPageWithTitle(String title) {
        Assert.assertEquals(new IntroPage().setTitleCheck(title),title);
    }

    @And("^User click on continue button")
    public void userClickOnContinueButton() throws InterruptedException {
         new IntroPage().clickContinueButton();
    }


    @And("there should be Scan Your Receipt image")
    public void thereShouldBeScanYourReceiptImage() throws InterruptedException {
        Assert.assertTrue(new IntroPage().logoCheck());
    }

    @And("^there should be second page description \"([^\"]*)\"$")
    public void thereShouldBeSecondPageDescription(String description) {
        Assert.assertEquals(new IntroPage().setTitleCheck(description), description);
    }

    @Then("User is redirected to Redeem your cash page with title \"([^\"]*)\"$")
    public void userIsRedirectedToRedeemYourCashPageWithTitle(String title) {
       Assert.assertEquals( new IntroPage().setTitleCheck(title), title);

    }

    @And("there should be Redeem Your Cash image")
    public void thereShouldBeRedeemYourCashImage() throws InterruptedException {
        Assert.assertTrue( new IntroPage().logoCheck());
    }

    @And("^there should be third page description \"([^\"]*)\"$")
    public void thereShouldBeThirdPageDescription(String description) {
        Assert.assertEquals( new IntroPage().setTitleCheck(description), description);
    }

    @And("User click on Start now button")
    public void userClickOnStartNowButton() throws InterruptedException {

        new IntroPage().setStartNowButton();

    }

    @Then("^User is redirected to One More Thing page with title \"([^\"]*)\"$")
    public void userIsRedirectedToOneMoreThingPageWithTitle(String title) {
       Assert.assertEquals( new IntroPage().setTitleCheck(title), title);
    }
}
