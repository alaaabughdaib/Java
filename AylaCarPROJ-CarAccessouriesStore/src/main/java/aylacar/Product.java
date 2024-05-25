package aylacar;

public class Product {
    private int productId;
    private String name;
    private double cost;
    private String description;
    private int quantity;
    private String comment;
    private String rating;
    private String category;
    boolean productDone;
    int productStatus;
    String picture;

    
    public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public boolean isProductDone() {
		return productDone;
	}



	public void setProductDone(boolean productDone) {
		this.productDone = productDone;
	}



	public int getProductStatus() {
		return productStatus;
	}



	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}



	public String getPicture() {
		return picture;
	}



	public void setPicture(String picture) {
		this.picture = picture;
	}



	public Product(int productId,String productName,String category,String picture,double cost,boolean productDone, int productStatus,String description,int quantity,String rating,String comment) {   
    	this.productId = productId;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.quantity = quantity;
        this.rating=rating;
        this.comment=comment;
        this.category=category;
        this.productDone=productDone;
        this.productStatus=productStatus;
        this.picture=picture;
    }

 

    public String getComments() {
		return comment;
	}

	public void setComments(String comments) {
		this.comment = comments;
	}

	public String getRatings() {
		return rating;
	}

	public void setRatings(String rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return cost;
    }

    public void setPrice(double price) {
        this.cost = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



	
}
