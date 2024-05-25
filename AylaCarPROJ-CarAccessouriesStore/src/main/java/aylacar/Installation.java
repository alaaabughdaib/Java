package aylacar;

import java.util.Date;

public class Installation {
    private int installationId;
    private String customerName;
    private String installerName;
    private Date date;
    private String status;

    public Installation(int installationId, String customerName, String installerName, Date date, String status) {
        this.installationId = installationId;
        this.customerName = customerName;
        this.installerName = installerName;
        this.date = date;
        this.status = status;
    }

    // Getters and setters for the fields

    public Installation() {
		// TODO Auto-generated constructor stub
	}

	public int getInstallationId() {
        return installationId;
    }

    public void setInstallationId(int installationId) {
        this.installationId = installationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInstallerName() {
        return installerName;
    }

    public void setInstallerName(String installerName) {
        this.installerName = installerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public boolean checkComplete() {
		
		if( status=="complelte") {
			return true;
		}
		else
			return false;
	}
}
