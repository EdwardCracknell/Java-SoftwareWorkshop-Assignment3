package predictive;

import java.awt.List;
import java.io.FileNotFoundException;

public class Sigs2WordsProto {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {

			System.out.println(PredictivePrototype.signatureToWords(args[i]));
		}

	}

}
