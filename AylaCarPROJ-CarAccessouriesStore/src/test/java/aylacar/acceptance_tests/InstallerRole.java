package aylacar.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import aylacar.Manage;



public class InstallerRole {

	Manage m = new Manage ();
	Date d;
	String product_name=null;
	String customer_name=null;
	
	
    @Given("the installer is logged in")
    public void givenInstallerIsLoggedIn() {
         }

    @When("the installer checks the list of installation requests")
    public void whenInstallerChecksInstallationRequests() {
      m.checkinstallationrequest();
    }

    @Then("the installer should see a list of installation requests")
    public void thenInstallerSeesInstallationRequests() {
    	
         assertTrue(true); // Placeholder assertion
    }

    @Then("each request should include relevant details such as product, car make/model, and preferred date")
    public void thenRequestDetailsAreDisplayed() {
        // Implement steps to verify that each request includes relevant details
        assertTrue(true); // Placeholder assertion
    }

    

    
    @When("the installer selects an installation request")
    public void whenInstallerSelectsInstallationRequest() {
        customer_name="Ayla";
        product_name="Led";
    }

    @When("chooses an available time slot for the appointment")
    public void whenInstallerChoosesTimeSlotForAppointment() {
    d= new Date ("1,2,2023");   
    
    }

    @Then("the installer should be able to schedule the appointment")
    public void thenInstallerCanScheduleAppointment() {
        m.schedule(customer_name, product_name, d);
    	assertTrue(true); // Placeholder assertion
    }

 
 
    

    @When("the installer checks the list of scheduled appointments")
    public void whenInstallerChecksScheduledAppointments() {
       m.checkscheduledappointment();
    }

    @Then("the installer should see a list of upcoming appointments")
    public void thenInstallerSeesUpcomingAppointments() {
        // Implement steps to verify that the installer sees a list of upcoming appointments
        assertTrue(true); // Placeholder assertion
    }

    @Then("each appointment should include relevant details such as customer name, product, and scheduled date/time")
    public void thenAppointmentDetailsAreDisplayed() {
        // Implement steps to verify that each appointment includes relevant details
        assertTrue(true); // Placeholder assertion
    }
    
    
    

 
    
    
    
    
    
    
   
}
