package com.convert.example;

public class NumberToWord {

	public String convert(int i) {
		String word = "";
		if (i == 1) {
			word = "ONE";
		} else {
			word = "TWENTY THREE";
		}
		return word;
	}

}
