package aylacar;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;
    List<Product> cart;

    public Customer() {
        this.customerId = customerId;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password=password;
        cart = new ArrayList<>();
    }
    public Customer(String customerId , String name, String phonenumber ,String email, String address , String password ) {
        this.customerId = customerId;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password=password;
    }

    // Getters and Setters for the properties

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customeId) {
        this.customerId = customeId;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	public void update(String name2, String email2) {
		email=email2;
		name=name2;
		
	}
	
	
}
