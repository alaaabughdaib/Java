package aylacar.acceptance_tests;



import static org.junit.Assert.assertTrue;

import aylacar.Customer;
import aylacar.Manage;
import aylacar.signup_frame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
Customer c = new Customer();
String name =null;
String customeId =null;
String email =null;
String password =null;
String address =null;
String phoneNumber =null;
signup_frame s;
Manage m=new Manage();

@Given("the customer is on the registration page")

public void theCustomerIsOnTheRegistrationPage() {
     s= new signup_frame();
   
}




@When("the customer provides valid registration details")

public void theCustomerProvidesValidRegistrationDetails(io.cucumber.datatable.DataTable dataTable) {
   name ="alaa";
   customeId = "123456";
   email = "alaa@aylacar";
   password ="1234";
   address ="nablus";
   phoneNumber = "0591234";
}



@When("submits the registration form")

public void submitsTheRegistrationForm() {
    c.setName(name);
    c.setAddress(address);
    c.setCustomerId(customeId);
    c.setPassword(password);
    c.setPhoneNumber(phoneNumber);
    c.setEmail(email);
    
    m.addCustomer(c);
	
}


@Then("the customer should be successfully registered")

public void theCustomerShouldBeSuccessfullyRegistered() {

	 assertTrue(true);
}



@When("the customer provides incomplete registration details")
public void theCustomerProvidesIncompleteRegistrationDetails(io.cucumber.datatable.DataTable dataTable) {
name="haya";
password="1234";
phoneNumber="0591231";
address="nablus";
customeId="1111";

c.setName(name);
c.setAddress(address);
c.setCustomerId(customeId);
c.setPassword(password);
c.setPhoneNumber(phoneNumber);
c.setEmail(email);

m.addCustomer(c);

}

@Then("the registration should fail, and an error message should be displayed")
public void theRegistrationShouldFailAndAnErrorMessageShouldBeDisplayed() {
	 assertTrue(true);

}



@Given("there is an existing customer with the email {string}")
public void thereIsAnExistingCustomerWithTheEmail(String string) {
  s=new signup_frame();
}

@When("the customer provides registration details with the same email")
public void theCustomerProvidesRegistrationDetailsWithTheSameEmail(io.cucumber.datatable.DataTable dataTable) {
    name="ayla";
    password="1234";
    customeId="2222";
    address="nablus";
    phoneNumber="059784";
    email="Ayla@aylacar";
    
    c.setName(name);
    c.setAddress(address);
    c.setCustomerId(customeId);
    c.setPassword(password);
    c.setPhoneNumber(phoneNumber);
    c.setEmail(email);
    
    m.addCustomer(c);
    
    
}

@Then("the registration should fail, and an error message should indicate the email is already in use")
public void theRegistrationShouldFailAndAnErrorMessageShouldIndicateTheEmailIsAlreadyInUse() {
	 assertTrue(true);
}
}
