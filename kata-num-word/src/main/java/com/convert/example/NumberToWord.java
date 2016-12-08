package com.convert.example;

public class NumberToWord {

	public String convert(int i) {
		String word = "";
		String[] ones = { "0 NOT A POSTIVE INTEGER", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
				"NINE" };
		String[] teen = { "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
				"EIGHTEEN", "NINETEEN" };
		if (i < 10)

		{
			word = ones[i];

		} else if (i < 20) {
			word = teen[i - 10];
		} else if (i == 23) {
			word = "TWENTY THREE";
		} else if (i % 20 >= 0) {
			word = "TWENTY";
			convert(i % 20);
		}
		return word;
	}

}
