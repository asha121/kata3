package com.convert.example;

/**
 * @author asha121 With recursion and member variable implementation
 */
public class NumberToWord {

	public String convert(int number) {
		String word = "";
		String[] onesAndTeen = { "0 NOT A POSTIVE INTEGER", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ",
				"SEVEN ", "EIGHT ", "NINE ", "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ",
				"SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ", "NINETEEN" };
		String[] enty = { "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY " };
		String[] maxs = { "HUNDRED ", "THOUSAND " };
		if (number < 20) {
			word = onesAndTeen[number];
		} else if (number < 100) {
			word = twoDigitWord((number + "").toCharArray(), onesAndTeen, enty);
		} else if (number < 1000) {
			word = threeDigitWord((number + "").toCharArray(), onesAndTeen, enty, maxs);
		} else {
			word = fourDigitWord((number + "").toCharArray(), onesAndTeen, enty, maxs);
		}
		return word;
	}

	private String fourDigitWord(char[] digit, String[] ones, String[] enty, String[] maxs) {
		int count = 0;
		String word = "";
		for (char charNum : digit) {
			if (charNum != '0') {
				if (count == 0) {
					word = ones[Integer.parseInt(Character.toString(charNum))] + maxs[1];
					count++;
				} else if (count == 1) {
					word += ones[Integer.parseInt(Character.toString(charNum))] + maxs[0];
					count++;
				} else if (count == 2) {
					word += "AND " + enty[Integer.parseInt(Character.toString(charNum)) - 2];
				} else if (Integer.parseInt(Character.toString(charNum)) != 0) {
					word += ones[Integer.parseInt(Character.toString(charNum))];
				}
			} else {
				count++;
			}

		}
		return word;
	}

	private String threeDigitWord(char[] digit, String[] ones, String[] enty, String[] maxs) {
		int count = 0;
		String word = "";
		for (char charNum : digit) {
			if (charNum != '0') {
				if (count == 0) {
					word = ones[Integer.parseInt(Character.toString(charNum))] + maxs[0];
					count++;
				} else if (count == 1) {
					word += "AND " + enty[Integer.parseInt(Character.toString(charNum)) - 2];
					count++;
				} else if (Integer.parseInt(Character.toString(charNum)) != 0) {
					word += ones[Integer.parseInt(Character.toString(charNum))];
				}
			} else {
				count++;
			}

		}
		return word;
	}

	private String twoDigitWord(char[] digit, String[] ones, String[] enty) {
		int count = 0;
		String word = "";
		for (char charNum : digit) {
			if (count == 0) {
				word = enty[Integer.parseInt(Character.toString(charNum)) - 2];
				count++;
			} else if (Integer.parseInt(Character.toString(charNum)) != 0) {
				word += ones[Integer.parseInt(Character.toString(charNum))];
			}

		}
		return word;
	}
}
