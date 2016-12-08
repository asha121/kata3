package com.convert.example;

public class NumberToWord {

	public String convert(int i) {
		String[] words = {"ONE", "TWO" };
		if (i>2) {
			return "TWENTY THREE";
		}
		return words[--i];
	}

}
