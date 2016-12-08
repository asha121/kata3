package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() {
		assertEquals("ONE", new NumberToWord().convert(1));
	}
	@Test
	public void check_23_converted_twenty_three() {
		assertEquals("TWENTY THREE", new NumberToWord().convert(23));
	}
}
