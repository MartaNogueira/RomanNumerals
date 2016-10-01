import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {

		RomanNumerals obj = new RomanNumerals();
		int numb = obj.convertToInteger("vii");

		assertEquals("", 7, numb);

	}

}
