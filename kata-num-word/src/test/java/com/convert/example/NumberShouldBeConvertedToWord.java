package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() throws Exception {
		assertEquals("ONE", new NumberToWord().convert(1));
	}
	@Test
	public void check_23_converted_twenty_three() throws Exception {
		assertEquals("TWENTY THREE", new NumberToWord().convert(23));
	}
	@Test
	public void check_2_convert_Two() throws Exception {
		assertEquals("TWO", new NumberToWord().convert(2));
	}
	@Test
	public void check_for_0_convert_Two() throws Exception { 
		assertEquals("0 NOT A POSTIVE INTEGER", new NumberToWord().convert(0));
	}
	
}
