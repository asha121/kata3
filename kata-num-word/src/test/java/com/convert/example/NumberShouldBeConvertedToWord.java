package com.convert.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberShouldBeConvertedToWord {

	@Test
	public void check_1_converted_one() {
		assertEquals("ONE", new NumberToWord().convert(1));
	}
}
