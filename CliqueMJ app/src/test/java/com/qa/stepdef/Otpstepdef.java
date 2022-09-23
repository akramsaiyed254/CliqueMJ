package com.qa.stepdef;

import com.qa.pages.OtpPage;
import com.qa.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Otpstepdef {
    @And("^User enter otp \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnterOtp(String digit1, String digit2, String digit3, String digit4) {
        new OtpPage().digit1Check(digit1);
        new OtpPage().digit2Check(digit2);
        new OtpPage().digit3Check(digit1);
        new OtpPage().digit4Check(digit1);

    }

    @Then("^user click on done button in keyboard$")
    public void userClickOnDoneButtonInKeyboard() {
    }


}




