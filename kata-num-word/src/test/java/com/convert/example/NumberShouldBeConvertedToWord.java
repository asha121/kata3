package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() throws Exception {
		assertEquals("ONE ", new NumberToWord().convert(1));
	}

	@Test
	public void check_23_converted_twenty_three() throws Exception {
		assertEquals("TWENTY THREE ", new NumberToWord().convert(23));
	}

	@Test
	public void check_2_convert_Two() throws Exception {
		assertEquals("TWO ", new NumberToWord().convert(2));
	}

	@Test
	public void check_for_0_convert_Two() throws Exception {
		assertEquals("0 NOT A POSTIVE INTEGER", new NumberToWord().convert(0));
	}
	@Test
	public void check_for_11_convert_eleven() throws Exception {
		assertEquals("ELEVEN ", new NumberToWord().convert(11));
	}
	@Test
	public void check_for_19_convert_ninteen() throws Exception {
		assertEquals("NINETEEN", new NumberToWord().convert(19));
	}
	@Test
	public void check_for_20_convert_tweenty() throws Exception {
		assertEquals("TWENTY ", new NumberToWord().convert(20));
	}
	@Test
	public void check_for_25_convert_tweentyfive() throws Exception {
		assertEquals("TWENTY FIVE ", new NumberToWord().convert(25));
	}
	@Test
	public void check_for_50_convert_fifty() throws Exception {
		assertEquals("FIFTY ", new NumberToWord().convert(25));
	}

}
