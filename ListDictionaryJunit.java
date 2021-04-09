package predictive;


/**
 * 
 * @author Edward Cracknell
 *
 *
 *  Simple test to check my solution.
 *
 */

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class ListDictionaryJunit {
	
	private Dictionary ld;
	
	@Before
	public void setUp() throws IOException {
		ld = new ListDictionary("words");
	}

	@Test
	public void test1() {
		Set<String> expected = new TreeSet<String>();

		expected.add("lawk");
		

		Set<String> result = ld.signatureToWords("5295");

		assertEquals(expected, result);
		
	}
	@Test
	public void test2(){
		Set<String> expected = new TreeSet<String>();
		
		expected.add("ad");
		expected.add("ae");
		expected.add("af");
		expected.add("bd");
		expected.add("be");
		expected.add("bf");
		expected.add("cd");
		expected.add("ce");
		expected.add("cf");

		Set<String> result = ld.signatureToWords("23");
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test3(){
		Set<String> expected = new TreeSet<String>();
			
		Set<String> result = ld.signatureToWords("");
		
		assertEquals(expected,result);
			
	}
	
	@Test
	public void test4(){
		
Set<String> expected = new TreeSet<String>();
		expected.add("pk");
		expected.add("pl");
		expected.add("ql");
		expected.add("rj");
		expected.add("rl");
		expected.add("sj");
		expected.add("sk");
		expected.add("sl");

		Set<String> result = ld.signatureToWords("75");
		
		assertEquals(expected,result);
		
	}

}
