package abstractionPractice;

public abstract class GrandParentPage {
	
	//
	public GrandParentPage() {
		System.out.println("grand parent page const...default");
	}
	
	public GrandParentPage(int a) {
		System.out.println("grand parent page const..." + a);
	}
	
	public GrandParentPage(int a, int b) {
		System.out.println("grand parent page const..." + a+b);
	}
	
	

}
