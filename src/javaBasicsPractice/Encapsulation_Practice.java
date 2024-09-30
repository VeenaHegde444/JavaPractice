package javaBasicsPractice;

/*1. if user enters 'cream' color candle, show them a msg 'its not in stock'
 * 2.if user enters quantity less than 2, show them a msg 'minimum order quantity is 2'
 */
public class Encapsulation_Practice {

	//private variables
	private String productName;
	private String productColor;
	private int quantity;
	private double price;
	
	
	//public constructor
	public Encapsulation_Practice(String productName,String productColor,int quantity,double price) {
		
		this.productName=productName;
	//	this.productColor=productColor;
		
		if(productColor.equals("Cream")) {
		System.out.println("Cream color candles not in stock.");
		this.productColor=productColor;
	    }
	/*	else {
			this.productColor=productColor;
		}
		*/

		if(this.quantity<2) {
			System.out.println("Not applicable for shipping, minimum order quantity is 2.");
			this.quantity=quantity;
		}
	/*	else {
			this.quantity=quantity;
		}
	*/	
	//	this.quantity=quantity;
		this.price=price;
		
	}

	//public getters & setters
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		
		if(productColor.equals("Cream")) {
		System.out.println("Cream color candles not in stock");
		this.productColor=productColor;	
	    }
	/*	else {
			this.productColor=productColor;	
		}
	*/	
    }
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(this.quantity<2) {
			System.out.println("Minimum order quantity is 2, please enter the correct quantity");
			this.quantity = quantity;
		}
	/*	else {
		this.quantity = quantity;
		}
	*/	
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
