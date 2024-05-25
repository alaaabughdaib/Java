package aylacar.acceptance_tests;
import aylacar.Admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import aylacar.Installer;
import aylacar.Product;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class notification {

    Installer n =new Installer();
    Admin a =new Admin();
    Product p=new Product(5,"cc","in","pic",99.9,true,1,"ff",5,"ee","done");

    @When("the order be done")
    public void theOrderBeDone() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("installer sent message to customer")
    public void installerSentMessageToCustomer() {
        // Write code here that turns the phrase above into concrete actions
n.setFirstName("haya");
n.setInstallerId(1);
n.setPhoneNumber("02364849");
a.addinstaller(n);
n.addProduct(p);

        int expectedResult = 1;
        int actualResult = 0 ;
        for(int i = 0 ; i < n.findByNameProduct.size(); i++){
            if((n.findByNameProduct.get(i).getProductStatus() == 1) && (n.findByNameProduct.get(i).getProductId() == 5)){
                // actualResult = 1 ---> in complete
                actualResult = 1;
            }
        }
        assertEquals(actualResult , expectedResult);
        n.orderStatus(5,1,"your order done");


    }

}
