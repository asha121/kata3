package com.convert.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() {
		NumberToWord digitWord = new NumberToWord();
		assertEquals("ONE",digitWord.convert(1));
	}

}
