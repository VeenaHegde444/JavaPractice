package constructorAssignments;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota","Camry",2020);
		Car car2 = new Car("Honda","Accord",2019);
		Car car3 = new Car();
		
		System.out.println(car1.getMake()+" "+car1.getModel()+" "+car1.getYear());
		System.out.println(car2.getMake()+" "+car2.getModel()+" "+car2.getYear());
		System.out.println(car3.getMake()+" "+car3.getModel()+" "+car3.getYear());

	}

}
