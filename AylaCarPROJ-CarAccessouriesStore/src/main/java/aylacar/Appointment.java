package aylacar;

import java.time.LocalDateTime;
import java.util.Date;

public class Appointment {
    private String customerName;
    private String product;
    private Date scheduledDate;
    private String status;

    public Appointment(String customerName, String product, Date scheduledDate2, String status) {
        this.customerName = customerName;
        this.product = product;
        this.scheduledDate = scheduledDate2;
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", scheduledDate=" + scheduledDate +
                ", status='" + status + '\'' +
                '}';
    }
}
