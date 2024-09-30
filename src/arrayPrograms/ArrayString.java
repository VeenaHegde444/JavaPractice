package arrayPrograms;
//Write a function which takes an array of strings & search string, in this function it should print only those strings of array
//which have the given search string in it
public class ArrayString {
	
	public void sample(String[] ip, String search) {
		for(int i=0;i<ip.length;i++) {
			if(ip[i].contains(search)) {
				System.out.println(ip[i]); 
			}
		}
	}

	public static void main(String[] args) {
		ArrayString a1 = new ArrayString();
		String[] s1 = {"Java","Python","Ruby","Testing"};
		a1.sample(s1, "y");
	}

}
