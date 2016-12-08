package com.convert.example;

public class NumberToWord {

	public String convert(int i) {
		String[] ones = { "0 NOT A POSTIVE INTEGER", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
				"NINE" };
		if (i > 10)

		{
			return "TWENTY THREE";
		}
		return ones[i];
	}

}
