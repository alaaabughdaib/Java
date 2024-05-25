package aylacar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Manage {
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Installer> installers;
    private ArrayList<Order> orders;
    private ArrayList<Installation> installation;
    private ArrayList<Appointment> scheduledAppointments;
    Customer c;
    private static final Logger logger = Logger.getLogger(Manage.class.getName());


    public Manage() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        installers = new ArrayList<>();
        orders = new ArrayList<>();
        
        c= new Customer("123224" , "Ayla", "0591234","Ayla@aylacar" , "nablus", "1234");
        customers.add(c);
        
     
        
        
    }

    // Methods to add and retrieve data
    
    public void checkvalidlogin(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                
               home_frame fh = new home_frame();
            }
        }
        logger.log(Level.INFO, "Emai or Password incorrect !");
        
      
        
    }

    
    public void updateProductRatingAndComment(Product p, String comment, String rating) {
        for (Product product : products) {
            if (product.equals(p)) { // Assuming there's an appropriate equals method in the Product class
                 product.setComments(comment);
                product.setRatings(rating);
                
        }
    
        }}
    public boolean customerExistsByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return true; // Customer with the given email exists
            }
        }
        return false; 
       
    }
    
    public void isEmailEmpty(String email) {
        if( email == null)
        	   logger.log(Level.INFO, "Emai is empty ");
        
        	
    }
    
    public void isPasswordEmpty(String password) {
        if( password == null)
        	 logger.log(Level.INFO, "Emai is empty !");
        
    }
    
    public void updateCustomerInfo(Customer c, String newEmail, String newPassword) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(c.getEmail())) {
                
                customer.setEmail(newEmail);
                customer.setPassword(newPassword);
                logger.log(Level.INFO, "Customer information updated successfully!");
                
                
            
                return; // No need to continue looping once the customer is found and updated
            }
        }
  
       
    }
    
    
    public boolean isCustomerPasswordCorrect(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
            	   logger.log(Level.INFO, " Password Correct !");
                   
                return true; // Provided password is correct for the customer with the given email
            }
        }
        logger.log(Level.INFO, " Password incorrect !");
        
        return false; // Password is incorrect for the customer with the given email
    }
    
    

    private boolean isEmailUnique(String email) {
        for (Customer existingCustomer : customers) {
            if (existingCustomer.getEmail().equals(email)) {
                return false; // Email is not unique
            }
        }
        return true; // Email is unique
    }
    
    public void addCustomer(Customer customer) {
        if (customer != null
                && customer.getCustomerId() != null
                && customer.getName() != null
                && customer.getPhoneNumber() != null
                && customer.getEmail() != null
                && customer.getAddress() != null
                && customer.getPassword() != null) {

            // Check if email is unique
            if (isEmailUnique(customer.getEmail())) {
                customers.add(customer);
                logger.log(Level.INFO, "Customer added successfully!");
               
            } else {
            	logger.log(Level.INFO, "Email is already associated with another customer. Cannot add customer!");
            	
                }
        } else {
        	logger.log(Level.INFO, "Customer information is incomplete. Cannot add customer!");
        
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addInstaller(Installer installer) {
        installers.add(installer);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Installer> getInstallers() {
        return installers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

	
	public void sendemail() {
		// TODO Auto-generated method stub
		
	}
	
	
	   public void searchProductByName(String productName) {
	        boolean productExists = false;
	        for (Product product : products) {
	            if (product.getName().equalsIgnoreCase(productName)) {
	                productExists = true;
	                break;
	            }
	        }

	        // Display a message dialog based on whether the product exists or not
	        String message;
	        if (productExists) {
	            message = "Product '" + productName + "' exists!";
	        } else {
	            message = "Product '" + productName + "' does not exist.";
	        }

	        logger.log(Level.INFO, message);
	    }

	 public List<Product> filterProductsByCategory(String category) {
	        List<Product> filteredProducts = new ArrayList<>();

	        for (Product product : products) {
	            if (product.getCategory().equalsIgnoreCase(category)) {
	                filteredProducts.add(product);
	            }
	        }

	        return filteredProducts;
	    }

	 public void addToCart(Product p) {
	        c.cart.add(p);
	        logger.log(Level.INFO,  "Product added to cart " );
	       
	    }

	public void remove(Product p) {
		c.cart.remove(p);
		
	}

	public void checkinstallationrequest() {
		   System.out.println("Contents of the 'installations' ArrayList:");
	        for (Installation installation : installation) {
	        	
	            System.out.println(installation);
	        }
	}

	 public void schedule(String customerName, String productname, Date scheduledDate) {
	        // Assuming you have an Appointment class
	        Appointment appointment = new Appointment(customerName, productname, scheduledDate, "Scheduled");

	        logger.log(Level.INFO,"Customer: " + appointment.getCustomerName() );
	        logger.log(Level.INFO,"Product: " + appointment.getProduct());
	        logger.log(Level.INFO,"Scheduled Date: " + appointment.getScheduledDate());
	        logger.log(Level.INFO,"Status: " + appointment.getStatus());
	        
	  

	        // Add the appointment to the list of scheduled appointments
	        scheduledAppointments.add(appointment);
	    }

	public void checkscheduledappointment() {
		 System.out.println("Scheduled Appointments :");
	        for (Appointment appointment : scheduledAppointments) {
	            System.out.println(appointment);
	        }
		
	}

	public void viewproducts() {
		 System.out.println("Available Products :");
		  for (Product product : products) {
	            System.out.println(product);
	        }
		
	}




	
	
	
	
	
	
	
	
}






