package com.convert.example;

public class NumberToWord {

	public String convert(int number) {
		String word = "";
		String[] ones = { "0 NOT A POSTIVE INTEGER", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ",
				"EIGHT ", "NINE " };
		String[] teen = { "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ",
				"EIGHTEEN ", "NINETEEN" };
		String[] enty = { "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY " };
		if (number < 10) {
			word = ones[number];
		} else if (number < 20) {
			word = teen[number - 10];
		} else if (number < 100) {
			char digit[] = (number + "").toCharArray();
			int count = 0;
			for (char charNum : digit) {
				if (count == 0) {
					word = enty[Integer.parseInt(Character.toString(charNum)) - 2];
					count++;
				} else if(Integer.parseInt(Character.toString(charNum))!=0) {
					word += ones[Integer.parseInt(Character.toString(charNum))];
				}

			}
		}
		return word;
	}
}
