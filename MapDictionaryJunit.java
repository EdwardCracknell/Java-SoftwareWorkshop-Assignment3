package predictive;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Edward Cracknell
 * 
 *         Simple tests to check my solution
 *
 */
public class MapDictionaryJunit {

	private Dictionary mp;

	// /usr/share/dict/
	@Before
	public void setUp() throws IOException {
		mp = new MapDictionary("words");
	}

	@Test
	public void test1() {

		Set<String> expected = new TreeSet<String>();

		expected.add("ljbf");
		

		Set<String> result = mp.signatureToWords("5523");

		assertEquals(expected, result);

	}
	@Test
	public void test2() {

		Set<String> expected = new TreeSet<String>();

		Set<String> result = mp.signatureToWords("");

		assertEquals(expected, result);
	}

	@Test
	public void test3() {
		Set<String> expected = new TreeSet<String>();
		expected.add("pam");
		expected.add("pan");
		expected.add("pao");
		expected.add("pbm");
		expected.add("pcm");
		expected.add("pcn");
		expected.add("pco");
		expected.add("qam");
		expected.add("ram");
		expected.add("ran");
		expected.add("rao");
		expected.add("rcm");
		expected.add("rcn");
		expected.add("rco");
		expected.add("sam");
		expected.add("san");
		expected.add("sao");
		expected.add("scm");
		expected.add("sco");
		

		Set<String> result = mp.signatureToWords("726");

		assertEquals(expected, result);
	}
	@Test
	public void test4(){
		Set<String> expected = new TreeSet<String>();
		expected.add("maj");
		expected.add("mak");
		expected.add("mal");
		expected.add("mcj");
		expected.add("nak");
		expected.add("oak");
		expected.add("obj");
		expected.add("obl");
		expected.add("ock");
		
		

		Set<String> result = mp.signatureToWords("625");

		assertEquals(expected, result);
		
	}

}
