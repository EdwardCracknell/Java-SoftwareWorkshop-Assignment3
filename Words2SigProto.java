package predictive;

import java.awt.List;

import java.util.TreeSet;

public class Words2SigProto {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(PredictivePrototype.wordToSignature(args[i]));
		}
	}

}
