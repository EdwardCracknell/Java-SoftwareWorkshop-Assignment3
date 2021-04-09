package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListDictionary implements Dictionary {

	private ArrayList<WordSig> dictionary;

	public ListDictionary(String path) {
		dictionary = new ArrayList<WordSig>();
		try {
			Scanner s = new Scanner(new File(path));
			while (s.hasNext()) {
				String w = s.nextLine().toLowerCase();
				if (PredictivePrototype.isValidWord(w)) {

					dictionary.add(new WordSig(w, PredictivePrototype.wordToSignature(w)));
				}
			}
			Collections.sort(dictionary);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * this method finds possible words that correspond to a a given signature
	 */
	@Override
	public Set<String> signatureToWords(String signature) {
		if(signature == ""){
			return new TreeSet<String>();
		}else{
			int value = Collections.binarySearch(dictionary, new WordSig("", signature));

			Set<String> output = new TreeSet<String>();
			output.add(dictionary.get(value).getWords());
			int i = value+ 1;
			while (dictionary.get(i).compareTo(new WordSig("", signature)) == 0) {
				output.add(dictionary.get(i).getWords());
				i++;
			}
			int j = value- 1;
			while (dictionary.get(j).compareTo(new WordSig("", signature)) == 0) {
				output.add(dictionary.get(j).getWords());
				j--;
			}

			return output;
			
		}
	}

//	public static void main(String[] args){
//		ListDictionary ld = new ListDictionary("words");
//		System.out.println(ld.signatureToWords("75"));
//	}

}
