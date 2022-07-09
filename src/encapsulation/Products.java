package encapsulation;

public class Products {
	
	String productName;
	String expirydate;
	int  costprice;
	double sellingprice;
	double profitMargin;
	double  discount;
	public Products(String productName, String expirydate) {
		super();
		this.productName = productName;
		this.expirydate = expirydate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public int getCostprice() {
		return costprice;
	}
	public void setCostprice(int costprice) {
		this.costprice = costprice;
	}
	public double getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(double sellingprice) {
		this.sellingprice = sellingprice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
