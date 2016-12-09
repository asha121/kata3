package com.convert.example;

import static com.convert.example.DigitFactory.getInstance;

/**
 * @author asha121 With recursion and member variable implementation
 */
public class NumberToWord {

	public String digitToWord(int number) {
		String word = "";
		if (number < 20) {
			word = getInstance("A").getInWord(number);
		} else if (number < 100) {
			word = getInstance("B").getInWord(number);
		} else if (number < 1000) {
			word = getInstance("C").getInWord(number);
		} else {
			word = getInstance("D").getInWord(number);
		}
		return word;
	}
}
