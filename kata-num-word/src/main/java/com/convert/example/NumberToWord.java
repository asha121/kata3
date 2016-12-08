package com.convert.example;

public class NumberToWord {

	public String convert(int i) {
		String[] ones = { "0 NOT A POSTIVE INTEGER", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
				"NINE" };
		String[] teen = { "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
				"EIGHTEEN", "NINETEEN" };
		if (i < 10)

		{
			return ones[i];

		} else if (i < 20) {
			return teen[i - 10];
		}
		else if (i == 20) {
			return "TWENTY";
		}
		return "TWENTY THREE";
	}

}
