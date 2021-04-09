package predictive;

/**
 * 
 * @author Edward Cracknell
 * 
 *         Class to store the words and signatures of the elements in our set of
 *         strings
 *
 */
public class WordSig implements Comparable<WordSig> {
	private String words;
	private String signature;

	/**
	 * 
	 * @param words
	 *            that are given
	 * @param signature
	 *            that matches the given word
	 */
	public WordSig(String words, String signature) {
		this.words = words;
		this.signature = signature;
	}

	/**
	 * 
	 * @return words in the Wordsig
	 */
	public String getWords() {
		return this.words;
	}

	/**
	 * 
	 * @return signature in the Wordsig
	 */
	public String getSignature() {
		return this.signature;
	}

	/**
	 * 
	 * @param words
	 *            that were setting to be the new words
	 */
	public void setWords(String words) {
		this.words = words;
	}

	/**
	 * 
	 * @param signature
	 *            that were setting to be the new signature
	 */
	public void getSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * Because we have implemented comparable we can compare the Wordsig ws
	 * arguments signature with the with the signature.
	 */
	public int compareTo(WordSig ws) {

		return this.signature.compareTo(ws.signature);
	}

}
