package com.qa.stepdef;

import com.qa.pages.TermsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.Ter;
import org.junit.Assert;

public class Termsstepdef {
    @Given("^User is on 21 or older page with title \"([^\"]*)\"$")
    public void userIsOnOrOlderPageWithTitle(String title) {
        Assert.assertEquals(new TermsPage().titleCheck(),title);
    }

    @And("^There should be first description \"([^\"]*)\"$")
    public void thereShouldBeFirstDescription(String description1) {
        Assert.assertEquals(new TermsPage().description1Check(),description1);
    }

    @And("^user click on Terms of Use$")
    public void userClickOnTermsOfUse() {
        //Assert.assertEquals(new TermsPage().link1Check(),link1 + " ");
        new TermsPage().link1Check();
    }

    @And("^title should be Terms & conditions \"([^\"]*)\"$")
    public void titleShouldBeTermsConditions(String title2) {
        Assert.assertEquals(new TermsPage().title2Check(),title2);
    }

    @And("^User click on Back button$")
    public void userClickOnBackButton() {
        new TermsPage().backButton1Check();

    }

    @And("^User click on Privacy Policy \"([^\"]*)\"$")
    public void userClickOnPrivacyPolicy(String link2) {

        new TermsPage().link2Check();
    }

    @And("^title should be Privacy Policy \"([^\"]*)\"$")
    public void titleShouldBePrivacyPolicy(String title3) {

        Assert.assertEquals(new TermsPage().title3Check(),title3);

    }
    @And("User click on Back button.")
    public void userClickOnBackButton2() {
        new TermsPage().backButton2Check();
    }

    @And("User click on I Agree button$")
    public void userClickOnIAgreeButton() {
        new TermsPage().iAgreeButtonCheck();

    }



    @Then("^User should be on Sign Up page \"([^\"]*)\"$")
    public void userShouldBeOnSignUpPage(String title4) {
        Assert.assertEquals(new TermsPage().title4Check(),title4);


    }


}
