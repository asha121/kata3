package com.convert.example;

public class NumberToWord {

	public String convert(int number) {
		String word = "";
		String[] ones = { "0 NOT A POSTIVE INTEGER", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ",
				"EIGHT ", "NINE " };
		String[] teen = { "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ",
				"EIGHTEEN ", "NINETEEN" };
		String[] enty = { "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY " };
		String[] maxs = { "HUNDRED ", "THOUSAND " };

		if (number < 10) {
			word = ones[number];
		} else if (number < 20) {
			word = teen[number - 10];
		} else if (number < 100) {
			word = digitNumber(number, word, ones, enty, maxs);
		} else if (number < 1000) {
			word = digitNumber(number, word, ones, enty, maxs);
		} else if (number >= 1000) {
			word = digitNumber(number, word, ones, enty, maxs);
		}
		return word;
	}

	private String digitNumber(int number, String word, String[] ones, String[] enty, String[] maxs) {
		char digit[] = (number + "").toCharArray();
		int count = 0;
		if (digit.length == 2) {
			for (char charNum : digit) {
				if (count == 0) {
					word = enty[Integer.parseInt(Character.toString(charNum)) - 2];
					count++;
				} else if (Integer.parseInt(Character.toString(charNum)) != 0) {
					word += ones[Integer.parseInt(Character.toString(charNum))];
				}

			}
		} else if (digit.length == 3) {
			for (char charNum : digit) {
				if (charNum != '0') {
					if (count == 0) {
						word = ones[Integer.parseInt(Character.toString(charNum))] + maxs[0];
						count++;
					} else if (count == 1) {
						word += enty[Integer.parseInt(Character.toString(charNum)) - 2];
						count++;
					} else if (Integer.parseInt(Character.toString(charNum)) != 0) {
						word += ones[Integer.parseInt(Character.toString(charNum))];
					}
				}

			}
		}else if (digit.length == 4) {
			for (char charNum : digit) {
				if (charNum != '0') {
					if (count == 0) {
						word = ones[Integer.parseInt(Character.toString(charNum))] + maxs[1];
						count++;
					} else if (count == 1) {
						word += ones[Integer.parseInt(Character.toString(charNum))] + maxs[0];
						count++;
					} else if (count == 2) {
						word += enty[Integer.parseInt(Character.toString(charNum))-2];
					}else if (Integer.parseInt(Character.toString(charNum)) != 0) {
						word += ones[Integer.parseInt(Character.toString(charNum))];
					}
				}

			}
		}

		return word;
	}
}
