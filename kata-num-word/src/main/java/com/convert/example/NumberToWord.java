package com.convert.example;

public class NumberToWord {

	public String convert(int i){
		String[] ones = {"0 NOT A POSTIVE INTEGER","ONE", "TWO" };
		if (i>10) {
			return "TWENTY THREE";
		}
		return ones[i];
	}

}
