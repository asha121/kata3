package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() {
		assertEquals("ONE ", new NumberToWord().convert(1));
	}

	@Test
	public void check_23_converted_twenty_three() {
		assertEquals("TWENTY THREE ", new NumberToWord().convert(23));
	}

	@Test
	public void check_2_convert_Two() {
		assertEquals("TWO ", new NumberToWord().convert(2));
	}

	@Test
	public void check_for_0_convert_zero() {
		assertEquals("0 NOT A POSTIVE INTEGER", new NumberToWord().convert(0));
	}

	@Test
	public void check_for_11_convert_eleven() {
		assertEquals("ELEVEN ", new NumberToWord().convert(11));
	}

	@Test
	public void check_for_19_convert_ninteen() {
		assertEquals("NINETEEN", new NumberToWord().convert(19));
	}

	@Test
	public void check_for_20_convert_tweenty() {
		assertEquals("TWENTY ", new NumberToWord().convert(20));
	}

	@Test
	public void check_for_25_convert_tweentyfive() {
		assertEquals("TWENTY FIVE ", new NumberToWord().convert(25));
	}

	@Test
	public void check_for_50_convert_fifty() {
		assertEquals("FIFTY ", new NumberToWord().convert(50));
	}

	@Test
	public void check_for_79_convert_seventyNine() {
		assertEquals("SEVENTY NINE ", new NumberToWord().convert(79));
	}

	@Test
	public void check_for_100_convert_hundred() {
		assertEquals("ONE HUNDRED ", new NumberToWord().convert(100));
	}

	@Test
	public void check_for_120_convert_hundredtwenty() {
		assertEquals("ONE HUNDRED AND TWENTY ", new NumberToWord().convert(120));
	}

	@Test
	public void check_for_179_convert_hundred_seventy_nine() {
		assertEquals("ONE HUNDRED AND SEVENTY NINE ", new NumberToWord().convert(179));
	}

	@Test
	public void check_for_998_convert_nine_hundred_ninety() {
		assertEquals("NINE HUNDRED AND NINETY EIGHT ", new NumberToWord().convert(998));
	}

	@Test
	public void check_for_1000_convert_one_thousand() {
		assertEquals("ONE THOUSAND ", new NumberToWord().convert(1000));
	}

	@Test
	public void check_for_1700_convert_one_thousand_seven_hundred() {
		assertEquals("ONE THOUSAND SEVEN HUNDRED ", new NumberToWord().convert(1700));
	}

	@Test
	public void check_for_1720_convert_one_thousand_seven_hundred_twenty() {
		assertEquals("ONE THOUSAND SEVEN HUNDRED AND TWENTY ", new NumberToWord().convert(1720));
	}

	@Test
	public void check_for_903_convert_nine_hundred_three() {
		assertEquals("NINE HUNDRED THREE ", new NumberToWord().convert(903));
	}

	@Test
	public void check_for_807_convert_nine_thousand_eight_hundred_seven() {
		assertEquals("EIGHT HUNDRED SEVEN ", new NumberToWord().convert(807));
	}

	@Test
	public void check_for_1807_convert_one_thousand_nine_thousand_eight_hundred_seven() {
		assertEquals("ONE THOUSAND EIGHT HUNDRED SEVEN ", new NumberToWord().convert(1807));
	}

	@Test
	public void check_for_004_convert_four() {
		assertEquals("FOUR ", new NumberToWord().convert(004));
	}

}
