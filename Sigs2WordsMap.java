package predictive;

public class Sigs2WordsMap {
	
	public static void main(String[] args) {
		MapDictionary md = new MapDictionary("words");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(md.signatureToWords(args[i]));
		}
	}

}
