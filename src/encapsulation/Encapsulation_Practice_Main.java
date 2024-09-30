package encapsulation;

public class Encapsulation_Practice_Main {

	public static void main(String[] args) {
		
		Encapsulation_Practice obj = new Encapsulation_Practice("Candles","White",1,50.0);
		System.out.println(obj.getProductName()+" "+obj.getProductColor()+" "+obj.getQuantity()+" "+obj.getPrice());
		
		Encapsulation_Practice obj1 = new Encapsulation_Practice("Candles","Cream",3,50.0);
		System.out.println(obj1.getProductName()+" "+obj1.getProductColor()+" "+obj1.getQuantity()+" "+obj1.getPrice());

	}

}
