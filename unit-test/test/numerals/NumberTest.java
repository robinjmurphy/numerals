package test.numerals;

import static org.junit.Assert.*;
import org.junit.Test;
import numerals.Number;

public class NumberTest {

	@Test
	public void conversionToRomanNumerals() {
		Number n1 = new Number(1);
		assertEquals("I", n1.toRoman());
		Number n2 = new Number(2);
		assertEquals("II", n2.toRoman());
		Number n3 = new Number(3);
		assertEquals("III", n3.toRoman());
		Number n4 = new Number(4);
		assertEquals("IV", n4.toRoman());
		Number n5 = new Number(5);
		assertEquals("V", n5.toRoman());
		Number n9 = new Number(9);
		assertEquals("IX", n9.toRoman());
		Number n10 = new Number(10);
		assertEquals("X", n10.toRoman());
		Number n54 = new Number(54);
		assertEquals("LIV", n54.toRoman());
		Number n100 = new Number(100);
		assertEquals("C", n100.toRoman());
	}

}
