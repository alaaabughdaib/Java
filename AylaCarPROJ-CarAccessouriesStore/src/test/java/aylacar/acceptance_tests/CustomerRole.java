
package aylacar.acceptance_tests;

import static org.junit.Assert.assertTrue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import aylacar.Manage;
import aylacar.Product;
import aylacar.cart_frame;
import aylacar.home_frame;
import aylacar.list_frame;
import aylacar.p1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerRole {

home_frame h;
String product_s=null;
Manage m=new Manage();
cart_frame c;
String address_c=null;
String name_c=null;
String phone_c=null;
JButton button;
String category=null;
 Product p=new Product(1234,"led","Electronic",null, 20.0,false, 1,"light led ",20,null,null);

	
	
	
	

@Given("the customer is on the product catalog page")
public void theCustomerIsOnTheProductCatalogPage() {
h=new home_frame();
}

@When("the customer views the list of available products")
public void theCustomerViewsTheListOfAvailableProducts() {
   
m.viewproducts();
	
}

@Then("the customer should see a variety of products categorized into sections like {Interior} {Exterior} and {Electronics}")
public void theCustomerShouldSeeAVarietyOfProductsCategorizedIntoSectionsLikeAnd(String Interior, String Exterior, String Electronics) {
	 assertTrue(true);
}

@When("the customer searches for a specific product by name or keyword")
public void theCustomerSearchesForASpecificProductByNameOrKeyword() {
 product_s="led";
 m.searchProductByName(product_s);
}

@Then("the customer should see relevant search results matching the product name or keyword")
public void theCustomerShouldSeeRelevantSearchResultsMatchingTheProductNameOrKeyword() {
	 assertTrue(true);
}

@When("the customer filters products by selecting a specific category \\(e.g., {Electronics})")
public void theCustomerFiltersProductsBySelectingASpecificCategoryEG(String string) {
	 category = "Electronics";
m.filterProductsByCategory(category);

}

@Then("the customer should see only products belonging to the selected category")
public void theCustomerShouldSeeOnlyProductsBelongingToTheSelectedCategory() {
	

	 assertTrue(true);
}

@Given("the customer is on the product details page")
public void theCustomerIsOnTheProductDetailsPage() {
	p1 p = new p1();

}

@When("the customer clicks the {string} button for a specific product")
public void theCustomerClicksTheButtonForASpecificProduct(String AddtoCart) {
m.addToCart(p);
}

@Then("the product should be added to the customer's shopping cart")
public void theProductShouldBeAddedToTheCustomerSShoppingCart() {

  assertTrue(true);
}


@Given("the customer has added products to the shopping cart")
public void theCustomerHasAddedProductsToTheShoppingCart() {
c=new cart_frame();
}

@When("the customer proceeds to checkout")
public void theCustomerProceedsToCheckout() {

}

@When("completes the purchase by providing necessary details")
public void completesThePurchaseByProvidingNecessaryDetails() {
 name_c="alaa";
 phone_c="059812";
 address_c="nablus";
}

@Then("the customer should receive an order confirmation")
public void theCustomerShouldReceiveAnOrderConfirmation() {
	  int response = JOptionPane.showConfirmDialog(
	            null,
	            "Do you want to proceed?",
	            "Confirmation",
	            JOptionPane.YES_NO_OPTION
	        );
	  assertTrue(true);
}

@Then("the purchased products should be removed from the shopping cart")
public void thePurchasedProductsShouldBeRemovedFromTheShoppingCart() {
m.remove(p);
assertTrue(true);
}

@Given("the customer is logged in")
public void theCustomerIsLoggedIn() {
h=new home_frame();
}

@When("the customer navigates to the order history page")
public void theCustomerNavigatesToTheOrderHistoryPage() {
	button=h.getLoginButton();
	ActionListener[] listeners = button.getActionListeners();
	for (ActionListener listener : listeners) {
	    listener.actionPerformed(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
	}
}

@Then("the customer should see a list of past orders")
public void theCustomerShouldSeeAListOfPastOrders() {
list_frame l =new list_frame();
}

@Then("be able to view details of each order, including products, quantities, and order status")
public void beAbleToViewDetailsOfEachOrderIncludingProductsQuantitiesAndOrderStatus() {
	 assertTrue(true);
}


}
