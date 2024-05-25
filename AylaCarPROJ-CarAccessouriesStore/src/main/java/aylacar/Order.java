package aylacar;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;
    private Installer installer;
    private Date orderDate;
    private double totalAmount;

    public Order(int orderId, Customer customer, ArrayList<Product> products, Installer installer, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.installer = installer;
        this.orderDate = orderDate;
        this.calculateTotalAmount();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Installer getInstaller() {
        return installer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private void calculateTotalAmount() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        this.totalAmount = total;
    }
}

