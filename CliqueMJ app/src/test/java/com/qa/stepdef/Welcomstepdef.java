package com.qa.stepdef;

import com.qa.pages.EnablePushNotificationsPage;
import com.qa.pages.IntroPage;
import com.qa.pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Welcomstepdef {


    @Given("user is on welcome page")
    public void userIsOnWelcomePage() {
    }

    @Then("there should be cliqueMJ logo in splash screen")
    public void thereShouldBeCliqueMJLogoInSplashScreen() throws InterruptedException {
        Assert.assertTrue(new WelcomePage().splashCheck());
    }

    @And("^There should be welcome text \"([^\"]*)\"$")
    public void thereShouldBeWelcomeText(String title) throws InterruptedException {
        Assert.assertEquals(new WelcomePage().welcomeCheck(),title);
    }

    @And("^there should be cliqueMJ logo at top$")
    public void thereShouldBeCliqueMJLogoAtTop() throws InterruptedException {
    Assert.assertTrue(new WelcomePage().logoCheck());
    }

    @Given("^when user start the application$")
    public void whenUserStartTheApplication() {


    }


    @Then("there should be cliqueMJ logo")
    public void thereShouldBeCliqueMJLogo() throws InterruptedException {
        Assert.assertTrue(new IntroPage().splashCheck());
    }

    @And("^there should be welcome description \"([^\"]*)\"$")
    public void thereShouldBeWelcomeDescription(String description) {
        Assert.assertEquals(new IntroPage().setTitleCheck(description),description);

    }

    @When("^User click on Get Started button$")
    public void userClickOnGetStartedButton() {

        new IntroPage().clickGetStarted();
    }

    @Then("^User should be redirected to Shop Feature Brands intro page with title Shop Feature Brands \"([^\"]*)\"$")
    public void userShouldBeRedirectedToShopFeatureBrandsIntroPageWithTitleShopFeatureBrands(String title2) throws InterruptedException {

       Assert.assertEquals(new IntroPage().setTitleCheck(title2),title2);




}




    @When("User click on Skip The Introduction button")
    public void userClickOnSkipTheIntroductionButton() {
        new EnablePushNotificationsPage().skipTheIntroduction();
    }


}
