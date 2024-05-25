package aylacar.acceptance_tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class instllationReq {

    @When("customer click on install and flag is {string}")
    public void customerClickOnInstallAndFlagIs(String string) {
        // Write code here that turns the phrase above into concrete actions
    assertTrue(true);
    }
    @Then("the field {string} should be an error")
    public void theFieldShouldBeAnError(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertFalse(false);
    }
    @When("customer click insert order and flag is {string}")
    public void customerClickInsertOrderAndFlagIs(String string) {
        // Write code here that turns the phrase above into concrete actions
    assertTrue(true);
    }
    @Then("he fill {string} with {string}")
    public void heFillWith(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("presses {string} and flag is {string}")
    public void pressesAndFlagIs(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("installation request successful")
    public void installationRequestSuccessful() {
        // Write code here that turns the phrase above into concrete actions
    assertTrue(true);
    }



}
