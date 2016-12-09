package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToWordShould {

	@Test
	public void change_1_to_one() {
		assertEquals("ONE ", new NumberToWord().digitToWord(1));
	}

	@Test
	public void change_23_to_twenty_three() {
		assertEquals("TWENTY THREE ", new NumberToWord().digitToWord(23));
	}

	@Test
	public void change_2_to_Two() {
		assertEquals("TWO ", new NumberToWord().digitToWord(2));
	}

	@Test
	public void change_0_to_zero() {
		assertEquals("", new NumberToWord().digitToWord(0));
	}

	@Test
	public void change_11_to_eleven() {
		assertEquals("ELEVEN ", new NumberToWord().digitToWord(11));
	}

	@Test
	public void change_19_to_ninteen() {
		assertEquals("NINETEEN", new NumberToWord().digitToWord(19));
	}

	@Test
	public void change_20_to_tweenty() {
		assertEquals("TWENTY ", new NumberToWord().digitToWord(20));
	}

	@Test
	public void change_25_to_tweentyfive() {
		assertEquals("TWENTY FIVE ", new NumberToWord().digitToWord(25));
	}

	@Test
	public void change_50_to_fifty() {
		assertEquals("FIFTY ", new NumberToWord().digitToWord(50));
	}

	@Test
	public void change_79_to_seventyNine() {
		assertEquals("SEVENTY NINE ", new NumberToWord().digitToWord(79));
	}

	@Test
	public void change_100_to_hundred() {
		assertEquals("ONE HUNDRED ", new NumberToWord().digitToWord(100));
	}

	@Test
	public void change_120_to_hundredtwenty() {
		assertEquals("ONE HUNDRED AND TWENTY ", new NumberToWord().digitToWord(120));
	}

	@Test
	public void change_179_to_hundred_seventy_nine() {
		assertEquals("ONE HUNDRED AND SEVENTY NINE ", new NumberToWord().digitToWord(179));
	}

	@Test
	public void changer_998_to_nine_hundred_ninety() {
		assertEquals("NINE HUNDRED AND NINETY EIGHT ", new NumberToWord().digitToWord(998));
	}

	@Test
	public void change_1000_to_one_thousand() {
		assertEquals("ONE THOUSAND ", new NumberToWord().digitToWord(1000));
	}

	@Test
	public void change_1700_to_one_thousand_seven_hundred() {
		assertEquals("ONE THOUSAND SEVEN HUNDRED ", new NumberToWord().digitToWord(1700));
	}

	@Test
	public void change_1720_to_one_thousand_seven_hundred_twenty() {
		assertEquals("ONE THOUSAND SEVEN HUNDRED AND TWENTY ", new NumberToWord().digitToWord(1720));
	}

	@Test
	public void change_903_to_nine_hundred_three() {
		assertEquals("NINE HUNDRED AND THREE ", new NumberToWord().digitToWord(903));
	}

	@Test
	public void change_807_to_nine_thousand_eight_hundred_seven() {
		assertEquals("EIGHT HUNDRED AND SEVEN ", new NumberToWord().digitToWord(807));
	}

	@Test
	public void change_1807_to_one_thousand_nine_thousand_eight_hundred_seven() {
		assertEquals("ONE THOUSAND EIGHT HUNDRED AND SEVEN ", new NumberToWord().digitToWord(1807));
	}

	@Test
	public void change_004_to_four() {
		assertEquals("FOUR ", new NumberToWord().digitToWord(004));
	}

}
