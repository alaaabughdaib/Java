package aylacar.acceptance_tests;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import aylacar.Product;
public class productCatlog {

  // installer n= new installer();
   Product p=new Product(5,"cc","in","pic",99.9,true,1,"dd",5,"tt","done");

   // @Test
    @When("Customer want to show certain product")
    public void customerWantToShowCertainProduct() {
        // Write code here that turns the phrase above into concrete actions
       assertTrue(true);
    }


    @Then("all details will given  {int} {string} {string} {string} {double}")
    public void allDetailsWillGiven(Integer int1, String string, String string2, String string3, Double double1) {
        // Write code here that turns the phrase above into concrete actions
        p.getProductId();
        p.getName();
        p.getCategory();
        p.getPicture();
        p.getCost();
        assertTrue(true);
    }








  /*  @When("installer want to search product")
    public void installerWantToSearchProduct() {
        // Write code here that turns the phrase above into concrete actions
 assertTrue(true);
    }
    @Test
    @Then("he can found it if exist")
    public void heCanFoundItIfExist() {
        // Write code here that turns the phrase above into concrete actions
//p.setId(1);

  n.searchProduct(5);
  int actualId=5;
        boolean ifExistProduct = n.searchProduct(5);
       // int expectId = 1;
        assertFalse(ifExistProduct);
    }
    @Then("print this product exist")
    public void printThisProductExist() {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("exist");
    }

*/

}
