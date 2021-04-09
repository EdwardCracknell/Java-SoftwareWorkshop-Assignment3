package predictive;

public class Sigs2WordsList {
	
	public static void main(String[] args) {
		
		ListDictionary ld = new ListDictionary("words");
		for (int i = 0; i < args.length; i++) {

			System.out.println(ld.signatureToWords(args[i]));
		}

	}

}
