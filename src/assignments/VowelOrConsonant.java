package assignments;

//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
public class VowelOrConsonant {

	public static void main(String[] args) {
		String alphabet = "  a";
		
		switch (alphabet.toLowerCase().trim()) {
		case "a":
			System.out.println("This is vowel");
			break;
		case "e":
			System.out.println("This is vowel");
			break;
		case "i":
			System.out.println("This is vowel");
			break;
		case "o":
			System.out.println("This is vowel");
			break;
		case "u":
			System.out.println("This is vowel");
			break;
		default:
			System.out.println("This is consonant: "+alphabet);
			break;
		}

	}

}
