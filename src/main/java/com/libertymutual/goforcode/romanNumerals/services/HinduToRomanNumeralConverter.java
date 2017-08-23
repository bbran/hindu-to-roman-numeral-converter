package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	private int[] denominations = new int[] {5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private String[] numerals = new String[] {"?", "M?", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public String convert(int input)	{	
		int remainingInput = input;
		String result = "";
		for (int i = 0; i < 15; i += 1)	{
			int num = remainingInput / denominations[i];
			remainingInput = remainingInput % denominations[i];
			if (num != 0)	{
				for (int j = 0; j < num; j += 1)	{
					result = result + numerals[i];
				}
			}
		}
		return result;
	}
}
