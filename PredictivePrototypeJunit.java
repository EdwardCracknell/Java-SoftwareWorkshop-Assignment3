package predictive;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author Edward Cracknell Simple tests to test the methods wordToSignature and
 *         signatureToWords methods in the PredictivePrototype class
 *
 */
public class PredictivePrototypeJunit {

	@Test
	public void test1() {

		String expected = "78383";

		String result = PredictivePrototype.wordToSignature("steve");

		assertEquals(expected, result);

	}

	@Test
	public void test2() {
		String expected = "7445547";

		String result = PredictivePrototype.wordToSignature("Phillip");

		assertEquals(expected, result);

	}

	@Test
	public void test3() {
		String expected = "";

		String result = PredictivePrototype.wordToSignature("");

		assertEquals(expected, result);

	}

	@Test
	public void test4() {
		String expected = "2272 2232272";

		String result = PredictivePrototype.wordToSignature("Abra Cadabra");

		assertEquals(expected, result);

	}

	@Test
	public void test5() {
		Set<String> expected = new HashSet<String>();

		expected.add("a");
		expected.add("b");
		expected.add("c");

		Set<String> result = PredictivePrototype.signatureToWords("2");

		assertEquals(expected, result);
	}

	@Test
	public void test6() {

		Set<String> expected = new HashSet<String>();
		expected.add("mlg");
		expected.add("mli");
		expected.add("oki");
		expected.add("olg");

		Set<String> result = PredictivePrototype.signatureToWords("654");

		assertEquals(expected, result);

	}

	@Test
	public void test7() {
		Set<String> expected = new HashSet<String>();

		Set<String> result = PredictivePrototype.signatureToWords("");

		assertEquals(expected, result);
	}

	@Test
	public void test8() {

		Set<String> expected = new HashSet<String>();
		expected.add("thak");
		expected.add("tick");
		expected.add("vial");
		expected.add("vick");

		Set<String> result = PredictivePrototype.signatureToWords("8425");

		assertEquals(expected, result);

	}

}
