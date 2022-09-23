package com.qa.stepdef;

import com.qa.pages.OtpPage;
import com.qa.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;

public class SignUpstepdef {
    @And("^User click on Sign Up button$")
    public void userClickOnSignUpButton() throws Exception {
        new SignUpPage().setSignUpButton();
    }

//    @And("^User click on While Using The App$")
//    public void userClickOnWhileUsingTheApp() {
//        new SignUpPage().setLocation();
//    }

    @Then("^Validation message should be \"([^\"]*)\"$")
    public void validationMessageShouldBe(String message) {
        Assert.assertEquals(new SignUpPage().setMessage(), message);
    }

    @When("^User enter enter Full Name \"([^\"]*)\"$")
    public void userEnterEnterFullName(String name) throws Exception {
        new SignUpPage().setName(name);

    }

    @And("User click on country code drop-down")
    public void userClickOnCountryCodeDropDown() throws Exception {
        new SignUpPage().setDropdown();
    }

    @And("^User enter Country Code \"([^\"]*)\"$")
    public void userEnterCountryCode(String code) {
        new SignUpPage().setEnterCode(code);
    }

    @And("User select country from the list")
    public void userSelectCountryFromTheList() {
        new SignUpPage().setSelectCode();
    }


    @And("^User enter Phone Number \"([^\"]*)\"$")
    public void userEnterPhoneNumber(String phone) throws InterruptedException {
        new SignUpPage().setEnterPhone(phone);
    }

    @And("^User enter Password \"([^\"]*)\"$")
    public void userEnterPassword(String password) throws InterruptedException {
        new SignUpPage().setEnterPassword(password);
    }

    @And("^User enter Confirm Password \"([^\"]*)\"$")
    public void userEnterConfirmPassword(String cpassword) throws InterruptedException {
        new SignUpPage().setEnterCpassword(cpassword);
    }

    @And("User check the terms and conditions checkbox$")
    public void userCheckTheTermsAndConditionsCheckbox() {
        new SignUpPage().setCheckbox();
    }

    @Then("^Otp screen should be displayed with title \"([^\"]*)\"$")
    public void otpScreenShouldBeDisplayed(String title) {
        Assert.assertEquals(new SignUpPage().titleCheck(), title);

    }
}
