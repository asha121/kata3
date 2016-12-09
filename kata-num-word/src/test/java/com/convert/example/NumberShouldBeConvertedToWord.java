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
	public void check_for_0_convert_zero() throws Exception {
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
		assertEquals("FIFTY ", new NumberToWord().convert(50));
	}

	@Test
	public void check_for_79_convert_seventyNine() throws Exception {
		assertEquals("SEVENTY NINE ", new NumberToWord().convert(79));
	}

	@Test
	public void check_for_100_convert_hundred() throws Exception {
		assertEquals("ONE HUNDRED ", new NumberToWord().convert(100));
	}

	@Test
	public void check_for_120_convert_hundredtwenty() throws Exception {
		assertEquals("ONE HUNDRED AND TWENTY ", new NumberToWord().convert(120));
	}

	@Test
	public void check_for_179_convert_hundred_seventy_nine() throws Exception {
		assertEquals("ONE HUNDRED AND SEVENTY NINE ", new NumberToWord().convert(179));
	}

	@Test
	public void check_for_998_convert_nine_hundred_ninety() throws Exception {
		assertEquals("NINE HUNDRED AND NINETY EIGHT ", new NumberToWord().convert(998));
	}

	@Test
	public void check_for_1000_convert_one_thousand() throws Exception {
		assertEquals("ONE THOUSAND ", new NumberToWord().convert(1000));
	}

	@Test
	public void check_for_1700_convert_one_thousand_seven_hundred() throws Exception {
		assertEquals("ONE THOUSAND SEVEN HUNDRED ", new NumberToWord().convert(1700));
	}

	@Test
	public void check_for_1720_convert_one_thousand_seven_hundred_twenty() throws Exception {
		System.out.println(new NumberToWord().convert(1720));
		assertEquals("ONE THOUSAND SEVEN HUNDRED AND TWENTY ", new NumberToWord().convert(1720));
	}

	@Test
	public void check_for_903_convert_nine_hundred_three() throws Exception {
		assertEquals("NINE HUNDRED THREE ", new NumberToWord().convert(903));
	}

	@Test
	public void check_for_807_convert_nine_thousand_eight_hundred_seven() throws Exception {
		assertEquals("EIGHT HUNDRED SEVEN ", new NumberToWord().convert(807));
	}

	@Test
	public void check_for_1807_convert_one_thousand_nine_thousand_eight_hundred_seven() throws Exception {
		assertEquals("ONE THOUSAND EIGHT HUNDRED SEVEN ", new NumberToWord().convert(1807));
	}
	@Test
	public void check_for_004_convert_four() throws Exception {
		assertEquals("FOUR ", new NumberToWord().convert(004));
	}

}
