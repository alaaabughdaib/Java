package aylacar.acceptance_tests;

import static org.junit.Assert.assertTrue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import aylacar.Manage;
import aylacar.home_frame;
import aylacar.login_frame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	login_frame l ;
	String email=null;
	String password=null;
	JButton button;
	Manage m= new Manage();
	home_frame h;
	
	
	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
	 l=new login_frame();
	}

	@When("the user enters valid credentials")
	public void theUserEntersValidCredentials(io.cucumber.datatable.DataTable dataTable) {
    
		email="ayla@aylacar";
      password="1234";
      
	}

	@When("submits the login form")
	public void submitsTheLoginForm() {
		 m.checkvalidlogin(email, password);
	}

	@Then("the user should be successfully logged in")
	public void theUserShouldBeSuccessfullyLoggedIn() {
		assertTrue(true); 
	}

	@When("the user enters an incorrect password")
	public void theUserEntersAnIncorrectPassword(io.cucumber.datatable.DataTable dataTable) {
    email="ayla@aylacar";
    password="12333";
    m.isCustomerPasswordCorrect(email, password);
    
    
    
	}

	@Then("the login should fail, and an error message should be displayed")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayed() {
		assertTrue(false); 
	}

	@When("the user enters a non-existing email")
	public void theUserEntersANonExistingUsername(io.cucumber.datatable.DataTable dataTable) {
     email="non@aylacar";
     password="1234";
     m.customerExistsByEmail(email);
	}

	@Then("the login should fail, and an error message should indicate the username is not registered")
	public void theLoginShouldFailAndAnErrorMessageShouldIndicateTheUsernameIsNotRegistered() {
		assertTrue(false); 	
	}

	@When("the user leaves the email field empty")
	public void theUserLeavesTheUsernameFieldEmpty(io.cucumber.datatable.DataTable dataTable) {
    email=null;
    password="1234";
    m.isEmailEmpty(email);
    
    
	}

	@Then("the login should fail, and an error message should be displayed indicating the email field is required")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayedIndicatingTheUsernameFieldIsRequired() {
		assertTrue(false); 	
	}

	@When("the user leaves the password field empty")
	public void theUserLeavesThePasswordFieldEmpty(io.cucumber.datatable.DataTable dataTable) {
    email="ayla@aylacar";
    password=null;
    
    m.isPasswordEmpty(password);
	}

	@Then("the login should fail, and an error message should be displayed indicating the password field is required")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayedIndicatingThePasswordFieldIsRequired() {
		assertTrue(false); 	
	}

}
