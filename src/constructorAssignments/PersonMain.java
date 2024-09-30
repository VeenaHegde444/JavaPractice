package constructorAssignments;

public class PersonMain {

	public static void main(String[] args) {
		Person obj = new Person("Peter",25,'M',1.6);
		System.out.println(obj.name+" "+obj.age+" "+obj.gender+" "+obj.height);
		
		Person obj1 = new Person("Samantha",35,'F',1.8);
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.gender+" "+obj1.height);

	}

}
